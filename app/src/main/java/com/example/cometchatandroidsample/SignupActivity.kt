package com.example.cometchatandroidsample

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import com.cometchat.chat.core.CometChat
import com.cometchat.chat.exceptions.CometChatException
import com.cometchat.chat.models.User
import com.google.android.material.textfield.TextInputEditText
import org.json.JSONObject

class SignupActivity : AppCompatActivity() {

    val TAG = "SignupActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        initEventHandlers()
    }

    private fun initEventHandlers() {
        val loginButton = this.findViewById<AppCompatButton>(R.id.signup_button)
        loginButton.setOnClickListener {
            val username = this.findViewById<TextInputEditText>(R.id.userId)
            val name = this.findViewById<TextInputEditText>(R.id.nameInput)
            val email = this.findViewById<TextInputEditText>(R.id.emailInput)
            // use password while registering with your backend system
            val password = this.findViewById<TextInputEditText>(R.id.passwordInput)
            createUser(uid = username.text.toString(),
                name = name.text.toString(),
                email = email.text.toString())
        }
    }

    private fun createUser(uid: String,
                           name: String,
                           email: String) {
        val user = User()
        user.uid = uid
        user.name = name

        user.metadata = JSONObject().put("email", email)

        CometChat.createUser(user, Constants.AUTH_KEY, object : CometChat.CallbackListener<User>() {
            override fun onSuccess(user: User) {
                Log.d("createUser", user.toString())
                CometChat.login(uid, Constants.AUTH_KEY, object : CometChat.CallbackListener<User>() {
                    override fun onSuccess(p0: User?) {
                        Log.d(TAG, "Login Successful : " + p0?.toString())
                        startActivity(Intent(this@SignupActivity, ConversationsActivity::class.java))
                    }

                    override fun onError(p0: CometChatException?) {
                        Log.d(TAG, "Login failed with exception: " + p0?.message)
                    }
                })
            }

            override fun onError(e: CometChatException) {
                Log.e("createUser", e.message ?: "Error occurred")
            }
        })
    }
}
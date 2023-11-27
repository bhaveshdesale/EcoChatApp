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
            val uid = this.findViewById<TextInputEditText>(R.id.userId)
            val username = this.findViewById<TextInputEditText>(R.id.username)
            createUser(uid = uid.text.toString(), name = username.text.toString())
        }
    }

    private fun createUser(uid: String, name: String) {
        val user = User()
        user.uid = uid
        user.name = name

        CometChat.createUser(user, Constants.AUTH_KEY, object : CometChat.CallbackListener<User>() {
            override fun onSuccess(user: User) {
                Log.d("createUser", user.toString())
                loginUser(uid = uid)
            }

            override fun onError(e: CometChatException) {
                Log.e("createUser", e.message ?: "Error occurred")
            }
        })
    }

    private fun loginUser(uid: String) {
        CometChat.login(uid, Constants.AUTH_KEY, object : CometChat.CallbackListener<User>() {
            override fun onSuccess(p0: User?) {
                Log.d(TAG, "Login Successful : " + p0?.toString())
            }

            override fun onError(p0: CometChatException?) {
                Log.d(TAG, "Login failed with exception: " + p0?.message)
            }
        })

        registerPushToken()
        startActivity(Intent(this@SignupActivity, ConversationsActivity::class.java))
    }

    private fun registerPushToken() {
        MyFirebaseMessagingService.token?.let {
            CometChat
                .registerTokenForPushNotification(
                    it,
                    object : CometChat.CallbackListener<String?>() {
                        override fun onSuccess(s: String?) {

                        }

                        override fun onError(e: CometChatException) {
                            Log.e(TAG, e.message ?: "Error occurred")
                        }
                    })
        }
    }
}
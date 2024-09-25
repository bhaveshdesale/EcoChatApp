🌍 EcoChat - Chat to Save Nature 🌿
Welcome to EcoChat, an innovative messaging platform designed to create a community of eco-conscious individuals. Share ideas, discuss sustainable living, and promote environmental well-being through real-time conversations.


“Chat to Save Nature”

📖 Project Description
EcoChat is a powerful platform for fostering discussions on sustainability and eco-friendly habits. By leveraging CometChat’s SDK and UI kits, users can participate in themed chat rooms, organize green initiatives, and exchange ideas in real-time. The app aims to inspire eco-conscious lifestyles and encourage collaboration on environmental challenges.

✨ Why EcoChat?
Build meaningful discussions on environmental topics.
Access themed chat rooms focused on eco-friendly habits.
Participate in activities and earn rewards for making a positive environmental impact.

🚀 Key Features
Real-Time Messaging: Communicate instantly using the CometChat SDK, with support for text, images, videos, and group chats.
Themed Chat Rooms: Join chat rooms focused on topics like waste reduction, energy-saving tips, and sustainable living.
Eco-Friendly Rewards System: Earn rewards for contributing valuable ideas and organizing environmental activities.
Push Notifications: Get real-time updates and eco-challenge alerts through Firebase-powered notifications.
Customizable Profile: Personalize your profile with pictures and preferences.
Location-Based Group Chats: Collaborate with local environmental groups on community-driven initiatives.

🛠️ Setup Instructions
Pre-requisites
Ensure you have the following installed before setting up EcoChat:

Android Studio (latest version)
Kotlin (for development)
Firebase Account (for push notifications)
Git (for version control)
Steps to Set Up Locally
Clone the Repository:

bash
Copy code
git clone https://github.com/your-username/EcoChat.git
Open the Project:

Open the cloned repository in Android Studio.
Configure Firebase:

Create a Firebase project.
Download the google-services.json file and place it in the app directory.
Set up Firebase Cloud Messaging (FCM) for push notifications.
Install Dependencies: In the build.gradle file, ensure the following dependencies are included:

gradle
Copy code
implementation 'com.cometchat:pro-android-chat-sdk:3.x.x'
implementation 'com.google.firebase:firebase-messaging:23.0.0'
Run the App:

Connect an Android device or use an emulator.
Build and run the project by pressing the green play button in Android Studio.
Optional Customizations
Modify chat rooms, themes, or add your own eco-challenges by tweaking the app’s data models.

📑 Additional Documentation
Splash Screen
Description: The app launches with a splash screen showcasing the EcoChat logo and the slogan “Chat to Save Nature.”
Technology: Implemented using a Handler and Intent to transition to the main activity after a 3-second delay.
User Interface Breakdown:
MainActivity: The central hub for users to access chat rooms, view profiles, and explore eco-friendly tips.
Login/Signup: Firebase-powered secure authentication to handle user logins and registrations.
ConversationsActivity: A robust chat interface for real-time messaging and media sharing.
Visual Material:

App Architecture Overview

🎥 Demo Video
Check out our demo video highlighting EcoChat’s main features:
👉 EcoChat Demo

🛠️ Future Improvements
Dark Mode Support: Allow users to toggle between light and dark themes.
Multi-Language Support: Add support for multiple languages to cater to a global audience.
Group Video Calls: Integrate video calling functionality using CometChat’s video SDK to enable face-to-face conversations.
🤝 Contributing
We welcome contributions to enhance EcoChat! Feel free to submit a pull request or report an issue in the repository.

📄 License
This project is licensed under the MIT License - see the LICENSE file for details.

1. Project Description
EcoChat is an innovative messaging platform focused on building a community around environmental consciousness. Users can engage in discussions, share ideas, and promote eco-friendly habits in their daily lives through real-time communication. By leveraging CometChat's SDK and UI kits, this app aims to facilitate discussions on sustainability and environmental issues with a friendly and interactive chat interface.

The project is designed to encourage users to adopt eco-conscious lifestyles, exchange ideas, and organize group efforts to tackle environmental challenges.

2. Key Features
Real-Time Messaging
Users can chat in real-time using CometChat SDK with seamless messaging features like text, media sharing, and group discussions.

Themed Chat Rooms
The app features chat rooms focused on specific environmental topics such as waste reduction, energy-saving tips, sustainable living, and more.

Eco-Friendly Rewards System
Users can earn rewards by participating in discussions, sharing eco-friendly ideas, and organizing activities that contribute to environmental protection.

Push Notifications
Firebase integration allows push notifications for message updates and eco-challenges.

Customizable Profile
Users can set up their own profile, add profile pictures, and personalize their user experience.

Location-Based Group Chats
Users can find or create local environmental groups to collaborate on local green initiatives.

3. Setup Instructions
Pre-requisites:
Before setting up the project, ensure you have the following installed:

Android Studio (latest version)
Kotlin (for app development)
Firebase account for push notifications
Git installed for version control
Steps to Set Up the Project Locally:
Clone the Repository

bash
Copy code
git clone https://github.com/your-username/EcoChat.git
Open the Project Open the cloned project in Android Studio.

Configure Firebase

Set up a Firebase project.
Download the google-services.json file and place it in your app directory.
Configure Firebase Cloud Messaging (FCM) for push notifications.
Install Dependencies In build.gradle, ensure the following dependencies are present:

gradle
Copy code
implementation 'com.cometchat:pro-android-chat-sdk:3.x.x'
implementation 'com.google.firebase:firebase-messaging:23.0.0'
Run the App

Connect an Android device or use an emulator.
Build and run the project by clicking the green play button in Android Studio.
Optional: Customizations
You can modify the chat rooms, themes, or add your own eco-challenges and rewards system by tweaking the app's data models in the repository.
4. Additional Documentation
Splash Screen
Description: Displays the logo and slogan “Chat to Save Nature” with a beautiful animation before navigating to the main chat interface.
Technology Used: Splash screen logic using Handler and Intent to navigate after 3 seconds of display.
User Interface
MainActivity: The main dashboard where users access chat rooms, user profiles, and eco-friendly tips.
Login/Signup: Secure user authentication using Firebase for handling user signups and logins.
ConversationsActivity: Main chat interface where users can have real-time conversations, including sending images, videos, and text.
Visual Material
Here's a visual representation of the app's architecture:

Demo Video
A brief video demonstration of EcoChat's main features can be found here: Demo Link.
5. Future Improvements
Dark Mode Support: Allow users to switch between light and dark modes for better UI experience.
Multi-Language Support: Adding support for multiple languages to accommodate a broader user base.
Group Video Calls: Implementing video calling functionality using CometChat's video SDK.

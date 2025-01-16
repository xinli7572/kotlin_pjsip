# Kotlin PJSIP

This repository demonstrates how to integrate and use PJSIP (a free and open-source multimedia communication library) in Android projects with Kotlin. PJSIP provides an API for audio, video, and instant messaging, making it ideal for building SIP-based communication apps.

## Features

- **PJSIP Integration**: Integrates the PJSIP library with Kotlin for easy SIP and multimedia communications.
- **Audio/Video Calls**: Supports both audio and video calls using SIP protocols.
- **Instant Messaging**: Supports instant messaging functionality over SIP.
- **Kotlin-Based**: The project leverages Kotlin for modern Android development.

## Getting Started

### 1. Clone the Repository

First, clone the repository to your local machine:

```bash
git clone https://github.com/xinli7572/kotlin_pjsip.git
```

### 2. Set Up the Android Environment
To get started with this project, ensure you have the Android development environment set up:

- Install Android Studio from here.
- Set up the necessary Android SDK tools and NDK (Native Development Kit).
- Ensure that your environment variables are properly configured.
### 3. Set Up PJSIP
The project relies on PJSIP for SIP communication, which needs to be compiled and linked to the Android project. Follow these steps:

- Download PJSIP: Download the PJSIP library from the official PJSIP website.
- Build PJSIP for Android: You will need to build the PJSIP library specifically for Android. Follow the instructions provided in the PJSIP documentation for building it on Android.
- Link PJSIP to Your Project: After building PJSIP, link the generated libraries (such as .so files) to your Android project in the appropriate directories (jniLibs or equivalent).

### 4. Build and Run the Project
To build and run the project:

- Connect an Android Device or Use an Emulator: Ensure that you have access to a camera and microphone for testing.
- Select the Target Device in Android Studio: Choose your device from the available list.
- Run the Project: Click Run or use the shortcut Shift + F10 to build and install the app on the device.
- Test SIP Communication: Once the app is launched, test SIP-based functionalities like making calls, receiving calls, or sending messages.

## Code Overview
### MainActivity
MainActivity.kt serves as the entry point of the app. It is responsible for:

- Initializing PJSIP to handle SIP communication.
- Setting up the user interface for SIP call handling.
- Handling incoming and outgoing SIP calls.
- Sending and receiving instant messages via SIP.
### PJSIP Integration
This project integrates the PJSIP library with Android using JNI (Java Native Interface). The PJSIP native library (.so) is loaded at the start, and the required functionalities such as making and receiving calls, sending messages, and managing SIP accounts are implemented.

### Example Usage
To register a SIP account and make a call:

```bash
kotlin

// Register SIP Account
val sipAccount = "sip:username@domain.com"
pjsip.register(sipAccount)

// Make a SIP Call
val sipUri = "sip:otherUser@domain.com"
pjsip.makeCall(sipUri)
```

### Customization
### Change SIP Credentials
To use your own SIP server, modify the SIP registration credentials in MainActivity.kt:
```bash
kotlin
val sipAccount = "sip:your_username@your_sip_server.com"
```

### Modify Call Settings
Adjust the audio/video call settings by modifying the relevant methods in the PjsipHelper or MainActivity.kt. You can change parameters such as video resolution, audio codecs, etc.

### Add More Features
The PJSIP library supports a wide variety of features, such as:

- Call transfer
- Video conferencing
- Call hold
- Voicemail integration
You can extend the app by adding these features using the PJSIP API.

### Technologies Used
- Kotlin: The primary language used for Android development in this project.
- PJSIP: A powerful multimedia communication library used for handling SIP-based communication.
- Android: The platform used to run and test the app.
- JNI: Used to interface between Kotlin (Java) and the PJSIP native library.
### Contributions
Feel free to fork this repository and contribute! You can:

- Fix bugs or improve performance.
-  Add new features or enhancements.
- Improve documentation or the user interface.



https://github.com/user-attachments/assets/54e52577-c528-450c-9faa-09437709367c


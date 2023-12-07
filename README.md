  <h1>Space Chat</h1>

  <p>This repository contains the source code and resources for a real-time chat application developed for Android devices, following Clean Architecture principles and utilizing the MVVM (Model-View-ViewModel) architectural pattern.</p>

  <h2>Overview</h2>

  <p>The Space Chat is built to provide users with a robust, scalable, and maintainable messaging experience. It features:</p>
  <ul>
    <li><strong>Real-Time Messaging:</strong> Seamless exchange of messages with friends. </li>
    <li><strong>User Authentication:</strong> Secure login and user authentication process.</li>
    <li><strong>User Profiles:</strong> Management and viewing of user profiles.</li>
    <li><strong>Media Sharing:</strong> Capability to share images, videos, and documents within the chat.</li>
  </ul>

  <h2>Architecture & Design Patterns</h2>
  <p>The app is built using:</p>
  <ul>
    <li><strong>Clean Architecture:</strong> Embraces the principles of Uncle Bob's Clean Architecture, separating concerns into distinct layers: Domain, Data, and Presentation.</li>
    <li><strong>MVVM Pattern:</strong> Utilizes the Model-View-ViewModel pattern to separate the UI, business logic, and data, ensuring a more maintainable and testable codebase.</li>
  </ul>

  <h2>Features</h2>
  <p>The app includes several features:</p>
  <ul>
    <li><strong>User Authentication:</strong> Integrates Firebase Authentication for secure login and registration.</li>
    <li><strong>Real-Time Database:</strong> Firebase Realtime Database integration for instant message updates.</li>
    <li><strong>Material Design:</strong> Follows Android's Material Design guidelines for an intuitive and user-friendly interface.</li>
    <li><strong>Push Notifications:</strong> Integration with Firebase Cloud Messaging for push notifications.</li>
    <li><strong>Media Sharing:</strong> Enables users to share various media files within the chat interface.</li>
  </ul>

  <h2>Screenshots</h2>
  
 <table>
  <tr>
    <td>Splash Screen</td>
     <td>SigIn Screen</td>
     <td>SignUp Screen</td>
     <td>SignUp Screen</td>
  </tr>
  <tr>
    <td><img src="https://github.com/SajidEqubal/SpaceChat/assets/54468833/77efe91b-673c-4224-8b46-42a205febf75" width=220 height=420></td>
    <td><img src="https://github.com/SajidEqubal/SpaceChat/assets/54468833/77de0882-efe9-4796-911a-c198caa56dfd" width=220 height=420></td>
    <td><img src="https://github.com/SajidEqubal/SpaceChat/assets/54468833/4979ce35-2160-441a-92f6-d966f81194e6" width=220 height=420></td>
    <td><img src="https://github.com/SajidEqubal/SpaceChat/assets/54468833/b622ecf4-263b-457f-a1e9-29226287d5e5" width=220 height=420></td>
  </tr>

   <tr>
    <td>User Select</td>
     <td>Chat Screen</td>
  </tr>
   <tr>
    <td><img src="https://github.com/SajidEqubal/SpaceChat/assets/54468833/237a1370-cb1b-473f-8b29-ccfc23152cd7" width=220 height=420></td>
    <td><img src="https://github.com/SajidEqubal/SpaceChat/assets/54468833/d32c27ce-c7b5-4933-b00d-ddb105be6534" width=220 height=420></td>
  </tr>
 </table>

  <h2>Getting Started</h2>
  <p>To run this application locally:</p>
  <ol>
    <li>Clone this repository: <code>git clone https://github.com/SajidEqubal/SpaceChat.git</code></li>
    <li>Open the project in Android Studio.</li>
    <li>Set up Firebase project and add <code>google-services.json</code> file to the project.</li>
    <li>Build and run the application on an Android device or emulator.</li>
  </ol>

  <h2>Technologies Used</h2>
  <p>The app is built using:</p>
  <ul>
    <li><strong>Java:</strong> Core programming language for Android app development.</li>
    <li><strong>Firebase:</strong> Backend services including Authentication, Realtime Database, and Cloud Messaging.</li>
    <li><strong>Android Studio:</strong> IDE used for Android application development.</li>
  </ul>

  <h2>Project Structure</h2>
  <p>The project structure follows the principles of Clean Architecture:</p>
  <ul>
    <li><strong>Domain Layer:</strong> Contains business logic and use cases.</li>
    <li><strong>Data Layer:</strong> Manages data sources and repositories.</li>
    <li><strong>Presentation Layer:</strong> Includes the UI components, ViewModels, and interaction with the domain layer.</li>
  </ul>

  <h2>License</h2>
  <p>This project is licensed under the <a href="LICENSE">MIT License</a>.</p>

  <h2>Acknowledgements</h2>
  <p>Special thanks to <a href="https://firebase.google.com/">Firebase</a> for their powerful suite of tools. This project was inspired by the need for a user-friendly and efficient messaging app for Android users.</p>


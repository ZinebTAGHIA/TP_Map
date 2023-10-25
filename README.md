# Android GPS Tracker App
This Android application allows users to track their GPS location and store it on a server built with Spring. It includes two main components:

- Backend (Spring)
  - The backend of the application is developed using Spring framework.
  - It includes an entity Position with attributes latitude, longitude, date, and imei.
  - Data is stored in a database and can be accessed through RESTful API endpoints.
- Android App
  - The Android app enables users to view their current location on a map.
  - It requests necessary permissions for GPS location and internet access.
  - The app sends the location data to the Spring backend via HTTP POST requests.
  - It also retrieves stored location data from the server and displays it on the map.
- Features
  - Track and store GPS location with date and device IMEI.
  - Display current location on a map.
  - View previously saved locations on the map.
  - Intuitive user interface for easy navigation.
- How to Use
  - Install the Android app on your device.
  - Grant necessary permissions for GPS and internet access.
  - Launch the app and click "Display Map" to view your current location.
  - The app will periodically update your location and send it to the server.
  - Previously saved locations can be viewed on the map.
- Getting Started
  - Backend (Spring)
    - Clone this repository.
    - Set up a database and configure database connection in application.properties.
    - Build and run the Spring application.
  - Android App
    - Open the Android project in Android Studio.
    - Replace insertUrl in MainActivity.java with your backend API endpoint.
    - Ensure your device has necessary permissions for location and internet access.
    - Build and run the Android application.
- Dependencies
  - Volley - HTTP library for Android.
  - Google Maps SDK - For displaying maps in Android.
- Demo Video
  - I'm using the "GPS Emulator" app to simulate different GPS coordinates without physically changing my device's location.
https://github.com/ZinebTAGHIA/TP_Map/assets/102872040/725a904e-051d-4954-a4e3-219c056ed779


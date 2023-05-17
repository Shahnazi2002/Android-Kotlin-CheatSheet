// https://developer.android.com/training/data-storage/room

// Setup (https://developer.android.com/training/data-storage/room#setup)
// To use Room database, add the following dependencies to app's build.gradle file:
dependencies {
    def room_version = "2.5.1"
    
    ...
    implementation "androidx.room:room-runtime:$room_version"
    annotationProcessor "androidx.room:room-compiler:$room_version"
}


// Create a package for database files and add this files:
// New "Data class" for example: MyData
// New "Interface" for example: MyDao
// New "Abstract class" for example: MyDatabase

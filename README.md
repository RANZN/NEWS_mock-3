# NEWS_mock-3
* Daily News Update
* Offline Support
<h3>DEMO</h3>

<img height='450' src="https://user-images.githubusercontent.com/40376163/150242671-058c5283-5aa3-4308-adc5-c9e6e05445bf.gif"/>


# Open Source Library
* [Retrofit](https://square.github.io/retrofit/)
* [Glide](https://github.com/bumptech/glide)
* [Kotlin-Lifecycle](https://developer.android.com/jetpack/androidx/releases/lifecycle)
* [Room Database](https://developer.android.com/training/data-storage/room)
* [Coroutine](https://kotlinlang.org/docs/coroutines-overview.html)

# Things we used while making this application
* Room DataBase
* RecyclerView
* MVVM
* Data Binding
* Kotlin Lifecycle
* Kotlin Coroutines

# Tech Stack ✨
* Kotlin
* Android Studio


# Clone this Repo To Your System Using Android Studio
* Open your Android Studio then go to the File > New > Project from Version Control.
* After clicking on the Project from Version Control a pop-up screen will arise. In the Version control choose Git from the drop-down menu.
* Then at last paste the link in the URL and choose your Directory. Click on the Clone button and you are done.


# Dependencies
```
    // Retrofit & OkHttp
    implementation 'com.squareup.retrofit2:retrofit:2.9.0'
    implementation 'com.squareup.retrofit2:converter-gson:2.5.0'
    implementation 'com.squareup.okhttp3:logging-interceptor:3.12.3'

    //Coroutine
    implementation "org.jetbrains.kotlinx:kotlinx-coroutines-android:1.4.1"
    implementation "org.jetbrains.kotlinx:kotlinx-coroutines-core:1.4.2"

    //lifecycle
    implementation 'androidx.lifecycle:lifecycle-viewmodel-ktx:2.2.0'
    implementation 'androidx.lifecycle:lifecycle-runtime-ktx:2.2.0'
    implementation 'androidx.lifecycle:lifecycle-livedata-ktx:2.2.0'

    //Glide
    implementation 'com.github.bumptech.glide:glide:4.9.0'

    //kapt
    kapt 'androidx.room:room-compiler:2.1.0'

    // Kotlin Extensions and Coroutines support for Room
    implementation "androidx.room:room-ktx:2.2.5"

    def depVersion = "2.3.0"

    implementation "androidx.room:room-runtime:$depVersion"
    annotationProcessor "androidx.room:room-compiler:$depVersion"
```

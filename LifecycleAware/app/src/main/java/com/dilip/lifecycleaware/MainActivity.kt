package com.dilip.lifecycleaware

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lifecycle.addObserver(Observer())
        Log.d("MAIN", "Activity - onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("MAIN", "Activity - onStart")
        // Perform any necessary actions when the activity starts
    }

    override fun onPause() {
        super.onPause()
        Log.d("MAIN", "Activity - onPause")
        // Save critical data or release resources when the activity is partially obscured
    }

    override fun onResume() {
        super.onResume()
        Log.d("MAIN", "Activity - onResume")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MAIN", "Activity - onStop")
        // Stop animations, release resources, and save persistent data
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MAIN", "Activity - onDestroy")
        // Clean up any remaining resources and perform final cleanup
    }

}
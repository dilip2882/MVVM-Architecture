package com.dilip.viewmodelexample

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    private lateinit var textCounter: TextView
    private lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize the ViewModel
        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        textCounter = findViewById(R.id.textCounter)  // Find the TextView in the layout

        setText() // Set the initial text value based on ViewModel data
    }

    // Called when the "Increment" button is clicked
    fun increment(view: View) {
        mainViewModel.increment() // Increment the count in the ViewModel

        setText() // Update the TextView to reflect the new count
    }

    // Update the TextView with the current count from the ViewModel
    private fun setText() {
        textCounter.text = mainViewModel.count.toString()
    }
}

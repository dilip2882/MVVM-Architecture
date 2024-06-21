package com.dilip.livedataexample

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    // Declare a property to hold an instance of MainViewModel.
    private lateinit var mainViewModel: MainViewModel

    // Declare properties for UI elements.
    private val factsTextView: TextView
        get() = findViewById(R.id.factsTextview)

    private val btnUpdate: Button
        get() = findViewById(R.id.btnUpdate)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize the MainViewModel.
        mainViewModel = ViewModelProvider(this)[MainViewModel::class.java]

        // Observe changes in the LiveData and update the UI accordingly.
        mainViewModel.factsLiveData.observe(this, Observer {
            factsTextView.text = it
        })

        // Set a click listener for the update button.
        btnUpdate.setOnClickListener {
            mainViewModel.updateLiveData()
        }
    }
}

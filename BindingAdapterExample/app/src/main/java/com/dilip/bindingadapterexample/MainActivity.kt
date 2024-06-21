package com.dilip.bindingadapterexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.dilip.bindingadapterexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val post = Post("Introduction to kotlin",
            "Dilip Patel",
            "https://github.com/bumptech/glide/blob/master/static/glide_logo.png")

        binding.post = post
    }
}
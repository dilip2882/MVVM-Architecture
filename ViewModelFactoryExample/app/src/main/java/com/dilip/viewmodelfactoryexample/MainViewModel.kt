package com.dilip.viewmodelfactoryexample

import androidx.lifecycle.ViewModel

class MainViewModel(val initialValue: Int) : ViewModel() {

    var count: Int = initialValue  // using MainViewModelFactory

    fun increment() {
        count++
    }
}
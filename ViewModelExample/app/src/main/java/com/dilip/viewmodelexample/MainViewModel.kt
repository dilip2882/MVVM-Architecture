package com.dilip.viewmodelexample

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    var count = 0

    fun increment() {
        count++
    }
}
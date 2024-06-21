package com.dilip.twowaydatabindingwithlivedataexample

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class MainViewModel : ViewModel() {

    private val quoteLiveDataObject = MutableLiveData<String>("This is a fact")

    // Expose the LiveData object as a read-only property.
    val quoteLiveData: LiveData<String>
        get() = quoteLiveDataObject

    // This function updates the value of quoteLiveDataObject.
    // It changes the fact to "Another fact".
    fun updateQuote() {
        quoteLiveDataObject.value = "Another fact"
    }
}

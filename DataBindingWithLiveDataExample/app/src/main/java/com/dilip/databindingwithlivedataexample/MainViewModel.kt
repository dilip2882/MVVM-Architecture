package com.dilip.databindingwithlivedataexample

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    //    val factsLiveData = MutableLiveData<String>("This is a fact")

    // This is a LiveData object that holds a string value.
    // It will be used to observe and update the facts.
    private val quoteLiveDataObject = MutableLiveData<String>("This is a fact")

    // Expose the LiveData object as a read-only property.
    val quoteLiveData: LiveData<String>
        get() = quoteLiveDataObject

    // This function updates the value of factsLiveDataObject.
    // It changes the fact to "Another fact".
    fun updateQuote() {
        quoteLiveDataObject.value = "Another fact"
    }
}

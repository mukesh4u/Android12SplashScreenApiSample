package com.example.android12splashscreenapi

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {
    var dataLoaded: Boolean = false

    fun mockDataLoading(): Boolean {
        viewModelScope.launch {
            delay(5000)
            dataLoaded = true
        }
        return dataLoaded
    }
}

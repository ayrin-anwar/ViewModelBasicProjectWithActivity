package com.example.viewmodelproject

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel(application: Application): AndroidViewModel(application) {
    var count = MutableLiveData<Int>()
    init{
        count.value = 0
    }
    fun updateCount() {
        count.value = (count.value)?.plus(1)
    }

}
package com.sypark.bus.viewmodel

import androidx.lifecycle.MutableLiveData
import com.sypark.bus.base.BaseViewModel

class SearchViewModel : BaseViewModel() {

    private val _busNumber = MutableLiveData<String>()
    val busNumber: MutableLiveData<String>
        get() = _busNumber

    fun setBusNumber(busNumber: String) = _busNumber.postValue(busNumber)

}
package kr.eunicehong.pullrequestsample.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kr.eunicehong.pullrequestsample.model.datasource.GreetingMessageLocalDataSource
import kr.eunicehong.pullrequestsample.model.entity.Hello

class GreetingViewModel(private val dataSource: GreetingMessageLocalDataSource) : ViewModel() {

    val currentGreetingMessageLanguage: LiveData<Hello>
        get() = _currentGreetingMessageLanguage
    
    private val _currentGreetingMessageLanguage = MutableLiveData<Hello>()

    fun loadNewHello() {
        _currentGreetingMessageLanguage.postValue(getRandomHello(currentGreetingMessageLanguage.value?.language))
    }

    private fun getRandomHello(exceptionKey: String? = null): Hello {
        return dataSource.getRandomHelloMessage(exceptionKey = exceptionKey)
    }
}
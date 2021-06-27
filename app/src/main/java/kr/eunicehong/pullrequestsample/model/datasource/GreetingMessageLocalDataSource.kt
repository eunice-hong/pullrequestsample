package kr.eunicehong.pullrequestsample.model.datasource

import kr.eunicehong.pullrequestsample.model.entity.Hello

interface GreetingMessageLocalDataSource {
    fun getHelloMessageList():List<Hello>

    fun getRandomHelloMessage(exceptionKey: String? = null): Hello
}
package kr.eunicehong.pullrequestsample.model.entity

data class Bye(override val language: String, override val message: String) : Greeting()

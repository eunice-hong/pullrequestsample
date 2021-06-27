package kr.eunicehong.pullrequestsample.model.entity

data class Hello(override val language: String, override val message: String) : Greeting()

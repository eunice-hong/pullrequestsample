package kr.eunicehong.pullrequestsample.model.entity

data class Sorry(override val language: String, override val message: String) : Greeting()

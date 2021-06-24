package kr.eunicehong.pullrequestsample.model.entity

data class Thank(override val language: String, override val message: String) : Greeting()

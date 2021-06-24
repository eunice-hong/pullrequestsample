package kr.eunicehong.pullrequestsample.model.datasource

import kr.eunicehong.pullrequestsample.model.entity.Hello

class GreetingMessageLocalDataSourceImpl : GreetingMessageLocalDataSource {
    override fun getHelloMessageList(): List<Hello> {
        return helloList
    }

    override fun getRandomHelloMessage(exceptionKey: String?): Hello {
        return helloList.toMutableList().apply {
            removeIf { it.language == exceptionKey }
        }.random()
    }

    private val helloList = listOf(
        Hello(language = "Arabic", message = "Marhaba"),
        Hello(language = "Bavarian", message = "Grüß Gott"),
        Hello(language = "Austrian", message = "Grüß Gott"),
        Hello(language = "German", message = "Grüß Gott"),
        Hello(language = "Bengali", message = "Namaskar"),
        Hello(language = "Bulgarian", message = "Zdraveite"),
        Hello(language = "Catalan", message = "Hola"),
        Hello(language = "Chamorro", message = "Hafa adai"),
        Hello(language = "Chinese", message = "Nǐ hǎo"),
        Hello(language = "Croatian", message = "Dobro Jutro = Good morning"),
        Hello(language = "Danish", message = "Dobar dan = Good day"),
        Hello(language = "Dutch", message = "Dobra većer = Good evening"),
        Hello(language = "Finnish", message = "God dag"),
        Hello(language = "French", message = "Hoi = Hi Hallo = Hello"),
        Hello(language = "Gaeilge", message = "hyvää päivää"),
        Hello(language = "German", message = "Bonjour"),
        Hello(language = "Greek", message = "Dia dhuit"),
        Hello(language = "Hebrew", message = "Guten tag"),
        Hello(language = "Hindi", message = "Yasou"),
        Hello(language = "Hungarian", message = "Shalom"),
        Hello(language = "Icelandic", message = "Namaste"),
        Hello(language = "Igbo", message = "Jo napot"),
        Hello(language = "Indonesian", message = "Góðan dag"),
        Hello(language = "Italian", message = "Nde-ewo"),
        Hello(language = "Japanese", message = "Selamat siang"),
        Hello(language = "Korean", message = "Salve"),
        Hello(language = "Latin", message = "Konnichiwa"),
        Hello(language = "Lithuanian", message = "Ahn nyong ha se yo"),
        Hello(language = "Luxembourgish", message = "Salve"),
        Hello(language = "Maltese", message = "Sveiki"),
        Hello(language = "Nahuatl", message = "Moïen"),
        Hello(language = "Nepali", message = "Bonġu"),
        Hello(language = "Norwegian", message = "Niltze"),
        Hello(language = "Persian", message = "Namastē"),
        Hello(language = "Polish", message = "Hallo"),
        Hello(language = "Portuguese", message = "Salam"),
        Hello(language = "Romanian", message = "Cześć"),
        Hello(language = "Russian", message = "Olá"),
        Hello(language = "Serbian", message = "Bună ziua"),
        Hello(language = "Slovak", message = "Zdravstvuyte"),
        Hello(language = "Spanish", message = "Zdravo"),
        Hello(language = "Swahili", message = "Ahoj"),
        Hello(language = "Swedish", message = "Hola"),
        Hello(language = "Tahitian", message = "Hujambo"),
        Hello(language = "Thai", message = "Hallå"),
        Hello(language = "Tsonga", message = "Ia orna"),
        Hello(language = "Turkish", message = "Sawasdee"),
        Hello(language = "Ukrainian", message = "Avuxeni"),
        Hello(language = "Urdu", message = "Merhaba"),
        Hello(language = "Vietnamese", message = "Zdravstvuyte"),
        Hello(language = "Welsh", message = "Assalamo aleikum"),
        Hello(language = "Zulu", message = "xin chào"),
    )
}

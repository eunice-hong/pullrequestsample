package kr.eunicehong.pullrequestsample

import kr.eunicehong.pullrequestsample.model.datasource.GreetingMessageLocalDataSourceImpl
import kr.eunicehong.pullrequestsample.model.entity.Hello

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class LocalDataSourceUnitTest {
    private val localDataSource = GreetingMessageLocalDataSourceImpl()

    @Test
    fun getRandomHelloMessage_checkBlank() {
        val helloMessage = localDataSource.getRandomHelloMessage()
        assertTrue(helloMessage.language.isNotBlank())
        assertTrue(helloMessage.message.isNotBlank())
    }

    @Test
    fun getHelloMessageList_exist() {
        val helloMessageList = localDataSource.getHelloMessageList()
        assertFalse(helloMessageList.isEmpty())
    }

    @Test
    fun getRandomHelloMessage_isRandom() {
        val helloMessageList = localDataSource.getHelloMessageList()
        var prevMessage: Hello? = null
        repeat(helloMessageList.size / 2) {
            val helloMessage = localDataSource.getRandomHelloMessage(prevMessage?.language)
            assertNotEquals(helloMessage, prevMessage)
            prevMessage = helloMessage
        }
    }
}
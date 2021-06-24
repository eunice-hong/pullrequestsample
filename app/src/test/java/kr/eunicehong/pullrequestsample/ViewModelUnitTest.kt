package kr.eunicehong.pullrequestsample

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import kr.eunicehong.pullrequestsample.model.datasource.GreetingMessageLocalDataSourceImpl
import kr.eunicehong.pullrequestsample.model.entity.Hello
import kr.eunicehong.pullrequestsample.viewmodel.GreetingViewModel

import org.junit.Test

import org.junit.Assert.*
import org.junit.Rule
import org.junit.rules.TestRule
import org.mockito.Mockito

class ViewModelUnitTest {
    @get:Rule
    val rule: TestRule = InstantTaskExecutorRule()

    private val viewModel = GreetingViewModel(GreetingMessageLocalDataSourceImpl())

    @Test
    fun loadNewHello_checkRandomExceptions() {
        repeat(20) {
            val prevHelloMessage = viewModel.currentGreetingMessageLanguage.value
            viewModel.loadNewHello()
            val newHelloMessage = viewModel.currentGreetingMessageLanguage.value
            assertNotEquals(prevHelloMessage, newHelloMessage)
        }
    }
}
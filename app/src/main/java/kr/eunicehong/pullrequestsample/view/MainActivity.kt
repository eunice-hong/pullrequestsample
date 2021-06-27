package kr.eunicehong.pullrequestsample.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kr.eunicehong.pullrequestsample.R
import kr.eunicehong.pullrequestsample.model.datasource.GreetingMessageLocalDataSource
import kr.eunicehong.pullrequestsample.model.datasource.GreetingMessageLocalDataSourceImpl
import kr.eunicehong.pullrequestsample.viewmodel.GreetingViewModel

class MainActivity : AppCompatActivity() {

    private val dataSource: GreetingMessageLocalDataSource = GreetingMessageLocalDataSourceImpl()
    private val viewModel: GreetingViewModel = GreetingViewModel(dataSource)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val messageView = findViewById<TextView>(R.id.message)
        val messageChangeView = findViewById<Button>(R.id.change_message_button)
        messageChangeView.setOnClickListener {
            viewModel.loadNewHello()
        }
        viewModel.currentGreetingMessageLanguage.observe(this) { hello ->
            messageView.text = hello.message
        }
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this, R.string.toast_greeting, Toast.LENGTH_LONG).show()
    }

    companion object {
        private const val HELLO_MSG = "Hello World!"
        private const val BYE_MSG = "Bye World!"
    }
}
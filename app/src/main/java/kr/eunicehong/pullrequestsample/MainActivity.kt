package kr.eunicehong.pullrequestsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val messageView = findViewById<TextView>(R.id.message)
        val messageChangeView = findViewById<Button>(R.id.change_message_button)
        messageChangeView.setOnClickListener {
            messageView.text = if (messageView.text?.trim()?.equals(HELLO_MSG) == true) {
                BYE_MSG
            } else {
                HELLO_MSG
            }
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
package toong.vn.androidkotlinhelloworld

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.webkit.WebView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
  lateinit var webView: WebView;


  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    val textView = findViewById<TextView>(R.id.text_hello)

    textView.text = "Hello World"
  }
}

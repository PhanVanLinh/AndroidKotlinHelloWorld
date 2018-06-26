package toong.vn.androidkotlinhelloworld

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

class FindViewByIdActivity : AppCompatActivity() {

  lateinit var textView2: TextView
  var textView3: TextView? = null

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_find_view_by_id)

    val textView = findViewById<TextView>(R.id.text_1)
    textView2 = findViewById(R.id.text_2)
    textView3 = findViewById(R.id.text_3)

    textView.text = "Text 1"
  }
}

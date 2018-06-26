package toong.vn.androidkotlinhelloworld

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import android.widget.Toast

/**
 * sad <br/>
 * das
 */
class ClickListenerActivity : AppCompatActivity() {

  lateinit var textView: TextView

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_click_listener)

    textView = findViewById(R.id.textview)
    textView.setOnClickListener {
      Toast.makeText(this@ClickListenerActivity, "s", Toast.LENGTH_SHORT).show();
    }
  }
}

package toong.vn.androidkotlinhelloworld

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import toong.vn.androidkotlinhelloworld.syntax.Range

class RangeActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_range)

    findViewById<TextView>(R.id.button_test).setOnClickListener{
      val range = Range()

      range.testInRange()

      range.iteratingOverARange()
    }
  }
}

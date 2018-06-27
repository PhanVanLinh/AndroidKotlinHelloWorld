package toong.vn.androidkotlinhelloworld

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import toong.vn.androidkotlinhelloworld.syntax.DefineFunction

class FunctionActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_loop)

    findViewById<TextView>(R.id.button_test).setOnClickListener {
      val function = DefineFunction()

      function.testDefaultArgumentValue()
      function.testDefaultMultipleArgumentValue(first = 1, third = 3)
    }
  }
}

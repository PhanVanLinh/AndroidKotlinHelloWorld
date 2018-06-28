package toong.vn.androidkotlinhelloworld

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import toong.vn.androidkotlinhelloworld.syntax.Loop

fun dasd(){

}

class LoopActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_loop)

    findViewById<TextView>(R.id.button_test).setOnClickListener{
      val loop = Loop()
      loop.forLoop()

      loop.forLoopIndex()

      loop.whileLoop()
    }
  }
}

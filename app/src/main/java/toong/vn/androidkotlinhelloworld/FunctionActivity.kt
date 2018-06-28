package toong.vn.androidkotlinhelloworld

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.TextView
import toong.vn.androidkotlinhelloworld.syntax.DefineFunction

class FunctionActivity : AppCompatActivity() {
  val TAG = "FunctionActivity"

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_function)

    findViewById<TextView>(R.id.button_test).setOnClickListener {
      val function = DefineFunction()

      function.testDefaultArgumentValue()
      function.testDefaultMultipleArgumentValue(first = 1, third = 3)

      function.testVararg("A", "B", "C")
    }

    findViewById<TextView>(R.id.button_test_higher_order_function).setOnClickListener {
      val items = listOf(2, 1, 3, 4, 5)

      val result = items.fold(0, { acc: Int, i: Int ->
        Log.i(TAG, "acc = $acc, i = $i, ")
        val result = acc + i
        Log.i(TAG, "result = $result")
        // the last expression in lamda is considered the return value
        result
      })

      Log.i(TAG, "final result = $result")


      // Parameter types in a lambda are optional if they can be inferred:
      val joinedToString = items.fold("Elements:", { acc, i -> acc + " " + i })
      Log.i(TAG, "joinedToString = $joinedToString")

      // Function references can also be used for higher-order function calls:
      val product = items.fold(1, Int::times)
      Log.i(TAG, "product = $product")
    }

    findViewById<TextView>(R.id.button_instantiating_instance_type).setOnClickListener {
      val result = runTransformation(repeats)
      Log.i(TAG, "result = $result")
    }

    findViewById<TextView>(R.id.button_invoke_function_type_instance).setOnClickListener {
      val stringPlus: (String, String) -> String = String::plus
      val intPlus: Int.(Int) -> Int = Int::plus

      Log.i(TAG, stringPlus.invoke("<--", "-->"))
      Log.i(TAG, stringPlus("Hello, ", "world!"))

      println(intPlus.invoke(1, 1))
      println(intPlus(1, 2))
      println(2.intPlus(1))
    }
  }

  fun runTransformation(f: (String, Int) -> String): String {
    return f("hello", 3)
  }

  val repeats: String.(Int) -> String = { times -> repeat(times) }
//  val twoParameters: (String, Int) -> String = repeat
}

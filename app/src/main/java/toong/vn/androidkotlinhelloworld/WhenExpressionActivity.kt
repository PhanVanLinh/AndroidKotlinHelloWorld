package toong.vn.androidkotlinhelloworld

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import toong.vn.androidkotlinhelloworld.syntax.WhenExpression

private const val TAG = "WhenExpressionActivity"

class WhenExpressionActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_when_expression)

    val whenExpression = WhenExpression()
    Log.i(TAG, whenExpression.describe(1))
    Log.i(TAG, whenExpression.describe(10L))
    Log.i(TAG, whenExpression.describe("Hello"))
  }
}

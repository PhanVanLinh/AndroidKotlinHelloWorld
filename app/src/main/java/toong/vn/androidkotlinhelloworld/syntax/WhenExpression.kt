package toong.vn.androidkotlinhelloworld.syntax

/**
 * Created by PhanVanLinh on 27/06/2018.
 * phanvanlinh.94vn@gmail.com
 */
class WhenExpression {

  fun describe(obj: Any): String = when (obj) {
    1 -> "One"
    "Hello" -> "Greeting"
    is Long -> "Long"
    !is String -> "Not a String"
    else -> "Unknown"
  }
}
package toong.vn.androidkotlinhelloworld.syntax

import android.util.Log

/**
 * Created by PhanVanLinh on 26/06/2018.
 * phanvanlinh.94vn@gmail.com
 */
class DefineFunction {
  val TAG = "DefineFunction"


  fun sum(a: Int, b: Int): Int {
    return a + b;
  }

  fun sum2(a: Int, b: Int) = a + b

  fun printSum(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a + b}")
  }

  fun printSum2(a: Int, b: Int) {
    println("sum of $a and $b is ${a + b}")
  }

  fun testDefaultArgumentValue(first: Int = 1) {
    Log.i(TAG, "first = $first")
  }

  fun testDefaultMultipleArgumentValue(first: Int, second: Int=2, third: Int) {
    Log.i(TAG, "first = $first")
    Log.i(TAG, "second = $second")
    Log.i(TAG, "third = $third")
  }

  fun double(x: Int): Int = x * 2
}
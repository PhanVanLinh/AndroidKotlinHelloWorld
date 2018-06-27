package toong.vn.androidkotlinhelloworld.syntax

import android.util.Log

/**
 * Created by PhanVanLinh on 27/06/2018.
 * phanvanlinh.94vn@gmail.com
 */
class Range {
  var TAG = "RANGE"

  fun testInRange() {
    val x = 10
    val y = 9

    if (x in 1..y + 1) {
      Log.i(TAG, "fits in range")
    }
  }

  fun iteratingOverARange() {
    for (x in 1..10) {
      Log.i(TAG, "$x")
    }

    Log.i(TAG, "=============")

    for (x in 1..10 step 2) {
      Log.i(TAG, "$x")
    }

    Log.i(TAG, "=============")

    for (x in 9 downTo 0 step 3) {
      Log.i(TAG, "$x")
      if (x == 6) {
        break
      }
    }
  }
}
package toong.vn.androidkotlinhelloworld.syntax

import android.util.Log

/**
 * Created by PhanVanLinh on 27/06/2018.
 * phanvanlinh.94vn@gmail.com
 */
class Loop {
  val TAG: String = "Loop";

  fun forLoop() {
    val items = listOf("apple", "banana", "kiwifruit")
    for (item in items) {
      Log.i(TAG, "item = $item")
    }
  }

  fun forLoopIndex() {
    val items = listOf("apple", "banana", "kiwifruit")
    for (index in items.indices) {
      Log.i(TAG, "item at $index is ${items[index]}")
    }
  }


  fun whileLoop() {
    val items = listOf("apple", "banana", "kiwifruit")
    var index = 0
    while (index < items.size) {
      Log.i(TAG, "item at $index is ${items[index]}")
      index++
    }
  }
}
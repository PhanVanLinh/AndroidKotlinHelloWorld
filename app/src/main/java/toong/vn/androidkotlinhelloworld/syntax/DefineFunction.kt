package toong.vn.androidkotlinhelloworld.syntax

/**
 * Created by PhanVanLinh on 26/06/2018.
 * phanvanlinh.94vn@gmail.com
 */
class DefineFunction {

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
}
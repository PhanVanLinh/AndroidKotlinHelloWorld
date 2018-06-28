package toong.vn.androidkotlinhelloworld.syntax

/**
 * Created by PhanVanLinh on 28/06/2018.
 * phanvanlinh.94vn@gmail.com
 */
class HigherOrderFunction {

  fun <T, R> Collection<T>.fold(
      initial: R,
      combine: (acc: R, nextElement: T) -> R
  ): R {
    var accumulator: R = initial
    for (element: T in this) {
      accumulator = combine(accumulator, element)
    }
    return accumulator
  }
}
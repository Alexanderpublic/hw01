package ru.sberbank.upk.course
import scala.annotation.tailrec

object Task3 {
  def fac(n: Int): Int = {

    @tailrec def factorial(accum: Int, n: Int): Int = {
      if (n <= 1)
        accum
      else
        factorial(n * accum, n - 1)
    }
    factorial(1, n)
  }
  def main(args: Array[String]): Unit = {
    val seed = 5
    println(fac(seed))
  }
}

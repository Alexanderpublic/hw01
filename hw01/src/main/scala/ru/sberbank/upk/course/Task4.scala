package ru.sberbank.upk.course
import scala.annotation.tailrec
import scala.math.sqrt

object Task4 {
  def prost(num: Int): Boolean = {
    @tailrec def prr(accum: Int, n: Int): Int = {
      if (n % accum == 0)
        accum
      else if (accum > sqrt(n))
        1
      else
        prr(accum + 1, n)
    }
    if (prr(2, num) != 1)
      false
    else
      true
  }
  def main(args: Array[String]): Unit = {
    val n = 100003
    println(prost(n))
  }
}

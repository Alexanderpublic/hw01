package ru.sberbank.upk.course

object Task2 {
  def conc(s: String, n: Int): String = {
    if (n != 1)
      s + conc(s, n - 1)
    else
      s
  }
  def main(args: Array[String]): Unit = {
    val stri = s"обожаю домашки "
    val num = 6
    println(conc(stri, num))
  }
}

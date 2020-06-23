package leetcode

object ReverseInt extends App {

  def reverse(x: Int): Int = {
    if (x < Integer.MIN_VALUE || x > Integer.MAX_VALUE) {
      0
    }
    val s = x.toString
    val rev = if (s.charAt(0) == '-') {
      (-1) * s.substring(1, s.length).reverse.toLong
    } else {
      s.reverse.toLong
    }
    if (rev < Integer.MIN_VALUE || rev > Integer.MAX_VALUE) {
      0
    } else {
      rev.toInt
    }
  }

  println(reverse(123))
  println(reverse("-123".toInt))
}

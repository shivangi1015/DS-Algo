/*
7. Reverse Integer

Given a 32-bit signed integer, reverse digits of an integer.

Example 1:

Input: 123
Output: 321
Example 2:

Input: -123
Output: -321
Example 3:

Input: 120
Output: 21
Note:
Assume we are dealing with an environment which could only store integers within the 32-bit
signed integer range: [−231,  231 − 1]. For the purpose of this problem, assume that your function returns 0
when the reversed integer overflows.
 */

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

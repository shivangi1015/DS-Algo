package leetcode

/*
Given a non-empty array of integers, every element appears three times except for one, which appears exactly once.
Find that single one.

Note:

Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Example 1:

Input: [2,2,3,2]
Output: 3
Example 2:

Input: [0,1,0,1,0,1,99]
Output: 99
 */
object SingleNumber extends App {

  def singleNumber(nums: Array[Int]): Int = {
    nums.groupBy(identity).filter(values => values._2.length < 3).keys.head
  }
  println(singleNumber(Array(2,2,3,2)))
}

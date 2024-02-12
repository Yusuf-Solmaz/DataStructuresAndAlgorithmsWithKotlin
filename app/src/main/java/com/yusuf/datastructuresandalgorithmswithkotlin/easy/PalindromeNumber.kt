package com.yusuf.datastructuresandalgorithmswithkotlin.easy



/*
Given an integer x, return true if x is a
palindrome, and false otherwise.



Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
*/

fun main(){
    //println(isPalindromeFirst(1231))
    println(isPalindromeSecond(10))
}

fun isPalindromeFirst(x: Int): Boolean {
    return x.toString() == x.toString().reversed()
}

fun isPalindromeSecond(x: Int): Boolean {
    if (x < 0) {
        return false
    }

    var original = x
    var reverse = 0

    while (original != 0) {
        val digit = original % 10
        original /= 10

        reverse = reverse * 10 + digit
    }

    return reverse == x



    /*
    Time complexity:
    O(log10(n))

    Space complexity:
    O(1)

    */
}

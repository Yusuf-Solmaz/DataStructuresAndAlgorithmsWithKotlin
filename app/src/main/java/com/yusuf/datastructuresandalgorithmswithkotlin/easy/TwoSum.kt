package com.yusuf.datastructuresandalgorithmswithkotlin.easy

class TwoSum {
    // Description

    /*
    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

    You may assume that each input would have exactly one solution, and you may not use the same element twice.

    You can return the answer in any order.



    Example 1:

    Input: nums = [2,7,11,15], target = 9
    Output: [0,1]
    Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
    */

}

fun main(){
    val nums = intArrayOf(3,2,4)

    println(twoSum(nums,6))
}

fun twoSum(nums: IntArray, target: Int): IntArray {
    var first = 0
    var second = 0
    for (i in nums.indices){
        println("I: $i")
        for (j in i+1..<nums.size){
            println("J: $j")
            if (nums[i]+nums[j] == target){
                first = i
                second = j
                break
            }
        }
    }
    return intArrayOf(first,second)
}


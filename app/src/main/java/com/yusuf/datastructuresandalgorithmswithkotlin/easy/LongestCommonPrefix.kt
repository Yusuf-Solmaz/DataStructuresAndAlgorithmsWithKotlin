package com.yusuf.datastructuresandalgorithmswithkotlin.easy

/*
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".



Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
*/

fun main(){
 println(longestCommonPrefix(arrayOf("flower","flower","flower","flower"))   )
}

fun longestCommonPrefix(strs: Array<String>): String {
    if (strs.isEmpty()) {
        return ""
    }

    val firstStr = strs[0]
    var result = ""

    for (i in firstStr.indices) {
        val currentChar = firstStr[i]

        for (j in 1 until strs.size) {
            if (i >= strs[j].length || strs[j][i] != currentChar) {
                return result
            }
        }

        result += currentChar
    }

    return result
}
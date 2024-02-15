package com.yusuf.datastructuresandalgorithmswithkotlin.easy



fun main() {
    println(firstReverse("Hello World!"))
}

fun firstReverse(a: String): String {
    val charArray = a.toCharArray()

    var start = 0
    var end = charArray.size - 1

    while (start < end) {
        val temp = charArray[start]
        charArray[start] = charArray[end]
        charArray[end] = temp

        start++
        end--
    }

    return String(charArray)
}



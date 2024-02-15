package com.yusuf.datastructuresandalgorithmswithkotlin.easy

import kotlin.math.max
import kotlin.math.min

/*
You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.
*/

fun main(){
    var li = ListNode(1)
    var li1 = ListNode(2)
    var li2 = ListNode(4)

    li.next = li1
    li1.next=li2


    var v = ListNode(1)
    var v1 = ListNode(3)
    var v2 = ListNode(4)

    v.next = v1
    v1.next=v2


    mergeTwoLists(li,v)
}

class ListNode(var `val`: Int) {
         var next: ListNode? = null
}


fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {

    if (list1 == null) {
        return list2
    }
    if (list2 == null) {
        return list1
    }
    if (list1.`val` < list2.`val`) {
        list1.next = mergeTwoLists(list1.next, list2)
        return list1
    }
    else{
        list2.next = mergeTwoLists(list2.next, list1)
        return list2
    }
}
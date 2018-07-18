package com.cs.kotlin.demo1

/**
 * Created by ChenShuai on 2018/7/17
 */

val list= listOf(1,"32",3,true)
fun main(args: Array<String>) {
    for ((index,value) in list.withIndex()){
        println("index is $index, and the value is $value")
    }

}
package com.cs.kotlin.demo1

/**
 * Created by ChenShuai on 2018/7/17
 */
//类型后面加?表示可为空
var age: String? = "23"
//抛出空指针异常
val ages = age!!.toInt()
//不做处理返回 null
val ages1 = age?.toInt()
//age为空返回-1
val ages2 = age?.toInt() ?: -1

fun main(args: Array<String>) {
    for (i in 4 downTo 1 step 2){
        println(i)
    }
}
package com.cs.kotlin.demo1

/**
 * Created by ChenShuai on 2018/7/17
 */
fun vars(vararg v:Int){
    for (vt in v){
        println(vt)
    }
}

fun main(args: Array<String>) { //todo 可变成的参数的名称
    vars(1, 5, 4, 2, 5)
}
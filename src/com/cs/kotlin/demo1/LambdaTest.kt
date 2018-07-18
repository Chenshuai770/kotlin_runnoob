package com.cs.kotlin.demo1

/**
 * Created by ChenShuai on 2018/7/17
 */
val sumlambda: (Int, Int) -> Int = { x, y -> x + y }

fun main(args: Array<String>) {
    println(sumlambda(2, 3))

}
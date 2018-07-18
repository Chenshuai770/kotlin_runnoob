package com.cs.kotlin.demo1

import org.omg.CORBA.INTERNAL

/**
 * Created by ChenShuai on 2018/7/17
 */

/**
 * Kotlin 中没有基础数据类型，只有封装的数字类型，你每定义的一个变量，
 * 其实 Kotlin 帮你封装了一个对象，这样可以保证不会出现空指针。
 * 数字类型也一样，所有在比较两个数字的时候，就有比较数据大小和比较两个对象是否相同的区别了。
在 Kotlin 中，三个等号 === 表示比较对象地址，两个 == 表示比较两个值大小。
 */
fun main(args: Array<String>) {
    val a:Int=1000
    println(a===a)

    val boxed:Int?=a
    val anotherBoxed:Int?=a
    println(boxed===anotherBoxed)
    println(boxed===anotherBoxed)
}
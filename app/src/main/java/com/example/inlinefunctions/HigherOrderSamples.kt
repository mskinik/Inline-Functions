package com.example.inlinefunctions


fun highOrderFunc1(num1: Int, num2: Int, operation: (Int, Int) -> Int): Int {
    return operation(num1, num2)
}

fun multiply(num1: Int, num2: Int): Int {
    return num1 * num2
}

fun highOrderFunc2(): (Int, Int) -> Int {
    return { a, b -> a + b }
}

val sum: (Int, Int) -> Int = { a, b -> a + b }

fun main(){
    val result1 = highOrderFunc1(3, 4, sum)
    val result2 = highOrderFunc1(12,7) { a, b -> a - b }
    val result3 = highOrderFunc1(6, 4, ::multiply)
    println("First Result: $result1")
    println("Second Result: $result2")
    println("Third Result: $result3")

    val result4 = highOrderFunc2()
    println("Fourth Result: ${result4(5,3)}")
}
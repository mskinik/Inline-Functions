package com.example.inlinefunctions

fun highOrderFunc(num1: Int, num2: Int, num3: Int, operation: (Int, Int, Int) -> Int): Int {
    return operation(num1, num2, num3)
}

inline fun inlinedHighOrderFunc(num1: Int, num2: Int, operation: (Int, Int) -> Int): Int {
    return operation(num1, num2)
}

inline fun emptyFun() {
    println("This is an empty function")
}

fun main() {
   val higherOrderResult =  highOrderFunc(3,4,5) { a,b,c -> a + b + c }
    println("Higher Order Result: $higherOrderResult")
   val inlineResult = inlinedHighOrderFunc(7,8) { a, b -> a * b }
    println("Inline Result: $inlineResult")
}

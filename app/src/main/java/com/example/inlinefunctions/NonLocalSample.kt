package com.example.inlinefunctions

fun higherOrderFunc1(num1: Int, operation: () -> Unit) {
    println("2")
    operation()
    println("4")
}

inline fun inlinedHighOrderFunc1(num1: Int, operation: () -> Unit) {
    println("2")
    operation()
    return
    println("4")
}

fun main() {
    println("1")
    inlinedHighOrderFunc1(3) {
        println("3")
    }
    println("5")
}







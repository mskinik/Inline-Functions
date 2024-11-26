package com.example.inlinefunctions


inline fun inlinedHighOrderFunc(crossinline operation: () -> Unit) {
    object : MyInterface {
        override fun myFun() {
            operation()
        }
    }
    higherOrderFunc{ operation() }
}

fun higherOrderFunc( operation: () -> Unit) {
    operation.invoke()
}

fun main() {
    inlinedHighOrderFunc {
    }

   /* firstInlinedHighOrderFunc {
        println("This is first inline function")
    }
   */
}

interface MyInterface {
    fun myFun()
}

inline fun firstInlinedHighOrderFunc(operation: () -> Unit) {
    secondInlinedHighOrderFunc { operation() }
}

inline fun secondInlinedHighOrderFunc(operation: () -> Unit) {
    println("This is second inline function 1")
    operation()
    println("This is second inline function 2")
}


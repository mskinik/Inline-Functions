package com.example.inlinefunctions

inline fun withNoInlineFun(operation: () -> Unit, noinline noInlineOperation: () -> Unit) {
    operation()
    noInlineOperation()
}

fun main() {
    withNoInlineFun({ println("This is an inline function") }, { println("This is a noinline function") })
}
package com.example.inlinefunctions

fun main() {
    myFunc("Hello, World!")
}

inline fun<reified T> myFunc(value:T){
    println(value)
    println(T::class.java)
}
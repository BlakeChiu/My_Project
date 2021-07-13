package com.tom

fun main() {
//    println("Hello kotlin")
    Human().hello()
    var age=19; //變數型態的自動推斷
    age=20;
    var weight=66.5f
    var name:String
    name="Hank"
}

class Human{
    fun hello(){
        println("Hello kotlin")
    }
}
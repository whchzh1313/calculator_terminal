package com.example.calculater_console

fun main () {
    println("Calculator")

    var num1 = readLine()!!.toInt()
    while (true) {
        var selectOperator = readLine()!!.toString()
        var num2 = readLine()!!.toInt()
        if (num2 == -1) {
            break
        }
        when (selectOperator) {
            "1" , "+" -> num1 = Calculator_Lv2().calcAdditionRun(num1, num2)
            "2" , "-" -> num1 = Calculator_Lv2().calcSubtractionRun(num1, num2)
            "3" , "*" -> num1 = Calculator_Lv2().calcMultipliedRun(num1, num2)
            "4" , "/" -> num1 = Calculator_Lv2().calcDivisionRun(num1, num2)
            "5" , "%" -> num1 = Calculator_Lv2().calcRemainderRun(num1, num2)
        }
    }
}

class Calculator_Lv2 {
    fun calcAdditionRun (num1: Int, num2: Int): Int {
        println(num1 + num2)
        return num1 + num2
    }
    fun calcSubtractionRun (num1: Int, num2: Int): Int {
        println(num1 - num2)
        return num1 - num2
    }
    fun calcMultipliedRun (num1: Int, num2: Int): Int {
        println(num1 * num2)
        return num1 * num2
    }
    fun calcDivisionRun (num1: Int, num2: Int): Int {
        println(num1 / num2)
        return num1 / num2
    }fun calcRemainderRun (num1: Int, num2: Int): Int {
        println(num1 % num2)
        return num1 % num2
    }
}
package com.example.calculater_console

fun main () {
    println("hello")
    var num1 = readLine()!!.toInt()
    var selectOperator = readLine()!!.toString()
    var num2 = readLine()!!.toInt()

    when (selectOperator) {
        "+" -> Calculator_Lv1().calcAdditionRun(num1, num2)
        "-" -> Calculator_Lv1().calcSubtractionRun(num1, num2)
        "*" -> Calculator_Lv1().calcMultipliedRun(num1, num2)
        "/" -> Calculator_Lv1().calcDivisionRun(num1, num2)
    }

}

class Calculator_Lv1 {
    fun calcAdditionRun (num1: Int, num2: Int) {
        println(num1 + num2)
    }
    fun calcSubtractionRun (num1: Int, num2: Int){
        println(num1 - num2)
    }
    fun calcMultipliedRun (num1: Int, num2: Int){
        println(num1 * num2)
    }
    fun calcDivisionRun (num1: Int, num2: Int){
        println(num1 / num2)
    }
}
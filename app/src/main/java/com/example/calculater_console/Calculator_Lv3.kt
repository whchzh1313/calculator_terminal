package com.example.calculater_console

fun main () {
    println("Calculator")

    var num1 = readLine()!!.toInt()
    while (true) {
        val selectOperator = readLine()!!.toString()
        if (selectOperator == "-1") {
            break
        }
        val num2 = readLine()!!.toInt()
        if (num2 == -1) {
            break
        }
        when (selectOperator) {
            "1" , "+" -> num1 = calcAdditionRun().calc(num1, num2)
            "2" , "-" -> num1 = calcSubtractionRun().calc(num1, num2)
            "3" , "*" -> num1 = calcMultipliedRun().calc(num1, num2)
            "4" , "/" -> num1 = calcDivisionRun().calc(num1, num2)
            "5" , "%" -> num1 = calcRemainderRun().calc(num1, num2)
        }
    }
}

interface Calculator_Lv3 {
    fun calc(num1: Int, num2: Int): Int
}

class calcAdditionRun: Calculator_Lv3 {
    override fun calc (num1: Int, num2: Int): Int {
        println(num1 + num2)
        return num1 + num2
    }
}
class calcSubtractionRun: Calculator_Lv3 {
    override fun calc (num1: Int, num2: Int): Int {
        println(num1 - num2)
        return num1 - num2
    }
}
class calcMultipliedRun: Calculator_Lv3 {
    override fun calc (num1: Int, num2: Int): Int {
        println(num1 * num2)
        return num1 * num2
    }
}
class calcDivisionRun: Calculator_Lv3 {
    override fun calc (num1: Int, num2: Int): Int {
        println(num1 / num2)
        return num1 / num2
    }
}
class calcRemainderRun: Calculator_Lv3 {
    override fun calc (num1: Int, num2: Int): Int {
        println(num1 % num2)
        return num1 % num2
    }
}
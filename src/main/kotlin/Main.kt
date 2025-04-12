package com.andrealaforgia

import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

/*
 * Complete the 'activityNotifications' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY expenditure
 *  2. INTEGER d
 */

fun activityNotifications(expenditure: Array<Int>, d: Int): Int {
    // Write your code here
    return -1
}

fun median(values: Array<Int>): Int {
    if (values.isEmpty()){
        return 0
    }
    if (values.size == 1) {
        return values[0]
    }
    if (values.size == 2) {
        return (values[0] + values[1])/2
    }
    if (values.size == 3) {
        return (values[1])
    }
    if (values.size % 2 == 0) {
        return (values[values.size / 2-1] + values[values.size/2])/2

    } else {
       return values[values.size/2]
    }
}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val n = first_multiple_input[0].toInt()

    val d = first_multiple_input[1].toInt()

    val expenditure = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = activityNotifications(expenditure, d)

    println(result)
}
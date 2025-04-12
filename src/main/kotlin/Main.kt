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

fun medianForSubArray(values: Array<Int>, startIndex: Int, endIndex: Int): Int {
    if (values.isEmpty()){
        return 0
    }
    val size = endIndex - startIndex + 1
    return if (size % 2 == 0) {
        (values[startIndex + size / 2-1] + values[startIndex + size/2])/2

    } else {
        values[startIndex + size/2]
    }
}

fun median(values: Array<Int>): Int {
    return medianForSubArray(values, 0, values.size-1)
}

fun calculateNumberOfNotices(values: Array<Int>, lastIndex: Int, pastDaysNumber: Int): Int {
    val startIndex = lastIndex - pastDaysNumber
    if (startIndex >= 0) {
        val m = median(values.sliceArray(startIndex..lastIndex-1))
        if (values[lastIndex] >= 2 * m) {
            return 1
        }
    }
    return 0
}

fun activityNotifications(expenditure: Array<Int>, d: Int): Int {
//    var c = 0
//    var startIndex = expenditure.size-1
//    while (startIndex - d >= 0) {
//       c += calculateNumberOfNotices())
//    }
    return -1
}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val n = first_multiple_input[0].toInt()

    val d = first_multiple_input[1].toInt()

    val expenditure = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = activityNotifications(expenditure, d)

    println(result)
}
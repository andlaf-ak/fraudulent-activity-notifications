package com.andrealaforgia

fun insertInSortedList(items: MutableList<Int>, newElement: Int) {
    val index = items.binarySearch(newElement).let { if (it < 0) -it - 1 else it }
    items.add(index, newElement)
}

fun medianForSubArray(values: List<Int>, startIndex: Int, endIndex: Int): Double {
    if (values.isEmpty()){
        return 0.0
    }
    val size = endIndex - startIndex + 1
    return if (size % 2 == 0) {
        (values[startIndex + size / 2-1] + values[startIndex + size/2])/2.0

    } else {
        values[startIndex + size/2].toDouble()
    }
}

fun median(values: List<Int>): Double {
    return medianForSubArray(values, 0, values.size-1)
}

fun calculateNumberOfNotices(values: List<Int>, lastIndex: Int, pastDaysNumber: Int): Int {
    val startIndex = lastIndex - pastDaysNumber
    if (startIndex >= 0) {
        val m = medianForSubArray(values, startIndex, lastIndex - 1)
        if (values[lastIndex] >= 2 * m) {
            return 1
        }
    }
    return 0
}

fun activityNotifications(expenditure: Array<Int>, d: Int): Int {
    var numberOfNotifications = 0
    var valueToCheckIndex = d
    var sublist = expenditure.slice(0..valueToCheckIndex-1).sorted().toMutableList()
    while (valueToCheckIndex < expenditure.size) {
        val m = median(sublist)
        val valueToCheck = expenditure[valueToCheckIndex]
        if (valueToCheck >= 2*m) {
            ++numberOfNotifications
        }
        sublist.removeFirst()
        insertInSortedList(sublist, expenditure[valueToCheckIndex-1])
        ++valueToCheckIndex
    }
    return numberOfNotifications
}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val n = first_multiple_input[0].toInt()

    val d = first_multiple_input[1].toInt()

    val expenditure = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = activityNotifications(expenditure, d)

    println(result)
}
package com.andrealaforgia

fun insertInSortedList(items: MutableList<Int>, newElement: Int) {
    val index = items.binarySearch(newElement).let { if (it < 0) -it - 1 else it }
    items.add(index, newElement)
}

fun removeItemFromSortedList(sortedList: MutableList<Int>, item: Int) {
    val index = sortedList.binarySearch(item)
    if (index >= 0) {
        sortedList.removeAt(index)
    }
}

fun median(values: List<Int>): Double {
    if (values.isEmpty()){
        return 0.0
    }
    return if (values.size % 2 == 0) {
        (values[values.size / 2-1] + values[values.size/2])/2.0

    } else {
        values[values.size/2].toDouble()
    }
}

fun activityNotifications(expenditure: Array<Int>, d: Int): Int {
    var numberOfNotifications = 0
    var startIndex = 0
    var valueToCheckIndex = d
    var sublist = expenditure.slice(startIndex..valueToCheckIndex-1).sorted().toMutableList()
    while (valueToCheckIndex < expenditure.size) {
        val m = median(sublist)
        val valueToCheck = expenditure[valueToCheckIndex]
        if (valueToCheck >= 2*m) {
            ++numberOfNotifications
        }
        removeItemFromSortedList(sublist, expenditure[startIndex])
        insertInSortedList(sublist, expenditure[valueToCheckIndex])
        ++startIndex
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
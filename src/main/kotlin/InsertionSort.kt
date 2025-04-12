package com.andrealaforgia

fun insertInSortedArray(values: MutableList<Int>, value: Int) {
    values.add(values[4])
    values[4] = values[3]
    values[3] = values[2]
    values[2] = 3
}
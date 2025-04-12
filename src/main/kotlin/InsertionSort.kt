package com.andrealaforgia

fun insertInSortedList(items: MutableList<Int>, newElement: Int) {
    val index = items.binarySearch(newElement).let { if (it < 0) -it - 1 else it }
    items.add(index, newElement)
}


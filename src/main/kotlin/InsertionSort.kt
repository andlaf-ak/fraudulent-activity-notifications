package com.andrealaforgia

fun insertInSortedList(items: MutableList<Int>, newElement: Int) {
    val index = items.indexOfFirst { it >= newElement }
    if (index == -1) {
        items.add(newElement)
    } else {
        items.add(index, newElement)
    }
}

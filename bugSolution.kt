fun main() {
    val set = mutableSetOf(1, 2, 3, 4, 5)
    val iterator = set.iterator()
    while (iterator.hasNext()) {
        val element = iterator.next()
        if (element > 2) {
            iterator.remove()
        }
    }
    println(set) // Output: [1, 2]
} 
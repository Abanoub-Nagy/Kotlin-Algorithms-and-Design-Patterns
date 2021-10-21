package sorting

/**
 * сортировка пузырьком является одной из самых простых и интуитивно понятных
 * алгоритмов сортировки.
 * худший случай: n²
 * лучший случай: n
 * средний случай: n²
 */
class BubbleSort<T : Comparable<T>> : SortAlgo<T>() {

    override fun sortAlgo(array: Array<T>) {
        for (i in 0 until array.size - 1) {
            for (j in 0 until array.size - 1 - i) {
                if (array[j] > array[j + 1]) {
                    array[j] = array[j + 1].apply {
                        array[j + 1] = array[j]
                    }
                }
            }
        }
    }

}
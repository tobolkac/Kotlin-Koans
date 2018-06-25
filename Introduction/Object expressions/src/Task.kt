import java.util.*

fun getList(): List<Int> {
    val arrayList = arrayListOf(1, 5, 2)
    Collections.sort(arrayList, object : Comparator<Int> {
        // or override fun compare(x: Int, y: Int): Int { return y - x }

        // single expression function version
        override fun compare(x: Int, y: Int) = y - x
    })
    return arrayList
}

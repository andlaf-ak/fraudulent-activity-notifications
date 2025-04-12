import com.andrealaforgia.insertInSortedArray
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class InsertionSortKtTest {
    @Test
    fun shouldInsertInSortedArray() {
        val values = arrayOf(1, 2, 4, 5, 6)
        assertEquals(arrayOf(1, 2, 3, 4, 5, 6), insertInSortedArray(values, 3))
    }
}
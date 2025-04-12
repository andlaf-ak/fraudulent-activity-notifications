import com.andrealaforgia.insertInSortedArray
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class InsertionSortKtTest {
    @Test
    fun shouldInsertInSortedArray() {
        val values = mutableListOf(1, 2, 4, 5, 6)
        insertInSortedArray(values, 3)
        assertEquals(listOf(1, 2, 3, 4, 5, 6), values)
    }
}
import com.andrealaforgia.median
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class MedianTest {
    @Test
    fun shouldCalculateMedianForEmptyArray() {
        val values = emptyArray<Int>()
        assertEquals(0, median(values))
    }

    @Test
    fun shouldCalculateMedianForArrayWithOneElement() {
        val values = arrayOf(10)
        assertEquals(10, median(values))
    }

    @Test
    fun shouldCalculateMedianForArrayWithTwoElements() {
        val values = arrayOf(10, 20)
        assertEquals(15, median(values))
    }
}
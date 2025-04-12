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

    @Test
    fun shouldCalculateMedianForArrayWithThreeElements() {
        val values = arrayOf(11, 17, 19)
        assertEquals(17, median(values))
    }

    @Test
    fun shouldCalculateMedianForArrayWithOddNumberOfElements() {
        val values = arrayOf(11, 17, 19, 21, 23, 29, 31)
        assertEquals(21, median(values))
    }

    @Test
    fun shouldCalculateMedianForArrayWithEvenNumberOfElements() {
        val values = arrayOf(11, 17, 19, 21, 23, 29)
        assertEquals((19+21)/2, median(values))
    }
}
import com.andrealaforgia.median
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class MedianTest {
    @Test
    fun shouldCalculateMedianForEmptyArray() {
        val values = emptyList<Int>()
        assertEquals(0.0, median(values))
    }

    @Test
    fun shouldCalculateMedianForArrayWithOneElement() {
        val values = listOf(10)
        assertEquals(10.0, median(values))
    }

    @Test
    fun shouldCalculateMedianForArrayWithTwoElements() {
        val values = listOf(10, 20)
        assertEquals(15.0, median(values))
    }

    @Test
    fun shouldCalculateMedianForArrayWithThreeElements() {
        val values = listOf(11, 17, 19)
        assertEquals(17.0, median(values))
    }

    @Test
    fun shouldCalculateMedianForArrayWithOddNumberOfElements() {
        val values = listOf(11, 17, 19, 21, 23, 29, 31)
        assertEquals(21.0, median(values))
    }

    @Test
    fun shouldCalculateMedianForArrayWithEvenNumberOfElements() {
        val values = listOf(11, 17, 19, 21, 23, 29)
        assertEquals((19+21)/2.0, median(values))
    }
}
import com.andrealaforgia.median
import com.andrealaforgia.medianForSubArray
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class MedianTest {
    @Test
    fun shouldCalculateMedianForEmptyArray() {
        val values = emptyArray<Int>()
        assertEquals(0.0, median(values))
    }

    @Test
    fun shouldCalculateMedianForArrayWithOneElement() {
        val values = arrayOf(10)
        assertEquals(10.0, median(values))
    }

    @Test
    fun shouldCalculateMedianForArrayWithTwoElements() {
        val values = arrayOf(10, 20)
        assertEquals(15.0, median(values))
    }

    @Test
    fun shouldCalculateMedianForArrayWithThreeElements() {
        val values = arrayOf(11, 17, 19)
        assertEquals(17.0, median(values))
    }

    @Test
    fun shouldCalculateMedianForArrayWithOddNumberOfElements() {
        val values = arrayOf(11, 17, 19, 21, 23, 29, 31)
        assertEquals(21.0, median(values))
    }

    @Test
    fun shouldCalculateMedianForArrayWithEvenNumberOfElements() {
        val values = arrayOf(11, 17, 19, 21, 23, 29)
        assertEquals((19+21)/2.0, median(values))
    }

    @Test
    fun shouldCalculateMedianForSubarrayWithOddNumberOfElements() {
        val values = arrayOf(11, 17, 19, 21, 23, 29)
        assertEquals(17.0, medianForSubArray(values, 0, 2))
    }

    @Test
    fun shouldCalculateMedianForSubarrayWithEveNumberOfElements() {
        val values = arrayOf(11, 17, 19, 21, 23, 29)
        assertEquals((17+19)/2.0, medianForSubArray(values, 0, 3))
    }
}
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class MedianTest {
    @Test
    fun shouldCalculateMedianForEmptyArray() {
        val values = emptyArray<Int>()
        assertEquals(0, values)
    }
}
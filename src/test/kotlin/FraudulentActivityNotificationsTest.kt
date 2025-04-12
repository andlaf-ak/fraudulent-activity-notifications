import com.andrealaforgia.activityNotifications
import com.andrealaforgia.calculateNumberOfNotices
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.io.File

class FraudulentActivityNotificationsTest {
    @Test
    fun shouldReturnFraudulentActivityNotificationCount() {
        val expenditure = arrayOf(10, 20, 30, 40, 50)
        val trailingDays = 3
        val activityNotificationsCount = activityNotifications(expenditure, trailingDays)
        assertEquals(1, activityNotificationsCount)
    }

    @Test
    fun shouldReturnTheNumberOfNotificationsForInterval() {
        val expenditure = listOf(10, 20, 30, 40)
        val pastDaysNumber = 3
        assertEquals(1, calculateNumberOfNotices(expenditure, 3, pastDaysNumber))
    }

    @Test
    fun shouldReturnFraudulentActivityNotificationCountOverFiveDays() {
        val expenditure = arrayOf(2, 3, 4, 2, 3, 6, 8, 4, 5)
        val trailingDays = 5
        val activityNotificationsCount = activityNotifications(expenditure, trailingDays)
        assertEquals(2, activityNotificationsCount)
    }

    @Test
    fun shouldReturnFraudulentActivityNotificationCountOverFourDays() {
        val expenditure = arrayOf(1, 2, 3, 4, 4)
        val trailingDays = 4
        val activityNotificationsCount = activityNotifications(expenditure, trailingDays)
        assertEquals(0, activityNotificationsCount)
    }

    @Test
    fun shouldReturnFraudulentActivityNotificatioNCountForVeryLargeInput() {
        val (trailingDays, expenditure) = readFromFile("test_case_1.txt")

        val result = activityNotifications(expenditure, trailingDays)

        assertEquals(633, result)
    }

    private fun readFromFile(fileName: String): Pair<Int, Array<Int>> {
        val file = File(javaClass.classLoader.getResource(fileName)!!.toURI())

        val firstLine = file.readLines()[0].trimEnd().split(" ")
        val n = firstLine[0].toInt()
        val d = firstLine[1].toInt()

        val expenditure = file.readLines()[1].trimEnd().split(" ").map { it.toInt() }.toTypedArray()
        return Pair(d, expenditure)
    }
}
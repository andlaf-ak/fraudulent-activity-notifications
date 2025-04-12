import com.andrealaforgia.activityNotifications
import com.andrealaforgia.calculateNumberOfNotices
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import kotlin.math.exp

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
        val expenditure = arrayOf(10, 20, 30, 40)
        val pastDaysNumber = 3
        assertEquals(1, calculateNumberOfNotices(expenditure, pastDaysNumber))
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
}
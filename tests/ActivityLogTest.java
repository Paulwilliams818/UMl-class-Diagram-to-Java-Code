import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ActivityLogTest {
    @Test
    void testAddActivity() {
        ActivityLog log = new ActivityLog();
        log.addActivity("Login");
        assertTrue(log.getActivities().contains("Login"));
    }
}

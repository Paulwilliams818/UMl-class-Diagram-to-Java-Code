import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ActivityLogTest {
    @Test
    void testAddLog() {
        ActivityLog log = new ActivityLog();
        log.addActivity("User signed in");
        assertTrue(log.getActivities().contains("User signed in"));
    }
}

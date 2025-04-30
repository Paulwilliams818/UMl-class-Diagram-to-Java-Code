import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

public class ActivityLogTest {

    @Test
    public void testActivityType() {
        ActivityLog log = new ActivityLog("Download", "2024-12-01");
        assertEquals("Download", log.getActivityType());
    }
}

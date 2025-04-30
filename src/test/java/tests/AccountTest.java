import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

public class AccountTest {

    @Test
    public void testAccountBalance() {
        Account acc = new Account();
        acc.setBalance(500);
        assertEquals(500, acc.getBalance());
    }
}

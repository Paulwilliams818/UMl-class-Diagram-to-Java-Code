import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {
    @Test
    void testAccount() {
        Account acc = new Account("A001", "Paul");
        assertEquals("A001", acc.getAccountNumber());
        assertEquals("Paul", acc.getCustomerName());
    }
}

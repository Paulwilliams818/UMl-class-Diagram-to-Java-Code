import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class CustomerTest {
    @Test
    void testDeliveryPreferenceMock() {
        DeliveryPreference mockPref = mock(DeliveryPreference.class);
        when(mockPref.getType()).thenReturn("Email");

        Customer cust = new Customer("Paul", mockPref);
        assertEquals("Email", cust.getDeliveryPreference().getType());
    }
}

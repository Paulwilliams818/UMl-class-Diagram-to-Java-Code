import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class CustomerTest {
    @Test
    void testDeliveryPreferenceMock() {
        DeliveryPreference mockPref = mock(DeliveryPreference.class);
        when(mockPref.getType()).thenReturn("Email");

        Customer customer = new Customer("Paul", mockPref);
        assertEquals("Email", customer.getDeliveryPreference().getType());
    }
}

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.Mockito;

import java.util.*;

public class CustomerTest {

    @Test
    public void testCustomerId() {
        Customer customer = new Customer();
        customer.setCustomerId(123);
        assertEquals(123, customer.getCustomerId());
    }

    @Test
    public void testMockedDeliveryPreference() {
        DeliveryPreference dpMock = Mockito.mock(DeliveryPreference.class);
        Mockito.when(dpMock.getMethod()).thenReturn("Email");

        assertEquals("Email", dpMock.getMethod());
    }
}

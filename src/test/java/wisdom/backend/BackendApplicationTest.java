package wisdom.backend;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BackendApplicationTest {

    @Test
    void serviceIdIsStable() {
        assertEquals("wisdom-backend", new BackendApplication().serviceId());
    }
}

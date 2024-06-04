package FitnessApp.Domain;

import FitnessApp.domain.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    private User user;

    @BeforeEach
    void setUp() {
        user = new User("TestUser", "Test@mail.com", "TestPass");
    }

    @Test
    void testGetUsername() {
        assertEquals("TestUser", user.getName());
    }

    @Test
    void testSetUsername() {
        user.setName("NewTestUser");
        assertEquals("NewTestUser", user.getName());
    }

    @Test
    void testGetPassword() {
        assertEquals("TestPass", user.getPassword());
    }

    @Test
    void testSetPassword() {
        user.setPassword("NewTestPass");
        assertEquals("NewTestPass", user.getPassword());
    }

    @Test
    void testGetEmail() {
        assertEquals("Test@mail.com", user.getEmail());
    }

    @Test
    void testSetEmail() {
        user.setEmail("newtest@mail.com");
        assertEquals("newtest@mail.com", user.getEmail());
    }
}
package seminar3.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class UserRepositoryTest {
    UserRepository repository;

    @BeforeEach
    void setUp() {
        repository = new UserRepository();

    }

    @Test
    void addUserToRepo() {
        User user = new User("1", "1", true);
        user.authenticate("1", "1");
        repository.addUser(user);
        assertTrue(repository.data.contains(user));
    }

    @Test
    void notAddUserToRepo() {
        User user = new User("1", "1", true);
        user.authenticate("3", "1");
        repository.addUser(user);
        assertFalse(repository.data.contains(user));
    }
}
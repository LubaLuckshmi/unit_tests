package seminar3.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class UserRepositoryTest {
    UserRepository repository;
    User user;

    @BeforeEach
    void setUp() {
        repository = new UserRepository();
        user = new User("1", "1", true);

    }

    @Test
    void addUserToRepo() {
        user.authenticate("1", "1");
        repository.addUser(user);
        assertTrue(repository.data.contains(user));
    }

    @Test
    void notAddUserToRepo() {
        user.authenticate("3", "1");
        repository.addUser(user);
        assertFalse(repository.data.contains(user));
    }


    @Test
    void logOutAdmin() {
        user.authenticate("1", "1");
        repository.addUser(user);
        repository.logOutNotAdminUsers();
        assertTrue(user.isAuthenticate);

    }
    @Test
    void logOutNotAdmin() {
        User notAdmin = new User("1","1", false);
        user.authenticate("1", "1");
        repository.addUser(notAdmin);
        repository.logOutNotAdminUsers();
        assertFalse(notAdmin.isAuthenticate);
    }
}
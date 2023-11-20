package seminar5.user;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {


    @Test
    void getUserNameTest() {
        UserRepository userRepository = new UserRepository();
        UserService userService = new UserService(userRepository);
        assertThat(userService.getUserName(1)).isEqualTo("User 1");
    }
}
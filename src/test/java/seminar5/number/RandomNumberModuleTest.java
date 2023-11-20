package seminar5.number;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RandomNumberModuleTest {

    @Test
    void randomIntArrayTest() {
        RandomNumberModule randomNumberModule = new RandomNumberModule();
        assertThat(randomNumberModule.getRandomNumbers(10).length).isEqualTo(10);
    }
}
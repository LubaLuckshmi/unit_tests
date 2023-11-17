package seminar3Hw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    Main main;

    @BeforeEach
    void setUp() {
        main = new Main();
    }

    @Test
    void EvenNumber(){
        assertTrue(main.evenOddNumber(2));
    }
    @Test
    void OddNumber() {
        assertFalse(main.evenOddNumber(1));
    }
    @Test
    void numberIsInInterval() {
        for (int i = 26; i < 100; i++) {
            assertTrue(main.numberInInterval(i));
        }
    }

    @Test
    void numberIsNotInInterval() {
        int[] numbers = new int[]{-3, 0, 23, 101};
        for (int number : numbers) {
            assertFalse(main.numberInInterval(number));
        }
    }


}
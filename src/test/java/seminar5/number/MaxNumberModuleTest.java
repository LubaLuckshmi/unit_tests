package seminar5.number;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MaxNumberModuleTest {


    @Test
    void getMaxTest() {
        MaxNumberModule maxNumberModule = new MaxNumberModule();
        int[] testArray = new int[]{-4, 323, 5332, 455, 6, 9};
        assertThat(maxNumberModule.getMax(testArray)).isEqualTo(5332);

    }
}
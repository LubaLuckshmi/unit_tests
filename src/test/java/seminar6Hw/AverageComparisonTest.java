package seminar6Hw;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import java.util.Arrays;
import java.util.List;

public class AverageComparisonTest {

    @Test
    public void testCompareAverages_FirstListGreater() {
        AverageComparison controller = new AverageComparison();
        List<Integer> list1 = Arrays.asList(10, 2, 3);
        List<Integer> list2 = Arrays.asList(3, 4, 5);

        assertThat(controller.compareAverages(list1, list2)).isEqualTo("Первый список имеет большее среднее значение");
    }

    @Test
    public void testCompareAverages_SecondListGreater() {
        AverageComparison controller = new AverageComparison();
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(3, 4, 5, 6);
        assertThat(controller.compareAverages(list1, list2)).isEqualTo("Второй список имеет большее среднее значение");
    }

    @Test
    public void testCompareAverages_AveragesEqual() {
        AverageComparison controller = new AverageComparison();
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(3, 2, 1);
        assertThat(controller.compareAverages(list1, list2)).isEqualTo("Средние значения равны");
    }

}


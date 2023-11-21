package seminar6Hw;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import java.util.List;

public class AverageComparisonIntegrationTest {
    @Test
    public void testCompareAverages_WithMock() {
        // Создаем mock объект для интерфейса AverageCalculator
        AverageCalculator averageCalculatorMock = mock(AverageCalculator.class);

        // Создаем экземпляр AverageComparisonController и связываем его с mock объектом
        AverageComparison controller = new AverageComparison();

        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 5, 6);

        // Устанавливаем поведение mock объекта при вызове calculateAverage с определенными аргументами
        when(averageCalculatorMock.calculateAverage(list1)).thenReturn(2.0);
        when(averageCalculatorMock.calculateAverage(list2)).thenReturn(5.0);

        // Вызываем метод compareAverages и проверяем правильность результата
        assertThat(controller.compareAverages(list1, list2)).isEqualTo("Второй список имеет большее среднее значение");

    }
}



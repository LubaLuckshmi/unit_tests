package seminar6Hw;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import java.util.List;

public class MainTest {
    @Test
    public void testMain() {
        // Перенаправляем System.out в буфер для тестирования вывода
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Создаем списки и запускаем main метод
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(6, 7, 8, 9, 10);
        Main.main(null);

        // Получаем вывод из System.out
        String output = outContent.toString().trim();

        // Проверяем, что вывод соответствует ожидаемому
        assertEquals("Второй список имеет большее среднее значение", output);
    }
}

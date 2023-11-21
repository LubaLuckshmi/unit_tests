package seminar6Hw;


import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        AverageComparison averageComparison = new AverageComparison();
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(6, 7, 8, 9, 10);

        System.out.println(averageComparison.compareAverages(list1, list2));
    }
}

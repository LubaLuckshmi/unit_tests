package seminar6Hw;

import java.util.List;

public class AverageCalculator {
    public double calculateAverage(List<Integer> list) {
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        return (double) sum / list.size();
    }

}

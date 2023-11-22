package seminar6Hw;


import java.util.List;

public class AverageComparison {
    private AverageCalculator averageCalculator;

    public AverageComparison() {
        this.averageCalculator = new AverageCalculator();
    }



    public String compareAverages(List<Integer> list1, List<Integer> list2) {
        double average1 = averageCalculator.calculateAverage(list1);
        double average2 = averageCalculator.calculateAverage(list2);

        if (average1 > average2) {
            return "Первый список имеет большее среднее значение";
        } else if (average2 > average1) {
            return "Второй список имеет большее среднее значение";
        } else {
            return "Средние значения равны";
        }
    }


}




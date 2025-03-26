package quiz.ch2.sec3;

import java.util.Arrays;

public class Quiz1 {

    public static void main(String[] args) {
        int[] arr1 = {76, 92, 49, 78, 83};

        int max = Arrays.stream(arr1).max().orElseThrow();
        int min = Arrays.stream(arr1).min().orElseThrow();
        int sum = Arrays.stream(arr1).sum();
        double avg = Arrays.stream(arr1).average().orElseThrow();

        System.out.printf("max score : %d\n", max);
        System.out.printf("min score : %d\n", min);
        System.out.printf("total score : %d\n", sum);
        System.out.printf("average score : %d\n", (int) avg);

    }
}

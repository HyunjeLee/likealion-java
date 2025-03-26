package quiz.ch2.sec3;

public class Homework1 {
    public static void main(String[] args) {
        int[] lotto = {7, 44, 16, 32, 1, 22};

        Homework1 hw1 = new Homework1();

        int[] sortedLotto = hw1.sortByAsc(lotto);

        hw1.printResult(sortedLotto);
    }

    int[] sortByAsc(int [] array) {
        for (int i = 0; i < array.length ; i++) {   // 원소 모두 반복
            int swap = array[i];

            for (int j = i+1; j < array.length ; j++) {  // 본인과 본인의 다음 원소 간 비교
                if (swap > array[j]) {  // 본인보다 작다면 교체
                    swap = array[j];

                    array[j] = array[i];
                    array[i] = swap;
                }
            }
        }

        return array;
    }


    void printResult(int [] array) {
        System.out.println("lotto num sort result");

        for (int i = 0; i < array.length ; i++) {
            System.out.print(array[i]);

            if (i != array.length - 1)  // 마지막 원소는 ", "를 붙이지 않음
                System.out.print(", ");
            }
    }
}

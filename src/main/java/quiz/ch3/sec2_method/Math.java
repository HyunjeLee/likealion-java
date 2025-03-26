package quiz.ch3.sec2_method;

public class Math {

    public static void main(String[] args) {
        Math math = new Math();

        System.out.println("add 2num : " + math.add(1,2));
        System.out.println("add 3num : " + math.add(1, 2, 3));
        System.out.println("add 2num : " + math.add(new int[]{1, 2, 3, 4, 5}));
    }

    int add(int num1, int num2) {

        return num1 + num2;
    }

    int add(int num1, int num2, int num3) {

        return num1 + num2 + num3;
    }

    int add(int[] numArr) {
        int sum = 0;

        for (int num: numArr) {
            sum += num;
        }

        return sum;
    }
}

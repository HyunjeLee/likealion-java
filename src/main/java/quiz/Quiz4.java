package quiz;

import java.util.Scanner;

public class Quiz4 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.print("enter nums : ");

        int nums = stdin.nextInt();

        Quiz4 quiz4 = new Quiz4();
        quiz4.checkPrimesUpTo(nums);
    }

    void checkPrimesUpTo(int numsUpTo) {

        Quiz3 quiz3 = new Quiz3();  // 객체 생성

        // 1부터 입력값까지의 소수 검사
        for (int num = 1; num < numsUpTo + 1 ; num++) {
            if (quiz3.checkPrime(num)) {
                System.out.print(num);
                System.out.print(" ");
            } else {
//                System.out.print("not prime");
            }
        }
    }
}

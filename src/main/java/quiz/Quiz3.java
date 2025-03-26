package quiz;

import java.util.Scanner;

public class Quiz3 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.print("enter prime num : ");

        int num = stdin.nextInt();
        Quiz3 quiz3 = new Quiz3();  // 객체 생성

        // 2부터 시작해 자신보다 작은 숫자까지 나누어 0이 나오지 않을 때 소수
        try {
            if (quiz3.checkPrime(num)) {
                System.out.println("prime");
            } else {
                System.out.println("not prime");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); // 예외 메시지 출력
        }
    }

    boolean checkPrime(int num) {
        if (num < 1) {
            throw new IllegalArgumentException("negative num and \"0\" is not prime. ");
        }
        if (num == 1) {
            return false; // 1은 소수가 아님
        }
        if (num == 2) {
            return true;  // 2는 소수
        }

        int cnt = 2;
        while (num % cnt != 0) {
            cnt++;

            if (cnt >= num) {
                return true;
            }
        }

        return false;
    }
}

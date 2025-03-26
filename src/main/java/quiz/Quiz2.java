package quiz;

public class Quiz2 {
    public static void main(String[] args) {
        int num = 15;

        switch (num) {

            case 3, 4, 5:
                System.out.println("spring.");
                break;
//            case 3, 4, 5 -> System.out.println("봄입니다.");  // `->` 를 사용하면 break가 자동적으로 포함
// switch의 양식은 통일되어야함 `->`로 통일 또는 `:`로 통일

            case 6, 7, 8:
                System.out.println("summer.");
                break;

            case 9, 10, 11:
                System.out.println("autum.");
                break;

            case 12, 1 , 2:
                System.out.println("winter.");
                break;

            default:
                System.out.println("wrong input.");
                break;
        }

    }
}

package quiz;

public class Quiz5 {

    ///  구구단 ; 자릿수 맞춰 정확하게 출력할 것

    public static void main(String[] args) {
        for (int row = 1; row < 10; row++) {
            for (int col = 2; col < 10 ; col++ ) {
                if (row * col >= 10)
                    System.out.printf("%d * %d =  %d", col, row, row * col);
                else
                    System.out.printf("%d * %d =   %d", col, row, row * col);

                System.out.print("    ");
            }
            System.out.println();
        }
    }

}

/***
public static void main(String[] args) {
    for (int row = 1; row < 10; row++) {
        for (int col = 2; col < 10; col++) {
            // 공백이 한 자리인 경우 두 자리인 경우를 처리하기 위해 공백을 한 번만 계산
            String format = (row * col < 10) ? "%d * %d =   %d" : "%d * %d =  %d";
            System.out.printf(format, col, row, row * col);
            System.out.print("    ");
        }
        System.out.println();
    }
}

public static void main(String[] args) {
    //곱해지는 숫자 증가..
    for(int num = 1; num <= 9; num++){
        //단수 증가..
        for(int dan = 2; dan <= 9; dan++){
            System.out.print(dan + " * " + num + " = " + (dan*num < 10 ? (" "+dan*num) : (dan * num) )+ "    ");
        }
        //개행을 위해서..
        System.out.println();
    }
}
}
 ***/

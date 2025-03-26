package ch3.sec5_inherited;

class Super {
    {
        System.out.println("1");
    }
    static {
        System.out.println("2");
    }

    int a;

    Super() {
        System.out.println("3");
    }
}

class Sub extends Super {
    {
        System.out.println("4");
    }
    static {
        System.out.println("5");
    }

    int b;

    Sub() {
        // 이 경우 상위 객체가 default 생성자가 존재하므로
        // 똑같이 javac 컴파일러가 super() 생성자를 컴파일하며 자동으로 추가한다.
        System.out.println("6");
    }
    Sub(int a) {
        this();
        System.out.println("7");
    }
}


public class Quiz1 {
    public static void main(String[] args) {
        new Sub();  // 5 2 1 3 4 6
        new Sub(10); // 1 3 4 6 7

        // (정적 블록 실행 순서: 부모 → 자식)
        // 2 5 1 3 4 6
        // 1 3 4 6 7
    }
}

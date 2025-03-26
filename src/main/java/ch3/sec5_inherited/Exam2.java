package ch3.sec5_inherited;



class Super1 {}

class Sub1 extends Super1 {}

class Super2 {
//    Super2(int a) {}
//    Super2() {
//        int a = 0;
//    }

    Super2(int a) {
        a = 20;
    }

    Super2(int a, int b) {

    }
}

class Sub2 extends Super2 {
    Sub2(int a, int b) {
        super(1,2);
    }

    Sub2(int a) {
        this(12, 1);    // 어떤 생성자를 연결하든 객체 생성 시점에 상위 생성자가 호출만 되면 된다..!!
//        super(1,2);
        a = 10;
    }
}

public class Exam2 {
}

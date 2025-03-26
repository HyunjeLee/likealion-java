package ch3.sec5_inherited;

public class Singleton {
    private static final Singleton INSTANCE = new Singleton(); // 미리 생성

    int a;

    private Singleton() {}  // private 생성자로 외부에서 인스턴스화 방지

    public static Singleton getInstance() {
        return INSTANCE;
    }
}

class TestClass {
    public static void main(String[] args) {

//        new Singleton();  // 불가능 !

        System.out.println(Singleton.getInstance());
        System.out.println(Singleton.getInstance());

        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        singleton1.a = 10;
        singleton2.a = 20;

        System.out.println(singleton1.a);
        System.out.println(singleton2.a);

    }
}


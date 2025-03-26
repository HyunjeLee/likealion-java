package quiz.ch3.sec3_static_and_memory;

public class Quiz1 {
    int a = 0;
    {
        System.out.println("1");
    }   // 이런 블록은 잘 안 씀  // 인스턴스 초기화 블록 (Instance Initializer Block)
    static {
        System.out.println("2");
    }   // static은 가끔 보임  // Static 초기화 블록 (Static Initializer Block)

    Quiz1() {
        System.out.println("3");
    }
    Quiz1(int num) {
        // this() 코드를 통해 해당 클래스의 기본 생성자를 호출함 (이 경우 사용자가 직접 정의했으므로 위의 3일 찍는 생성자)
        // 이 때 해당 객체 `Quiz1(int num)`의 메모리 할당을 진행함
        // 따라서 메모리 할당이 되는 시점에서 int a = 0; 과 1을 찍는 블록이 실행되고 더 이상 실행되지 않음.
        this();
        System.out.println("4");
    }

    public static void main(String[] args) {
        new Quiz1();
        new Quiz1(10);
    }
}


// todo: 이거 왜 2가 젤 먼저 출력 되지?

// 이유는 static 블록의 실행 시기가 가장 먼저이기 때문
// `javac`를 통해 컴파일 이후 `jvm`이 바이트코드를 실행하면
// 필요한 클래스를 메모리에 올리게 돼
// 이 때 `main`메서드가 있는 클래스는 가장 먼저 로드하게 되는데 (당연히 실행을 위해서 `main` 메서드를 이용하니..) (그 외의 클래스는 필요에 따라 그 때 그 때 실행 시기가 다르다.)
// 따라서 해당 클래스의 static 변수든 블록이든 메서드든 메모리에 같이 올라가게 되는거지!! 그것도 가장 먼저!

// 이후 생성자에 따라서 객체가 만들어지고 클래스 내부의 흐름을 따라가되 static블록은 이미 초기에 실행됐으므로 다시 실행되지 않아
// 순서는 (초기) 2 -> (Quiz1()) 1, 3 -> (Quiz1(10)) 1, 3, 4

// 실행 결과
//2
//1
//3
//1
//3
//4


// oop의 근간은
// 객체별로 데이터를 따로따로 다루기

// 메모리 실행 순서 정리
// 메모리 구조 정리
// static 정리

// 오늘자 강사님 코드 한 번 훑어보기
// ppt 훑어보기
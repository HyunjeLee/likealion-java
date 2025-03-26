package ch2;

public class Exam1 {
    public static void main(String[] args) {
        //가장 많이 발생하는 캐스팅은...
        //"10" <-> 10
        //String <-> int
        //캐스팅은.. 기초타입의 데이터들만...
        //String 은 문자열을 쉽게 사용하기 위한 클래스이다.. 캐스팅 안된다.
        //별도의 함수를 제공하고 그 함수를 이용해서 변형시킨다..
        String str = "10";
        int intData = Integer.parseInt(str);

        String str2 = String.valueOf(20); // `int` 20을 `String` "20"으로 변환하는 확장함수
        System.out.println((str + 10) + "," + (intData + 10));//1010,20
        // String test1 = Integer.toString(20); // 이 방법도 유효하나 null 처리에 위험

        String str3 = "hello";
        int intStr3 = Integer.parseInt(str3);//runtime error.....
        //Exception in thread "main" java.lang.NumberFormatException: For input string: "hello"
    }
}

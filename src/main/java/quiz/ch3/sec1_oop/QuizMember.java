package quiz.ch3.sec1_oop;

class Member {
    int memberId;
    String name;
    String email;
    String password;
    String phoneNumber;

    Member() {}  // 기본 생성자 // 밑의 매개변수 생성자로 인해 자동적으로 생성되지 않음

    Member(int memberId, String name, String email, String password, String phoneNumber) {  // 매개변수 생성자
        this.memberId = memberId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }

    boolean register() {
        System.out.println("register called");

        return false;
    }

    boolean login() {
        System.out.println("login called");

        return false;
    }

    boolean logout() {
        System.out.println("logout called");

        return false;
    }

    String getInfo() {
        return memberId + " " + name + " " + email + " " + password + " " + phoneNumber;
    }

}


public class QuizMember {

    public static void main(String[] args) {
        Member member1 = new Member(1, "name1", "email1", "pw1", "ph1");
        Member member2 = new Member();

        member2.memberId = 2;
        member2.name = "name2";
        member2.email = "email2";
        member2.password = "pw2";
        member2.phoneNumber = "ph2";


        System.out.println(member1.getInfo());
        System.out.println(member2.getInfo());
    }
}

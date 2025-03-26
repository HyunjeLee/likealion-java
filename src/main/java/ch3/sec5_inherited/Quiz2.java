package ch3.sec5_inherited;

class User {  // public ?
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}

public class Quiz2 {

    public static void main(String[] args) {
        User user1 = new User("username1", 23);

        user1.setName("userName1");
        user1.setAge(22);

        System.out.println(user1.getName() + "'s age : " + user1.getAge() );
    }
}

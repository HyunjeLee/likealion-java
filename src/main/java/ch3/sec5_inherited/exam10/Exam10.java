package ch3.sec5_inherited.exam10;

// 공통 코드
class Employee {
    private String name;
    private int salary = 100;

    int calcBonus() {
        System.out.println("Employee Bonus Calculate");
        return salary * 12;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

class Calc {
    public static void calcBonus(Employee e) {
        System.out.println(e.calcBonus());
    }
}

class Salesman extends Employee {
    @Override
    int calcBonus() {
        System.out.println("Salesman Bonus Calculate");
        return getSalary() * 12 * 4;
    }
}

class Consultant extends Employee {
    @Override
    int calcBonus() {
        System.out.println("Consultant Bonus Calculate");
        return getSalary() * 12 * 2;
    }
}

public class Exam10 {
    public static void main(String[] args) {
        Calc.calcBonus(new Salesman());
        Calc.calcBonus(new Consultant());
    }
}

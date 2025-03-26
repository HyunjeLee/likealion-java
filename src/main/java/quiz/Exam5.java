package quiz;

public class Exam5 {
    public static void main(String[] args) {
        int javaScore = 83;
        int pythonScore = 100;

        System.out.printf("[ 교환 전 ]\njavaScore : %d\npythonScore : %d\n", javaScore, pythonScore);
        System.out.println("---------------------------");

        int temp = pythonScore;
        pythonScore = javaScore;
        javaScore = temp;

        System.out.printf("[ 교환 후 ]\njavaScore : %d\npythonScore : %d\n", javaScore, pythonScore);
    }
}

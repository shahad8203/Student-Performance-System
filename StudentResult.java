import java.util.Scanner;

public class StudentResult {

    public static void main(String[] args) {

        int i;
        double[] marks = new double[10];
        double total = 0.0;
        double average;
        double passMark = 50.0;

        Scanner input = new Scanner(System.in);

        for (i = 0; i < 10; i++) {
            System.out.print("Enter mark for student " + (i + 1) + ": ");
            marks[i] = input.nextDouble();
        }

        for (i = 0; i < 10; i++) {
            total = total + marks[i];
        }

        average = total / 10;

        if (average >= passMark) {
            System.out.println("Overall Result: Pass");
        } else {
            System.out.println("Overall Result: Fail");
        }

        input.close();
    }
}

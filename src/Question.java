import java.util.Scanner;

public class Question {
    static void test() {
        System.out.println("Let's test your programming knowledge.");
        System.out.println("Why do we use methods?");
        System.out.println("1. To repeat a statement multiple times.");
        System.out.println("2. To decompose a program into several small subroutines.");
        System.out.println("3. To determine the execution time of a program.");
        System.out.println("4. To interrupt the execution of a program.");


        String action = "";
        Scanner scanner = new Scanner(System.in);
        do {

            action = scanner.next();
            System.out.println("Please, try again.");

        } while (!action.equals("2"));


    }
}

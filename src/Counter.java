import java.util.Scanner;

public class Counter {
    static void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.println(i + "!");
        }
    }
}

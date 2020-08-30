import java.util.Scanner;

public class chatBot {
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Greeting.greet("Aid", "2018"); // change it as you need
        RemindName.remindName();
        Age.guessAge();
        Counter.count();
        Question.test();
        Ending.end();
    }

}
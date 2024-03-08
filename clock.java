import java.util.Scanner;

public class clock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number to convert from minutes to seconds: ");
        double min = scanner.nextDouble();

        double sec = min * 60;
        System.out.println("Result: " + sec);
    }
}

import java.util.Scanner;
public class MyName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name? -->");
        String name = scanner.nextLine();
        System.out.println("Nice to meet you, " + name);
        scanner.close();
    }
}

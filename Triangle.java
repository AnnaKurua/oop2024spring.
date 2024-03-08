import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the amount of rows you'd like( enter 0 to exit the program) -->  ");
            int rows = scanner.nextInt();
            if (rows == 0) {
                System.out.println("Exiting the program. Goodbye!");
                break; // Exit the while loop
            }
            for (int i = 1; i <= rows; i++ ) {
                for (int j = 1; j <=rows - i; j++) {
                    System.out.print("  ");
                }
                for (int k = 1; k <= (2 * i - 1); k++){
                    System.out.print("* ");
                }
                System.out.println();
            }

        }
        scanner.close();
    }

}
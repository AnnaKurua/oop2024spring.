import java.util.Scanner;
public class calculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            System.out.println("Enter two numbers you wish to compute: "); //now I want to make sure the user put in two numbers, if it's only one, or three, the question will repeat
            double num1 = scanner.nextInt();
            double num2 = scanner.nextInt();
            double add = num1 + num2;
            double subtract = num1 - num2;
            double multiply = num1 * num2;
            double divide = num1 / num2;

            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Would you like to add, subtract, multiply or divide these numbers? --> ");
            String compute = scanner1.nextLine();

            switch (compute) {
                case "add" -> System.out.println("adding these two numbers gives us: " + add);
                case "subtract" -> System.out.println("subtracting these two numbers gives us: " + subtract);
                case "multiply" -> System.out.println("multiplying these two numbers gives us: " + multiply);
                case "divide" -> System.out.println("dividing these numbers gives us: " + divide);



            }




       scanner.close();






    }
}

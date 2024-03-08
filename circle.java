import java.util.Scanner;
public class circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of your circle to calculate the area: ");
        double radius = scanner.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println("The area of this circle is  " + area);
        scanner.close();
    }
}

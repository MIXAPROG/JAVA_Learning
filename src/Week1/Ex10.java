package Week1;
import java.util.Scanner;


public class Ex10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Type the radius: ");
        double radius = Double.valueOf(scan.nextLine());
        double circumference = 2 * Math.PI * radius;

        System.out.println("Circumference of the circle: " + circumference);
    }
}

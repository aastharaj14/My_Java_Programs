import java.util.*;
public class Circle {
    public static void main(String[] args) {
        //input r, cal area and print
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius value");
        double r = sc.nextDouble();
        double area = Math.PI * Math.pow(r, 2);
        System.out.println(area);

        sc.close();
    }
}

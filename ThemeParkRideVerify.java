import java.util.Scanner;

public class ThemeParkRideVerify {
    public static void main(String[] args) {

        //allow the kid to ride only if height >= 120 , age >= 10 , has no back problem.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your height: ");
        int height = sc.nextInt();
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Do you have back problem?");
        String backProblem = sc.next();

        if(height >= 120 && age >= 10 && backProblem.equals("no")){
            System.out.println("You can ride!");
        }else{
            System.out.println("Sorry! You're not eligible");
        }
    }
}

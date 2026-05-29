import java.util.*;
public class Month {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //take input, case 1 -january
        System.out.println("Enter the number");
        int num = sc.nextInt();
        switch(num){
            case 1 : System.out.println("Jan");
            break;
            case 2 : System.out.println("Feb");
            break;
            case 3 : System.out.println("March");
            break;
            case 4 : System.out.println("April");
            break;
            case 5 : System.out.println("May");
            break;
            case 6 : System.out.println("Jun");
            break;
            default : System.out.println("Enter correct number");
        }
        sc.close();
    }
}

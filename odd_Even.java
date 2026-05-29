import java.util.*;
public class odd_Even {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
        int userInput = sc.nextInt();
        if(userInput % 2 == 0){
            System.out.println("Even");
        } else{
            System.out.println("Odd");
        }
    }
}
}

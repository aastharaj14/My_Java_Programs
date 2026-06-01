import java.util.*;
public class Menudriven_most_imp {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int input;  //already declared here
    do{
        System.out.println("MENU");
        System.out.println("Enter 1 to enter student's marks");
        System.out.println("Enter 0 to stop prgram");
        System.out.println("Your choice");
         input = sc.nextInt(); // can't declare same variables twice, therefore, int not used here
    if(input == 1){
        System.out.println("Enter the marks");
        int marks = sc.nextInt();
        if(marks >= 90){
            System.out.println("This is Good");
        } else if(marks >=60 && marks <=89){
            System.out.println("This is also Good");
        } else{
            System.out.println("This is Good as well");
        }
    } else{
        System.out.println("Program Stopped");
    }

      } while(input !=0);  //  this will keep taking the input from user for marks until 0 is not entered.
      sc.close();
    }
}
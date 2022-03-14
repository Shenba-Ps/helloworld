import java.util.*;
//This is a Subtraction class,used to Subtract two numbers
class Subtraction{
    public static void main(String[] args) {
        //This is the scanner input
        Scanner scan=new Scanner(System.in);
        //Asking the user to give input
        System.out.println("Enter the num1");
        int num1=scan.nextInt();
        //Asking the user to give input
        System.out.println("Enter the num2");
        int num2=scan.nextInt();
        //complete the Subtraction
        int num3=num1-num2;
        //print the result
        System.out.println("the result is"+num3);


    }
}
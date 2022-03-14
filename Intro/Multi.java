import java.util.*;
//This is a Multiple class,used to Multiply two numbers
class Multi{
    public static void main(String[] args) {
        //This is the scanner input
        Scanner scan=new Scanner(System.in);
        //Asking the user to give input
        System.out.println("Enter the num1");
        int num1=scan.nextInt();
        //Asking the user to give input
        System.out.println("Enter the num2");
        int num2=scan.nextInt();
        //Asking the user to give input
        System.out.println("Enter the num3");
        int num3=scan.nextInt();
        //complete the multiplication
        int num4=num1*num2*num3;
        //print the reslt
        System.out.println("the result is"+num4);


    }
}
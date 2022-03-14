import java.util.*;
//This is a division class,used to divide & find quotient&reminder
class Divi{
    public static void main(String[] args) {
        //This is the scanner input
        Scanner scan=new Scanner(System.in);
        //Asking the user to give input
        System.out.println("Enter the Dividend");
        int Dividend=scan.nextInt();
        //Asking the user to give input
        System.out.println("Enter the Divisor");
        int Divisor=scan.nextInt();
        //complete the Division
        int Qotient=Dividend/Divisor;
        int Reminder=Dividend%Divisor;
        //print the result
        System.out.println("the result is"+Qotient);
        System.out.println("the result is"+Reminder);


    }
}
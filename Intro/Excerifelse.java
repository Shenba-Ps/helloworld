import java.util.*;
class Excerifelse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the day");
        String today = scan.nextLine();
        if (today.equals("monday")) {
            System.out.println("hi buddy");
        }
        else if(today.equals("wednesday")){
            System.out.println("hi boss");
        }
        else {
            System.out.println("cool buddy");
        }
    }
}
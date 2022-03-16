import java.util.*;
class Scanelseif{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the value of a");
        int a=scan.nextInt();
        System.out.println("enter the value of b");
        int b=scan.nextInt();
        if(a>=b){
            System.out.println("shenbagarajan");
        }
        else if (a<=b){
            System.out.println("thivakar");
        }
        else if (a==b){
            System.out.println("rajan");
        }
        else if (a!=b){
            System.out.println("sachin");
        }
    }
}
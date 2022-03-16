import java.util.*;
class Password{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String a=new String("shenba");
        String b=new String("shenba");
        if (a==b){
            System.out.println("correct password");
        }
        else {
            System.out.println("wrong password");
        }
    }
}
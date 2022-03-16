import java.util.*;
class Greetingscan{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the day");
        String today=scan.nextLine();
        switch (today){
            case "monday":{
                System.out.println("hi buddy cool");
                break;
            }
            case "tuesday":{
                System.out.println("hello buddy");
                break;
            }
            case "wednesday":{
                System.out.println("sivaji");
                break;
            }
            default: {
                System.out.println("nothing");
            }
        }




        }
    }
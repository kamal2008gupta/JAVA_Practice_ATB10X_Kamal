package dec30;

 import java.util.Scanner;

public class if_condition {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("enter the age");
        int age = scan.nextInt();
        if (age>18)
        {
            System.out.println("you are allowed to vote");
        }
        else
        {
            System.out.println("you are not allowed");
        }

    }
}

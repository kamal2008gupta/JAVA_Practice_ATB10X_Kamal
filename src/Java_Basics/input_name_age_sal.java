package dec30;

import java.util.Scanner;
public class input_name_age_sal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the name");
        String name = scan.next();
        System.out.println("enter the age");
        int age = scan.nextInt();
        System.out.println("enter the sal");
        String sal = scan.next();
        System.out.printf("person name is %s", name);
        System.out.println("person age is" +age);
        System.out.println("person salary is"+ sal);
        scan.close();
    }

}

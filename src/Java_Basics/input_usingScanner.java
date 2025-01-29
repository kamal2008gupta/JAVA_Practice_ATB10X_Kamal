package dec30;

import java.util.Scanner;

public class input_usingScanner {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        System.out.println("enter the age");
        // store the value
        int age = scan.nextInt();
        System.out.println(age>25 ? "allowed to goa": "not allowed");
    }
}

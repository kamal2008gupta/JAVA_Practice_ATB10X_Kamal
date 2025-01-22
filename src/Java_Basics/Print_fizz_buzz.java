package Java_Basics;

import java.util.Scanner;

public class Print_fizz_buzz {
    public static void main(String[] args) {
        // No is multiple of 3 print fizz
        // No is multiple of 5 print buzz else print no

        System.out.printf("Enter the no :");
        Scanner scan =new Scanner(System.in);
        int num= scan.nextInt();

        for (int i=1; i<=num; i++)
        if (i%3==0)
        {
            System.out.println("Number is fizz"+i );
        }
        else if (i%5==0) {
            System.out.println("number is buzz:"+i);
        }
         else {
            System.out.println("number is other" + i);
        }
         scan.close();
    }
}

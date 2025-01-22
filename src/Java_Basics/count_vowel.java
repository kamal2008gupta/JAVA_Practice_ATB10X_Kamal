package Java_Basics;

import java.util.Scanner;

public class count_vowel
{
    public static void main(String[] args)
    {
        int vowel=0, cons=0;

        System.out.printf("enter the sting for which you want to count vowel & constant");
        Scanner scan = new Scanner(System.in);
        String words = scan.nextLine();


        for(int i=0; i<words.length();i++) {
            char ch = words.charAt(i);  //get the character index
            // System.out.println("name = " + ch);


            if (Character.isLetter(ch))
               // ch = Character.toLowerCase(ch);
            {


                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowel++;
                } else {
                    cons++;
                }
            }

        }
        System.out.println("no of vowel is :" + vowel);
        System.out.printf("no of constant is :" + cons);
        scan.close();
    }
}

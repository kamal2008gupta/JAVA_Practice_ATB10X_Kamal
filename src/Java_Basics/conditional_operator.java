package dec30;

public class conditional_operator {
    public static void main (String [] args) {
     /* int  a=30,b=20;
        String max=a>b? "a is bigger": "b is smaller";
        System.out.println("bigger numnber is" + max);*/

      /*  int x = 10;
        int y = 25;
        int z = x + y;

        System.out.println("Sum of x+y = "+ z);*/

        // check grade of the student

        /*int score=40;
        String grade = (score >= 90) ? "A" :(score >= 80) ? "B" : (score>= 70) ? "C" : (score >= 60) ? "D" : (score >= 50) ? "E" :"F";
        System.out.printf("your grade is %s", grade);
        System.out.println("your grade is " +grade);
*/

        // check max number out of given 3 no

          int a=3 , b=20, c=5;
          String max= (a>b && a>c) ? "a" : (b>c? "b" : "c");
          System.out.printf("max number is " +max);


    }
}

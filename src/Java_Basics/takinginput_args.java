package Java_Basics;

public class takinginput_args {
    public static void main(String[] args) {
        int age=Integer.parseInt(args [0]);
        String name= args [1];
        int salary= Integer.parseInt(args [2]);
        System.out.println("-----User Details-------");
        System.out.println("age"+age);
        System.out.println("sal:"+ salary);
        System.out.println("name:"+name);
    }
}

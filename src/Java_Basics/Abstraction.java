package Java_Basics;

public class Abstraction {

    public static void main(String[] args) {
        MyBook PrintBook = new MyBook("hacker", "david", 50);
        PrintBook.getdetails();
    }
}

    abstract class Book {
        String name;
        String author;
        double price;

        public Book(String name, String author, double price) {
            this.name = name;
            this.author = author;
            this.price = price;
        }

        abstract void getdetails();
    }

    class MyBook extends Book {
        public MyBook(String name, String author, double price) {
            super(name, author, price);
        }

        @Override
        void getdetails() {
            System.out.println("Name:"+name+ ",Author :" +author+ ", price:" +price);
        }

    }







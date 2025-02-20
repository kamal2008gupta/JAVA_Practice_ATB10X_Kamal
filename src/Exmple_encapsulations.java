public class Exmple_encapsulations {
    public static void main(String[] args) {
        Bankaccount bankaccount =new Bankaccount("rakesh",50000);
        Bankaccount bankaccount1=new Bankaccount("ravi",4000);
        System.out.println("your account details are as below:");
        bankaccount.displayinfo();
        bankaccount1.displayinfo();
    }
}

class Bankaccount{
 private    String accountholder;
 private    double balance;
    // constructor to intialization

    public  Bankaccount(String accountholder,double balance)
    {
        this.accountholder=accountholder;
        this.balance=balance;
    }

    public String getAccountholder() {
        return accountholder;
    }

    public double getBalance() {
        return balance;
    }

    public void displayinfo(){
        System.out.printf("Account holder name is: %s%n Balance of account is: %.2f%n",accountholder,balance);
    }
}

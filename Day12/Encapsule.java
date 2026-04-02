//Encapsulation
public class Encapsule {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        ba.balance = 100000;

        System.out.println(ba.balance);
    }
    
}

class BankAccount{
    double balance;
}

import java.util.Scanner;

class BankAccount{
    private double balance;

    BankAccount(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
        }
    }

    public double withdraw(double amount){
        if (amount>0 && amount<= balance){
            return balance-=amount;
        }
        return 0;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        BankAccount bankAccount =  new BankAccount(5000);
        System.out.println("Available Account Balance : " + bankAccount.getBalance());

        System.out.println(" Enter the amount you want to Deposit in your Account : " );
        Scanner sc = new Scanner(System.in);
        double depositAmt = sc.nextDouble();

        bankAccount.deposit(depositAmt);
        System.out.println("Account Balance after Depositing : " + bankAccount.getBalance());

        System.out.println("Enter the amount you want to Withdraw from your Account : ");
        double withdrawAmt = sc.nextDouble();
        System.out.println("Account  Balance after Withdrawing : " + bankAccount.withdraw(withdrawAmt));

    }

}

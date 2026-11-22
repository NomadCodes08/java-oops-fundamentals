abstract class BankingAccount{

    String accountNumber;
    String accountHolderName;
    double balance;

    BankingAccount( String accountNumber, String accountHolderName, double balance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposit( double amount){
        if(amount>0){
            balance+=amount;
            getBalance();
        }
        System.out.println("Amount " + amount + " successfully deposited.");
    }

    void getBalance(){
        System.out.println(" Available Balance : " + balance);
    }

    abstract void withdraw(double amount);

}

class SavingsAccount extends BankingAccount{

    SavingsAccount(String accountNumber, String accountHolderName, double balance){
        super(accountNumber, accountHolderName, balance);

    }

    void withdraw(double amount){
        if(balance-amount >= 1000){
            balance-=amount;
            System.out.println("Savings Account: Amount " + amount + " withdrawn successfully. ");
            getBalance();
        }
        else{
            System.out.println("Savings Account: Insufficient Balance. Required to maintain minimum balance of 1000.");
        }
    }
}

class CurrentAccount extends BankingAccount{

    CurrentAccount(String accountNumber, String accountHolderName, double balance){
        super(accountNumber, accountHolderName, balance);

    }

    void withdraw(double amount){
        if( balance+amount <= 10000){
            balance-=amount;
            System.out.println("Current Account: Amount " + amount + " withdrawn successfully. ");
            getBalance();
        }
        else{
            System.out.println("Current Account:  Withdrawal failed. Overdraft limit exceeded. ");
        }
    }
}

class Banking{

    void depositAmount(double amount, BankingAccount account){
        account.deposit(amount);
    }

    void withdrawFromAccount(double amount, BankingAccount account){
        account.withdraw(amount);
    }

}

public class AbstractionAccountDemo {

    public static void main(String[] args) {
       Banking banking = new Banking();
       banking.depositAmount(1000, new SavingsAccount("12345", "Kim", 2500));
       banking.withdrawFromAccount(5000, new CurrentAccount("98765", "Tan", 6000));
    }
}

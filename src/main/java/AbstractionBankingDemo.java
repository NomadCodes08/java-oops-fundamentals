interface PaymentInterface{
    void pay(double amount);
}

class UPIPaymentService implements PaymentInterface{

    public void pay(double amount){
        System.out.println("UPI ID verification in process ... ");
        System.out.println("Payment done by UPI for amount: " + amount);
    }

}

class DebitCardService implements PaymentInterface{

    public void pay(double amount) {
        System.out.println("Debit card details verification in process ... ");
        System.out.println("Payment done using Debit card for amount: " + amount);
    }
}

class CreditCardService implements PaymentInterface{

    public void pay(double amount) {
        System.out.println("Credit card details verification in process ... ");
        System.out.println("Payment done using Credit card for amount: " + amount);
    }
}

class BankingApp{

    PaymentInterface payment;

    void makePayment(PaymentInterface payment){
        System.out.println(" Payment Initiated ...");
        payment.pay(5000);
        System.out.println(" Payment Completed ...");
    }
}


public class AbstractionBankingDemo {

    public static void main(String[] args) {
        BankingApp bankingApp = new BankingApp();

        bankingApp.makePayment(new CreditCardService());
    }
}

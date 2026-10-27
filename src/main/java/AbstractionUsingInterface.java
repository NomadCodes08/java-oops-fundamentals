interface Payment{
    void pay();
}

class UPIPayment implements Payment{
     public void pay(){
         System.out.println(" Payment done using UPI. ");
     }
}

class CardPayment implements Payment{

    public void pay(){
        System.out.println(" Payment done using Card. ");
    }
}

public class AbstractionUsingInterface {

    public static void main(String[] args) {
        Payment payment = new UPIPayment();
        payment.pay();

        CardPayment cardPayment = new CardPayment();
        cardPayment.pay();
    }
}

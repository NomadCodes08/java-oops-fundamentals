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

class PaymentService{

    void processPayment( Payment payment){
        payment.pay();
    }

}

public class AbstractionUsingInterface {

    public static void main(String[] args) {
        Payment payment = new UPIPayment();
        payment.pay();

        PaymentService paymentService = new PaymentService();
        paymentService.processPayment(new CardPayment());
    }
}

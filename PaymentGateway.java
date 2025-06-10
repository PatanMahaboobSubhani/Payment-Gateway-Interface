//1. Interface: PaymentGateway
public interface PaymentGateway {
    void processPayment(double amount);
}

//2. Class: CreditCardPayment
public class CreditCardPayment implements PaymentGateway {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of ₹" + amount);
    }
}

//3. Class: UPIPayment
public class UPIPayment implements PaymentGateway {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing UPI payment of ₹" + amount);
    }
}

//4. Demonstration with Polymorphism
public class Main {
    public static void main(String[] args) {
        PaymentGateway payment1 = new CreditCardPayment();
        PaymentGateway payment2 = new UPIPayment();

        payment1.processPayment(2500.00);
        payment2.processPayment(500.00);
    }
}

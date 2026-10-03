package OrderProcessing;

public class OrderProcessingApp {
    public static void main(String[] args){
        Order order = new Order("ORD-001", PaymentMethod.CREDIT_CARD, 99.99);
        order.displayInfo();
        order.advanceStatus(); // PLACED -> CONFIRMED
        order.advanceStatus(); // CONFIRMED -> SHIPPED
        order.displayInfo();

        System.out.println("Cancel after shipping: " + order.cancel()); // false
    }
}

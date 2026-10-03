package OrderProcessing;

public class Order {
    private final String orderId;
    private OrderStatus status;
    private final PaymentMethod paymentMethod;
    private final double amount;

    public Order(String orderId, PaymentMethod paymentMethod, double amount){
        this.orderId = orderId;
        this.paymentMethod = paymentMethod;
        this.amount = amount;
        this.status = OrderStatus.PLACED;
    }

    public boolean advanceStatus() {
        switch(status){
            case PLACED:
                status = OrderStatus.CONFIRMED;
                return true;
            case CONFIRMED:
                status = OrderStatus.SHIPPED;
                return true;
            case SHIPPED:
                status = OrderStatus.DELIVERED;
                return true;
            default:
                return false;
        }
    }

    public boolean cancel() {
        if(status == OrderStatus.PLACED || status == OrderStatus.CONFIRMED){
            status = OrderStatus.CANCELLED;
            return true;
        }
        return false;
    }

    public double getTotalWithFees(){
        return amount + (amount * paymentMethod.getFeePercent() /100);

    }

    public void displayInfo() {
        System.out.printf("Order %s | Status: %s | Payment: %s | Amount: $%.2f (with fees: $%.2f)%n", orderId, status, paymentMethod.getDisplayName(), amount, getTotalWithFees());
    }
}

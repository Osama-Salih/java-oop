public class Order {
    public enum OrderStatus {
        PENDING,
        PREPARING,
        COMPLETED,
        DELIVERING,
        CANCELED,
    }

    private OrderStatus status;

    public boolean isDeliverable() {
        if (getStatus() == OrderStatus.DELIVERING) {
            return true;
        }
        return false;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
}

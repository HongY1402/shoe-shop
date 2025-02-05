package Models;

import java.sql.Timestamp;

/**
 *
 * @author Duy
 */
public class Order {
    private String orderId;
    private float totalAmount;
    private Timestamp orderDate;
    private String PaymentStatus;
    private String orderStatus;
    private String customerId;
    private String methodId;

    public Order(String orderId, float totalAmount, Timestamp orderDate, String paymentStatus, String orderStatus,
            String customerId, String methodId) {
        this.orderId = orderId;
        this.totalAmount = totalAmount;
        this.orderDate = orderDate;
        PaymentStatus = paymentStatus;
        this.orderStatus = orderStatus;
        this.customerId = customerId;
        this.methodId = methodId;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getMethodId() {
        return methodId;
    }

    public void setMethodId(String methodId) {
        this.methodId = methodId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public float getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(float totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Timestamp getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Timestamp orderDate) {
        this.orderDate = orderDate;
    }

    public String getPaymentStatus() {
        return PaymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        PaymentStatus = paymentStatus;
    }

}

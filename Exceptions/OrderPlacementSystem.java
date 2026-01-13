class InvalidCouponException extends Exception {
    InvalidCouponException(String message) { super(message); }
}

class PaymentGatewayTimeoutException extends Exception {
    PaymentGatewayTimeoutException(String message) { super(message); }
}

class AddressNotFoundException extends Exception {
    AddressNotFoundException(String message) { super(message); }
}

class OrderSystem {
    private String[] validCoupons = {"SAVE10", "DISCOUNT20"};
    private boolean paymentGatewayUp = true;
    private String[] validAddresses = {"123 Main St", "456 Oak Ave"};
    
    void placeOrder(String coupon, String address, int paymentTime) throws InvalidCouponException, PaymentGatewayTimeoutException, AddressNotFoundException {
        // Check coupon validity
        boolean couponValid = false;
        for (String validCoupon : validCoupons) {
            if (validCoupon.equals(coupon)) {
                couponValid = true;
                break;
            }
        }
        if (!couponValid) {
            throw new InvalidCouponException("Coupon '" + coupon + "' is invalid");
        }
        
        // Check payment gateway
        if (paymentTime > 30 || !paymentGatewayUp) {
            throw new PaymentGatewayTimeoutException("Payment gateway timeout or unavailable");
        }
        
        // Check address
        boolean addressValid = false;
        for (String validAddress : validAddresses) {
            if (validAddress.equals(address)) {
                addressValid = true;
                break;
            }
        }
        if (!addressValid) {
            throw new AddressNotFoundException("Address '" + address + "' not found");
        }
        
        System.out.println("Order placed successfully to: " + address);
    }
    
    void setPaymentGatewayStatus(boolean status) { this.paymentGatewayUp = status; }
}

public class OrderPlacementSystem {
    public static void main(String[] args) {
        OrderSystem order = new OrderSystem();
        
        try {
            order.placeOrder("INVALID", "123 Main St", 25);
        } catch (InvalidCouponException | PaymentGatewayTimeoutException | AddressNotFoundException e) {
            System.out.println("Order failed: " + e.getMessage());
        }
    }
}
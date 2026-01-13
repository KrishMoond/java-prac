class OutOfStockException extends Exception {
    OutOfStockException(String message) { super(message); }
}

class CouponAlreadyUsedException extends Exception {
    CouponAlreadyUsedException(String message) { super(message); }
}

class RefundPeriodExpiredException extends Exception {
    RefundPeriodExpiredException(String message) { super(message); }
}

class ECommerceSystem {
    private int stock = 10;
    private String[] usedCoupons = {"SAVE10"};
    
    void placeOrder(int quantity, String coupon) throws OutOfStockException, CouponAlreadyUsedException {
        if (quantity > stock) {
            throw new OutOfStockException("Only " + stock + " items in stock, cannot order " + quantity);
        }
        
        for (String usedCoupon : usedCoupons) {
            if (usedCoupon.equals(coupon)) {
                throw new CouponAlreadyUsedException("Coupon " + coupon + " already used");
            }
        }
        
        stock -= quantity;
        System.out.println("Order placed successfully. Remaining stock: " + stock);
    }
    
    void processRefund(int daysSincePurchase) throws RefundPeriodExpiredException {
        if (daysSincePurchase > 7) {
            throw new RefundPeriodExpiredException("Refund period expired. Only 7 days allowed, " + daysSincePurchase + " days passed");
        }
        System.out.println("Refund processed successfully");
    }
}

public class ECommercePlatform {
    public static void main(String[] args) {
        ECommerceSystem ecommerce = new ECommerceSystem();
        
        try {
            ecommerce.placeOrder(15, "DISCOUNT20"); // Exceeds stock
        } catch (OutOfStockException | CouponAlreadyUsedException e) {
            System.out.println("Order failed: " + e.getMessage());
        }
        
        try {
            ecommerce.processRefund(10); // Beyond 7 days
        } catch (RefundPeriodExpiredException e) {
            System.out.println("Refund failed: " + e.getMessage());
        }
    }
}
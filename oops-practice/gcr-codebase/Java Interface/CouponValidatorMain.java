public class CouponValidatorMain {
    public static void main(String[] args) {
        String[] coupons = {"SAVE10", "XMAS2026", "DIS5", "WELCOME", "AB12"};
        ShoppingCart cart = new ShoppingCart();

        System.out.println("=== Coupon Validator ===");
        for (String coupon : coupons) {
            boolean valid = cart.validateCoupon(coupon);
            System.out.println(coupon + ": " + (valid ? "Valid" : "Invalid"));
        }
    }
}

interface CouponValidator {
    boolean validateCoupon(String code);

    static boolean isLengthValid(String code) {
        return code != null && code.length() >= 5 && code.length() <= 10;
    }
}

class ShoppingCart implements CouponValidator {
    @Override
    public boolean validateCoupon(String code) {
        if (!CouponValidator.isLengthValid(code)) {
            return false;
        }
        return code.startsWith("SAVE") || code.startsWith("DIS") || code.equals("WELCOME");
    }
}

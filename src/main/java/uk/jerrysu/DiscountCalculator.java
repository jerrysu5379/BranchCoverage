package uk.jerrysu;

public class DiscountCalculator {
    public double calculateDiscount(double totalAmount, boolean isMember) {
        if (totalAmount > 100) {
            if (isMember) {
                return totalAmount * 0.8;
            } else {
                return totalAmount * 0.9;
            }
        } else {
            if (isMember) {
                return totalAmount * 0.95;
            } else {
                return totalAmount;
            }
        }
    }
}

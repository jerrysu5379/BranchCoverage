package uk.jerrysu;

public class DiscountChecker {
    public String checkDiscount(boolean isWeekend, boolean isMember) {
        if (isWeekend && isMember) {
            return "20% Discount";
        } else if (isWeekend || isMember) {
            return "10% Discount";
        } else {
            return "No Discount";
        }
    }
}

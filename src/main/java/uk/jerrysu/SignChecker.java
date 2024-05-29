package uk.jerrysu;

public class SignChecker {
    public String evaluate(int x, int y) {
        if ((x > 0 && y > 0) || (x < 0 && y < 0)) {
            return "Same sign";
        } else if (x == 0 || y == 0) {
            return "Zero";
        } else {
            return "Different sign";
        }
    }
}


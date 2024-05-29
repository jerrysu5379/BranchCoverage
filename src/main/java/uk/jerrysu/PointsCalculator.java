package uk.jerrysu;

public class PointsCalculator {
    public int calculatePoints(int purchases, int reviews) {
        int points = 0;
        if (purchases > 0) {
            points += 10;
            if (reviews > 5) {
                points += 20;
            } else {
                points += 5;
            }
        } else {
            if (reviews > 0) {
                points += 5;
            }
        }
        return points;
    }
}
public class Taximeter {
    static final int flagDistance = 2;
    static final int extraChargeDistance = 8;
    static final double flagPrice = 6;
    static final double pricePerKilometer = 0.8;
    static final double extraPricePerKilometer = 0.8 * 0.5;

    public int getPrice(int distance) {
        double price = countPrice(distance);
        return getRoundPrice(price);
    }

    private double countPrice(int distance) {
        if (distance < flagDistance) {
            return flagPrice;
        }
        else if (distance < extraChargeDistance) {
            return countNormalPrice(distance);
        }
        else {
            return countExtraPrice(distance);
        }
    }

    private double countExtraPrice(int distance) {
        return countNormalPrice(extraChargeDistance) + (pricePerKilometer + extraPricePerKilometer) * (distance - extraChargeDistance);
    }

    private double countNormalPrice(int distance) {
        return flagPrice + (distance - flagDistance) * pricePerKilometer;
    }

    private int getRoundPrice(double price ) {
        return (int) Math.round(price);
    }
}

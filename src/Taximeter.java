public class Taximeter {
    static final double flagPrice = 6;
    static final double flagDistance = 2;
    static final double pricePerKilometer = 0.8;

    public int getPrice(int distance) {
        double price = countPrice(distance);
        return getRoundPrice(price);
    }

    private double countPrice(int distance) {
        if (distance < flagDistance) {
            return flagPrice;
        } else  {
            return flagPrice + (distance - flagDistance) * pricePerKilometer;
        }
    }

    private int getRoundPrice(double price ) {
        return (int) Math.round(price);
    }
}

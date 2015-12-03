public class DistanceManager {
    static final int flagDistance = 2;
    static final int extraChargeDistance = 8;
    static final double extraPricePerKilometer = 0.8 * 0.5;
    static final double flagPrice = 6;
    static final double pricePerKilometer = 0.8;

    public double countPrice(int distance) {
        if (distance < flagDistance) {
            return new FlagPriceCalculator().count(distance);
        }
        else if (distance < extraChargeDistance) {
            return new NormalPriceCalculator().count(distance);
        }
        else {
            return new ExtraPriceCalculator().count(distance);
        }
    }

}

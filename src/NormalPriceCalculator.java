public class NormalPriceCalculator implements PriceCalculator{

    @Override
    public double count(int distance) {
        return DistanceManager.flagPrice + (distance - DistanceManager.flagDistance) * DistanceManager.pricePerKilometer;
    }
}

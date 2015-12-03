public class ExtraPriceCalculator implements PriceCalculator{

    @Override
    public double count(int distance) {
        return DistanceManager.flagPrice + (DistanceManager.extraChargeDistance - DistanceManager.flagDistance) * DistanceManager.pricePerKilometer +
                (DistanceManager.pricePerKilometer + DistanceManager.extraPricePerKilometer) * (distance - DistanceManager.extraChargeDistance);
    }
}

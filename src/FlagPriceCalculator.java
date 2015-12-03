public class FlagPriceCalculator implements PriceCalculator{

    @Override
    public double count(int distance) {
        return DistanceManager.flagPrice;
    }
}

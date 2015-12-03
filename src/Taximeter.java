public class Taximeter {

    public int getPrice(int distance) {
        DistanceManager distanceManager = new DistanceManager();
        double price = distanceManager.countPrice(distance);
        return getRoundPrice(price);
    }

    private int getRoundPrice(double price ) {
        return (int) Math.round(price);
    }
}

public class SpaceShip {

    private TravelStrategy strategy;

    public void setStrategy(TravelStrategy strategy) {
        this.strategy = strategy;
    }

    public void travel() {
        if (strategy == null) {
            throw new IllegalStateException("Travel strategy is not set");
        }

        strategy.travel();
    }
}
public class SafeTravelStrategy implements TravelStrategy {

    @Override
    public void travel() {
        System.out.println("Traveling with maximum safety");
    }
}
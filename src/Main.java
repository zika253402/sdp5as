public class Main {

    public static void main(String[] args) {

        SpaceShip ship = new SpaceShip();

        ship.setStrategy(new FastTravelStrategy());
        ship.travel();

        ship.setStrategy(new FuelSavingStrategy());
        ship.travel();

        ship.setStrategy(new SafeTravelStrategy());
        ship.travel();
    }
}
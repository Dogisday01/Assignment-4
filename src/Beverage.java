public class Beverage implements Product {
    @Override
    public void prepare() {
        System.out.println("Preparing beverage");
    }

    @Override
    public void cook() {
        System.out.println("Cooking beverage");
    }

    @Override
    public void pack() {
        System.out.println("Packing beverage");
    }
}

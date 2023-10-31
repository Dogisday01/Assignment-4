public class Pizza implements Product {
    @Override
    public void prepare() {
        System.out.println("Preparing pizza");
    }

    @Override
    public void cook() {
        System.out.println("Cooking pizza");
    }

    @Override
    public void pack() {
        System.out.println("Packing pizza");
    }
}

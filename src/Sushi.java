public class Sushi implements Product {
    @Override
    public void prepare() {
        System.out.println("Preparing sushi");
    }

    @Override
    public void cook() {
        System.out.println("Cooking sushi");
    }

    @Override
    public void pack() {
        System.out.println("Packing sushi");
    }
}

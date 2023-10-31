public class Main {
    public static void main(String[] args) {
        ProductFactory factory = new ProductFactory();
        Order order = new Order();
        order.addProduct(factory.createProduct("Pizza"));
        order.addProduct(factory.createProduct("Sushi"));

        Observer customer = new Customer();
        Observer kitchen = new Kitchen();
        Observer deliveryService = new DeliveryService();

        order.addObserver(customer);
        order.addObserver(kitchen);
        order.addObserver(deliveryService);

        order.processOrder();
    }
}

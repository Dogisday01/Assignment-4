
public class DeliveryService implements Observer {
    @Override
    public void update(Order order) {
        System.out.println("Delivery Service: Delivering the order");
    }
}

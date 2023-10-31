public class Customer implements Observer {
    @Override
    public void update(Order order) {
        System.out.println("Order status: Ready for delivery");
    }
}

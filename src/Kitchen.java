public class Kitchen implements Observer {
    @Override
    public void update(Order order) {
        System.out.println("Kitchen: Start cooking");
    }
}
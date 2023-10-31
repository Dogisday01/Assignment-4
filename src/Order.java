import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Observer> observers = new ArrayList<>();
    private List<Product> products = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void processOrder() {
        System.out.println("Order is being processed...");
        for (Product product : products) {
            product.prepare();
            product.cook();
            product.pack();
        }
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
}

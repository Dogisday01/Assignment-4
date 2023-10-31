public class ProductFactory {
    public Product createProduct(String type) {
        if ("Pizza".equalsIgnoreCase(type)) {
            return new Pizza();
        } else if ("Sushi".equalsIgnoreCase(type)) {
            return new Sushi();
        } else if ("Beverage".equalsIgnoreCase(type)) {
            return new Beverage();
        }
        // Добавьте другие типы продуктов по мере необходимости
        return null;
    }
}

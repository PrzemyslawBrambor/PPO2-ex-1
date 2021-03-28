package wsh.przemyslawbrambor;

public class Warehouse {
    private int totalProducts = 0;


    public void addProduct(Product product) {
        totalProducts += 1;
        Logger.getInstance().printMessage("Product has been added to our warehouse Product: " + product);
        Logger.getInstance().printMessage("Total products: " + totalProducts);
    }
}

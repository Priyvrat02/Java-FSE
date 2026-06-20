import java.util.ArrayList;

public class Inventory {

    private ArrayList<Product> products;

    public Inventory() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
        System.out.println(product.getProductName() + " added successfully.");
    }

    public void updateProduct(int id, int quantity, double price) {

        for (Product product : products) {

            if (product.getProductId() == id) {
                product.setQuantity(quantity);
                product.setPrice(price);

                System.out.println("Product updated successfully.");
                return;
            }
        }

        System.out.println("Product not found.");
    }

    public void deleteProduct(int id) {

        for (int i = 0; i < products.size(); i++) {

            if (products.get(i).getProductId() == id) {
                products.remove(i);
                System.out.println("Product deleted successfully.");
                return;
            }
        }

        System.out.println("Product not found.");
    }

    public void displayProducts() {

        if (products.isEmpty()) {
            System.out.println("Inventory is empty.");
            return;
        }

        System.out.println("\n----- Inventory -----");

        for (Product product : products) {
            System.out.println(product);
            System.out.println("---------------------");
        }
    }
}
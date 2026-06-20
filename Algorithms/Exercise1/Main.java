
public class Main {

    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        inventory.addProduct(new Product(101, "Laptop", 10, 65000));
        inventory.addProduct(new Product(102, "Mouse", 25, 800));
        inventory.addProduct(new Product(103, "Keyboard", 15, 1800));

        inventory.displayProducts();

        System.out.println("\nUpdating Product...\n");
        inventory.updateProduct(102, 30, 850);

        inventory.displayProducts();

        System.out.println("\nDeleting Product...\n");
        inventory.deleteProduct(101);

        inventory.displayProducts();
    }
}

package Algorithms.Exercise2;
public class Main {

    public static void main(String[] args) {

        Product[] products = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Keyboard", "Electronics"),
                new Product(103, "Mouse", "Electronics"),
                new Product(104, "Shoes", "Fashion"),
                new Product(105, "Watch", "Accessories")
        };

        System.out.println("------ Linear Search ------");

        Product result1 = Search.linearSearch(products, 103);

        if (result1 != null) {
            System.out.println(result1);
        } else {
            System.out.println("Product not found.");
        }

        System.out.println("\n------ Binary Search ------");

        Product result2 = Search.binarySearch(products, 104);

        if (result2 != null) {
            System.out.println(result2);
        } else {
            System.out.println("Product not found.");
        }

        System.out.println("\nTime Complexity Analysis");
        System.out.println("------------------------");
        System.out.println("Linear Search : Best O(1), Average O(n), Worst O(n)");
        System.out.println("Binary Search : Best O(1), Average O(log n), Worst O(log n)");
        System.out.println("\nBinary Search is better for large e-commerce platforms because it searches much faster when data is sorted.");
    }
}
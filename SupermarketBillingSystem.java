import java.util.Scanner;

public class SupermarketBillingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cart cart = new Cart();

        Product apple = new Product("Apple", 0.50, 100);
        Product bread = new Product("Bread", 1.50, 50);
        Product milk = new Product("Milk", 1.00, 30);

        System.out.println("Welcome to the Supermarket!");

        while (true) {
            System.out.println("1. Add Product to Cart");
            System.out.println("2. Remove Product from Cart");
            System.out.println("3. View Cart");
            System.out.println("4. Checkout");
            System.out.println("5. Exit");

            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Available Products:");
                    System.out.println("1. Apple");
                    System.out.println("2. Bread");
                    System.out.println("3. Milk");
                    System.out.print("Select a product: ");
                    int productChoice = scanner.nextInt();
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();

                    switch (productChoice) {
                        case 1:
                            cart.addProduct(apple, quantity);
                            break;
                        case 2:
                            cart.addProduct(bread, quantity);
                            break;
                        case 3:
                            cart.addProduct(milk, quantity);
                            break;
                        default:
                            System.out.println("Invalid product choice.");
                    }
                    break;

                case 2:
                    System.out.print("Enter the product name to remove: ");
                    String productName = scanner.next();
                    if (productName.equalsIgnoreCase("Apple")) {
                        cart.removeProduct(apple);
                    } else if (productName.equalsIgnoreCase("Bread")) {
                        cart.removeProduct(bread);
                    } else if (productName.equalsIgnoreCase("Milk")) {
                        cart.removeProduct(milk);
                    } else {
                        System.out.println("Product not found in cart.");
                    }
                    break;

                case 3:
                    cart.displayCart();
                    break;

                case 4:
                    cart.generateReceipt();
                    System.out.println("Thank you for shopping with us!");
                    return;

                case 5:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}

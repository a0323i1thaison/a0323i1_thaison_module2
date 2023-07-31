package ss11_java_collection_framework.bai_tap;
import java.util.Scanner;
public class TextMain {
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("------ Product Management ------");
            System.out.println("1. Add product");
            System.out.println("2. Update product");
            System.out.println("3. Delete product");
            System.out.println("4. Display products");
            System.out.println("5. Search product");
            System.out.println("6. Sort products by price (ascending)");
            System.out.println("7. Sort products by price (descending)");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume the \n char

            switch (choice) {
                case 0:
                    System.out.println("Exiting program...");
                    scanner.close();
                    System.exit(0);
                case 1:
                    System.out.print("Enter product name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter product price: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine(); // consume the \n char
//                    Product product = new Product(manager.getProducts().size() + 1, name, price);
//                    manager.addProduct(product);
                    break;
                case 2:
                    System.out.print("Enter product id: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // consume the \n char
                    System.out.print("Enter new name: ");
                    name = scanner.nextLine();
                    System.out.print("Enter new price: ");
                        price = scanner.nextDouble();
                    scanner.nextLine(); // consume the \n char
                    manager.updateProduct(id, name, price);
                    break;
                case 3:
                    System.out.print("Enter product id: ");
                    id = scanner.nextInt();
                    scanner.nextLine(); // consume the \n char
                    manager.deleteProduct(id);
                    break;
                case 4:
                    manager.displayProducts();
                    break;
                case 5:
                    System.out.print("Enter product name: ");
                    name = scanner.nextLine();
                    manager.searchProduct(name);
                    break;
                case 6:
                    manager.sortProducts(true);
                    System.out.println("Sorted products by price (ascending):");
                    manager.displayProducts();
                    break;
                case 7:
                    manager.sortProducts(false);
                    System.out.println("Sorted products by price (descending):");
                    manager.displayProducts();
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

            System.out.println();
        }
    }
}

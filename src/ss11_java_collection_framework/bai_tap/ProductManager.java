package ss11_java_collection_framework.bai_tap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
public class ProductManager {
    private List<Product> productList;

    public ProductManager() {
        productList = new ArrayList<Product>();
        // productList = new LinkedList<Product>(); // sử dụng LinkedList thay cho ArrayList
    }

    public void addProduct(Product product) {
        productList.add(product);
        System.out.println("Added product: " + product);
    }

    public void updateProduct(int id, String name, double price) {
        for (Product product : productList) {
            if (product.getId() == id) {
                product.setName(name);
                product.setPrice(price);
                System.out.println("Updated product: " + product);
                return;
            }
        }
        System.out.println("Product with id " + id + " not found.");
    }

    public void deleteProduct(int id) {
        for (Product product : productList) {
            if (product.getId() == id) {
                productList.remove(product);
                System.out.println("Deleted product: " + product);
                return;
            }
        }
        System.out.println("Product with id " + id + " not found.");
    }

    public void displayProducts() {
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    public void searchProduct(String name) {
        for (Product product : productList) {
            if (product.getName().equals(name)) {
                System.out.println("Found product: " + product);
                return;
            }
        }
        System.out.println("Product with name " + name + " not found.");
    }

    public void sortProducts(boolean ascending) {
        if (ascending) {
            Collections.sort(productList, new Comparator<Product>() {
                public int compare(Product p1, Product p2) {
                    return Double.compare(p1.getPrice(), p2.getPrice());
                }
            });
        } else {
            Collections.sort(productList, new Comparator<Product>() {
                public int compare(Product p1, Product p2) {
                    return Double.compare(p2.getPrice(), p1.getPrice());
                }
            });
        }
    }
}

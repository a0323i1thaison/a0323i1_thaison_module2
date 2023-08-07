package ss16_binary_file_Serialization;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Product {
    private List<Product> products;
    private String filePath;

    public Product(String filePath) {
        this.products = new ArrayList<>();
        this.filePath = filePath;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void displayProducts() {
        if (products.isEmpty()) {
            System.out.println("Danh sách sản phẩm rỗng.");
        } else {
            for (Product product : products) {
                System.out.println(product);
            }
        }
    }

    public Product searchProduct(String code) {
        for (Product product : products) {
            if (product.equals(code)) {
                return product;
            }
        }
        return null;
    }

    public void saveToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(products);
            System.out.println("Danh sách sản phẩm đã được lưu vào file.");
        } catch (IOException e) {
            System.out.println("Lỗi khi lưu danh sách sản phẩm vào file: " + e.getMessage());
        }
    }

    public void loadFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            products = (List<Product>) ois.readObject();
            System.out.println("Danh sách sản phẩm đã được tải từ file.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Lỗi khi tải danh sách sản phẩm từ file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String filePath = "products.dat";
        Product product = new Product(filePath);
        Scanner scanner = new Scanner(System.in);

        boolean isRunning = true;

        while (isRunning) {
            System.out.println("------ MENU ------");
            System.out.println("1. Thêm một sản phẩm mới");
            System.out.println("2. Hiển thị danh sách sản phẩm");
            System.out.println("3. Tìm kiếm sản phẩm theo mã");
            System.out.println("4. Lưu danh sách sản phẩm vào file");
            System.out.println("5. Xóa danh sách sản phẩm và tải từ file");
            System.out.println("6. Hiển thị danh sách sản phẩm sau khi tải từ file");
            System.out.println("0. Thoát chương trình");
            System.out.print("Nhập lựa chọn của bạn: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Đọc dòng mới sau khi nhập lựa chọn

            switch (choice) {
                case 1:
                    System.out.println("Nhập thông tin sản phẩm:");
                    System.out.print("Mã sản phẩm: ");
                    String code = scanner.nextLine();
                    System.out.print("Tên sản phẩm: ");
                    String name = scanner.nextLine();
                    System.out.print("Hãng sản xuất: ");
                    String manufacturer = scanner.nextLine();
                    System.out.print("Giá: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine(); // Đọc dòng mới sau khi nhập giá
                    System.out.print("Mô tả: ");
                    String description = scanner.nextLine();

//                    Product product = new Product(code, name, manufacturer, price, description);
                    product.addProduct(product);
                    System.out.println("Sản phẩm đã được thêm thành công!");
                    break;

                case 2:
                    System.out.println("Danh sách sản phẩm:");
                    product.displayProducts();
                    break;

                case 3:
                    System.out.print("Nhập mã sản phẩm cần tìm kiếm: ");
                    String searchCode = scanner.nextLine();
                    Product searchedProduct = product.searchProduct(searchCode);
                    if (searchedProduct != null) {
                        System.out.println("Sản phẩm được tìm thấy: " + searchedProduct);
                    } else {
                        System.out.println("Không tìm thấy sản phẩm với mã " + searchCode);
                    }
                    break;

                case 4:
                    product.saveToFile();
                    break;

                case 5:
                    product = new Product(filePath);
                    product.loadFromFile();
                    break;

                case 6:
                    System.out.println("Danh sách sản phẩm sau khi tải từ file:");
                    product.displayProducts();
                    break;

                case 0:
                    isRunning = false;
                    break;

            }
        }
    }
}
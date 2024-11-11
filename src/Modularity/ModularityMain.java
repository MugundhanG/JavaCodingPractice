package Modularity;

import Modularity.product.Product;
import Modularity.product.ProductService;
import Modularity.user.User;
import Modularity.user.UserService;

public class ModularityMain {

    public static void main(String[] args) {
        System.out.println("***************  Modularity starts  ********************");
        ProductService productService = new ProductService();

        productService.addProduct(new Product(1, "Laptop"));
        productService.addProduct(new Product(2, "Monitor"));
        productService.addProduct(new Product(3, "Keyboard"));

        UserService userService = new UserService();

        userService.addUser(new User(1, "Mugi"));
        userService.addUser(new User(2, "Suresh"));
        userService.addUser(new User(3, "Vicky"));

        System.out.println("Products:");
        productService.getProducts().forEach(p -> System.out.println("ID: " + p.getProductId() + " Name: " + p.getProductName()));

        System.out.println("User:");
        userService.getUsers().forEach(u -> System.out.println("ID: " + u.getUserId() + " Name: " + u.getUserName()));
        System.out.println("***************  Modularity ends  ********************");
    }

}

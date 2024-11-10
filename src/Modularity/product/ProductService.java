package Modularity.product;

import java.util.List;
import java.util.ArrayList;

public class ProductService {

    private List<Product> productList = new ArrayList<>();

    public void addProduct(Product product) {
        productList.add(product);
    }


    public List<Product> getProducts() {
        return productList;
    }

}

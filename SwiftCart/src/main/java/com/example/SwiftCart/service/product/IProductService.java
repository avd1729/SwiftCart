package com.example.SwiftCart.service.product;

import com.example.SwiftCart.model.Product;
import com.example.SwiftCart.request.AddProductRequest;

import java.util.List;

public interface IProductService {

    Product addProduct(AddProductRequest product);
    Product getProductById(Long id);
    void deleteProductById(Long id);
    void updateProduct(Product product, Long productId);
    List<Product> getAllProducts();
    List<Product> getProductsByCategory(String category);
    List<Product> getProductsByBrand(String brand);
    List<Product> getProductsByCategoryAndBrand(String category, String brand);
    List<Product> getProductByName(String productName);
    List<Product> getProductByCategoryAndName(String category, String productName);
    List<Product> getProductByBrandAndName(String brand, String productName);
    Long countProductByCategory(String category);
    Long countProductByBrand(String brand);
    Long countProductByName(String productName);
    Long countProductByCategoryAndName(String category, String productName);
    Long countProductByBrandAndCategory(String brand, String category);
    Long countProductByBrandAndName(String brand, String productName);

}

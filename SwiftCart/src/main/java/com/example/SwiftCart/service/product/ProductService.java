package com.example.SwiftCart.service.product;

import com.example.SwiftCart.exceptions.ProductNotFoundException;
import com.example.SwiftCart.model.Product;
import com.example.SwiftCart.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService implements IProductService {

    private ProductRepository productRepository;

    @Override
    public Product addProduct(Product product) {
        return null;
    }

    @Override
    public Product getProductById(Long id) {
        return productRepository.findById(id)
                .orElseThrow(() -> new ProductNotFoundException("Product not found!"));
    }

    @Override
    public void deleteProductById(Long id) {
        productRepository.findById(id)
                .ifPresentOrElse(productRepository::delete,
                        ()-> {throw new ProductNotFoundException("Product not found!");}
                );
    }

    @Override
    public void updateProduct(Product product, Long productId) {

    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public List<Product> getProductsByCategory(String category) {
        return productRepository.findByCategoryName(category);
    }

    @Override
    public List<Product> getProductsByBrand(String brand) {
        return productRepository.findByBrand(brand);
    }

    @Override
    public List<Product> getProductsByCategoryAndBrand(String category, String brand) {
        return productRepository.findByCategoryNameAndBrand(category, brand);
    }

    @Override
    public List<Product> getProductByName(String productName) {
        return List.of();
    }

    @Override
    public List<Product> getProductByCategoryAndName(String category, String productName) {
        return List.of();
    }

    @Override
    public List<Product> getProductByBrandAndName(String brand, String productName) {
        return List.of();
    }

    @Override
    public Long countProductByCategory(String category) {
        return 0L;
    }

    @Override
    public Long countProductByBrand(String brand) {
        return 0L;
    }

    @Override
    public Long countProductByName(String productName) {
        return 0L;
    }

    @Override
    public Long countProductByCategoryAndName(String category, String productName) {
        return 0L;
    }

    @Override
    public Long countProductByBrandAndCategory(String brand, String category) {
        return 0L;
    }

    @Override
    public Long countProductByBrandAndName(String brand, String productName) {
        return 0L;
    }
}

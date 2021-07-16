package com.nxp.csw_compe.service;

import com.nxp.csw_compe.entity.Product;
import com.nxp.csw_compe.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;
import java.util.Optional;

@Component(value = "productService")
@WebService
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    @WebMethod
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getAllById(Long id) {
        Optional<Product> optionalProduct = productRepository.findById(id);
        if (optionalProduct.isPresent()) {
            return optionalProduct.get();
        }
        return null;
    }

    @WebMethod
    public Product addProduct(Product p) {
        return productRepository.save(p);
    }

    @WebMethod
    public Product sellProduct(Long productId, Long quantity) {
        Product product = getAllById(productId);
        if (product != null) {
            if (product.getQuantity() >= quantity) {
                product.setQuantity(product.getQuantity() - quantity);
                Product result = productRepository.save(product);
                return result;
            }
        }
        return null;
    }
}

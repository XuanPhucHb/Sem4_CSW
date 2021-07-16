package com.nxp.csw_client_compe.product_service;

import com.nxp.csw_client_compe.service.ProductService;
import com.nxp.csw_client_compe.service.ProductServiceService;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class ClientProductService {

    @Bean
    public ProductService productService(){
        ProductServiceService productServiceService = new ProductServiceService();
        return productServiceService.getProductServicePort();
    }
}

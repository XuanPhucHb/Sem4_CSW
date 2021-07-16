package com.nxp.csw_client_compe.controller;

import com.nxp.csw_client_compe.product_service.ClientProductService;
import com.nxp.csw_client_compe.service.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping(value = "/nxp/v1/product")
public class ProductController {

    @Autowired
    ClientProductService clientProductService;

    @RequestMapping(value = "/getAllProducts")
    public String getAllProducts(Model model) {
        List<Product> products = clientProductService.productService().getAllProducts();
        model.addAttribute("products", products);
        return "index";
    }

    @RequestMapping(value = "/addProduct", method = RequestMethod.POST, produces = "application/json")
    public String add(@ModelAttribute Product product) {
        clientProductService.productService().addProduct(product);
        return "redirect:/getAllProducts";
    }

    @RequestMapping(value = "/sellProduct", produces = "application/json", method = RequestMethod.POST)
    public String add(@RequestParam Long productId, @RequestParam Long quantity) {
        Product product = clientProductService.productService().sellProduct(productId, quantity);
        if (product != null) {
            return "success";
        }
        return "fail";
    }

    @RequestMapping(value = "/add")
    public String add(Model model) {
        model.addAttribute("product", new Product());
        return "addProduct";
    }

}

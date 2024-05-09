package com.learning.core.day1session1;

@RestController
@RequestMapping("/products")
public class ProductController {

    @PostMapping
    public String createProduct() {
        return "HTTP POST Method Handled";
    }

    @PutMapping
    public String updateProduct() {
        return "HTTP PUT Method Handled";
    }

    @GetMapping
    public String getProducts() {
        return "HTTP GET Method Handled";
    }

    @DeleteMapping
    public String deleteProduct() {
        return "HTTP DELETE Method Handled";
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.demo.web.spring01.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author hoangnghiem
 */
@Controller
public class ProductController {
    
    @RequestMapping("/product/{id}")
    public String showProductDetail(@PathVariable(name = "id") String id) {
        System.out.println("VIEW PRODUCT " + id);
        // TODO
        // Lấy dữ liệu của sản phẩm getProductById()
        
        // Hiển thị nó ra View (trang product Detail)
       
        return "product";
    }
}

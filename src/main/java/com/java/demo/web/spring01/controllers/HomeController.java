/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.demo.web.spring01.controllers;

import com.java.demo.web.spring01.dto.Product;
import com.java.demo.web.spring01.dto.Slider;
import com.java.demo.web.spring01.model.ProductModel;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author hoangnghiem
 */
@Controller
public class HomeController {

    private List<Slider> getSliders() {
        List<Slider> sliders = new ArrayList<>();
        sliders.add(new Slider(1,
                "SLIDER 01",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit.",
                "https://picsum.photos/seed/picsum/800/400")
        );
        sliders.add(new Slider(2,
                "SLIDER 02",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit.",
                "https://picsum.photos/seed/picsum/800/400")
        );
        sliders.add(new Slider(3,
                "SLIDER 03",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit.",
                "https://picsum.photos/seed/picsum/800/400")
        );
        sliders.add(new Slider(4,
                "SLIDER 04",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit.",
                "https://picsum.photos/seed/picsum/800/400")
        );
        return sliders;
    }

    @RequestMapping("/")
    public String home(Model model) {
        try {
            String title = "TIEU DE";
            model.addAttribute("title", title);
            model.addAttribute("sliders", this.getSliders());

            // Lấy ra 3 sp hot
            ProductModel prodModel = new ProductModel();
            List<Product> hotProducts = prodModel.getHotProduct(3);
            model.addAttribute("hotProducts", hotProducts);
            
            // Lấy ra 3 sp mới
            List<Product> newProducts = prodModel.getNewProduct(3);
            model.addAttribute("newProducts", newProducts);
            
            // Lấy ra 3 sp gợi ý
            
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return "home";
    }

    @RequestMapping("/notice")
    public String notice() {
        return "notice";
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/cart")
    public String cart() {
        return "cart";
    }
}

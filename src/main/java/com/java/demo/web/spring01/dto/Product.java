/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.demo.web.spring01.dto;

/**
 *
 * @author hoangnghiem
 */
public class Product {
   
    private int id;
    private String name;
    private String desc;
    private String image;
    private double price;
    private boolean hot;
    private int category;
    
    public Product() {
    }

    public Product(int id, String name, String desc, String image, double price, boolean hot, int cateId) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.image = image;
        this.price = price;
        this.hot = hot;
        this.category = cateId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isHot() {
        return hot;
    }

    public void setHot(boolean hot) {
        this.hot = hot;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int cateId) {
        this.category = cateId;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    
    
}

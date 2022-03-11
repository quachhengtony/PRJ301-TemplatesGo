/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Thanh
 */
public class Category {
    private int id;
    private String category;

    public Category(int id, String category) {
        this.id = id;
        this.category = category;
    }

    public Category(String category) {
        this.category = category;
    }
    
    public Category() {
        this.id = 0;
        this.category = null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;

/**
 *
 * @author Thanh
 */
public class Cart {
    private int buyerId;
    private ArrayList<Integer> templateList;

    public Cart() {
    }

    public Cart(int buyerId, ArrayList<Integer> templateList) {
        this.buyerId = buyerId;
        this.templateList = templateList;
    }

    public int getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(int buyerId) {
        this.buyerId = buyerId;
    }

    public ArrayList<Integer> getTemplateList() {
        return templateList;
    }

    public void setTemplateList(ArrayList<Integer> templateList) {
        this.templateList = templateList;
    }
    
}

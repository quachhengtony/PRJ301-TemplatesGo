/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.sql.Date;
import java.time.LocalDate;

/**
 *
 * @author LENOV
 */
public class Order {
    private int templateId;
    private int sellerId;
    private int buyerId;
    private Date date;

    public Order() {
    }

    public Order(int templateId, int sellerId, int buyerId, Date date) {
        this.templateId = templateId;
        this.sellerId = sellerId;
        this.buyerId = buyerId;
        this.date = date;
    }

  
    
    public int getTemplateId() {
        return templateId;
    }

    public void setTemplateId(int templateId) {
        this.templateId = templateId;
    }

    public int getSellerId() {
        return sellerId;
    }

    public void setSellerId(int sellerId) {
        this.sellerId = sellerId;
    }

    public int getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(int buyerId) {
        this.buyerId = buyerId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


   
}


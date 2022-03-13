/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.sql.Date;

/**
 *
 * @author Tony Quach
 */
public class Template {

    private int id;
    private int sellerId;
    private int categoryId;
    private String name;
    private String description;
    private float price;
    private String hostUrl;
    private String sourceCodePath;
    private Date createdDate;
    private Date lastModifiedDate;
    private int soldQuantity;

    public Template() {
    }

    public Template(int sellerId, int categoryId, String name, String description, float price, String hostUrl, String sourceCodePath, Date createdDate) {
        this.sellerId = sellerId;
        this.categoryId = categoryId;
        this.name = name;
        this.description = description;
        this.price = price;
        this.hostUrl = hostUrl;
        this.sourceCodePath = sourceCodePath;
        this.createdDate = createdDate;
    }

    public Template(int id, int sellerId, int categoryId, String name, String description, float price, String hostUrl, String sourceCodePath, Date createdDate, Date lastModifiedDate, int soldQuantity) {
        this.id = id;
        this.sellerId = sellerId;
        this.categoryId = categoryId;
        this.name = name;
        this.description = description;
        this.price = price;
        this.hostUrl = hostUrl;
        this.sourceCodePath = sourceCodePath;
        this.createdDate = createdDate;
        this.lastModifiedDate = lastModifiedDate;
        this.soldQuantity = soldQuantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSellerId() {
        return sellerId;
    }

    public void setSellerId(int sellerId) {
        this.sellerId = sellerId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getHostUrl() {
        return hostUrl;
    }

    public void setHostUrl(String hostUrl) {
        this.hostUrl = hostUrl;
    }

    public String getSourceCodePath() {
        return sourceCodePath;
    }

    public void setSourceCodePath(String sourceCodePath) {
        this.sourceCodePath = sourceCodePath;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public int getSoldQuantity() {
        return soldQuantity;
    }

    public void setSoldQuantity(int soldQuantity) {
        this.soldQuantity = soldQuantity;
    }
}

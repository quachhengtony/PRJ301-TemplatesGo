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
public class TemplateImage {
    private int id;
    private int templateId;
    private String path;

    public TemplateImage() {
    }

    public TemplateImage(int templateId, String path) {
        this.templateId = templateId;
        this.path = path;
    }

    public TemplateImage(int id, int templateId, String path) {
        this.id = id;
        this.templateId = templateId;
        this.path = path;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTemplateId() {
        return templateId;
    }

    public void setTemplateId(int templateId) {
        this.templateId = templateId;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
    
}

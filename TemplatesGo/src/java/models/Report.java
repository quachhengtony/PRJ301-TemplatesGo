/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.sql.Date;

/**
 *
 * @author Thanh
 */
public class Report {
   private int id;
   private int templateId;
   private int reporterId;
   private String content;
   private Date createDate;
   private String status;

    public Report(int templateId, int reporterId, String content, Date createDate, String status) {
        this.templateId = templateId;
        this.reporterId = reporterId;
        this.content = content;
        this.createDate = createDate;
        this.status = status;
    }

    public Report(int id, int templateId, int reporterId, String content, Date createDate, String status) {
        this.id = id;
        this.templateId = templateId;
        this.reporterId = reporterId;
        this.content = content;
        this.createDate = createDate;
        this.status = status;
    }

    public Report() {
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

    public int getReporterId() {
        return reporterId;
    }

    public void setReporterId(int reporterId) {
        this.reporterId = reporterId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Report{" + "id=" + id + ", templateId=" + templateId + ", reporterId=" + reporterId + ", content=" + content + ", createDate=" + createDate + ", status=" + status + '}';
    }

   
   
}

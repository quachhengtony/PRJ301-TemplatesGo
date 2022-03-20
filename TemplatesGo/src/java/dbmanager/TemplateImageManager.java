/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbmanager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import models.TemplateImage;
import utils.DBUtils;

/**
 *
 * @author Thanh
 */
public class TemplateImageManager {
    Connection conn = null;
    PreparedStatement pstm = null;
    ResultSet rs = null;
    
    public int insertImage(TemplateImage image) {
        try {
            String sql = "insert into TemplateImage(templateId, path) \n" 
                    + " values (?, ?)";
            conn = DBUtils.getConnection();
            pstm = conn.prepareStatement(sql, new String[]{"id"});
            pstm.setInt(1, image.getTemplateId());
            pstm.setString(2, image.getPath());
            pstm.executeUpdate();
            ResultSet rs = pstm.getGeneratedKeys();
            int id = 0;
            if (rs.next()) {
                id = rs.getInt(1);
                return id;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return -1;
    }
    
    public void updateImagePath(int id, String path) {
        try {
            String sql = "update TemplateImage set path = ? where id = ?";
            conn = DBUtils.getConnection();
            pstm = conn.prepareStatement(sql);
            pstm.setInt(2, id);
            pstm.setString(1, path);
            pstm.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    public void deleteTemplateImage(int templateId) {
        try {
            String sql = "delete from TemplateImage where templateId = ?";
            conn = DBUtils.getConnection();
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, templateId);
            pstm.execute();
        } catch (Exception e) {
        }
    }
    
    public ArrayList<TemplateImage> getImageList(int templateId) {
        ArrayList<TemplateImage> list = new ArrayList<>();
        try {
            String sql = "select id, templateId, path from TemplateImage \n"
                    + "where templateId = ?";
            conn = DBUtils.getConnection();
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, templateId);
            rs = pstm.executeQuery();
            while (rs.next()) {
                list.add(new TemplateImage(rs.getInt("id"), rs.getInt("templateId"), rs.getString("path")));
            }
        } catch (Exception e) {
        }
        return list;
    }
}

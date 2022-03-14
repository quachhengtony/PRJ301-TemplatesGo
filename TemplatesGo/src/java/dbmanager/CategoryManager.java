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
import java.util.List;
import models.Category;
import utils.DBUtils;

/**
 *
 * @author Thanh
 */
public class CategoryManager {
    public boolean insertCategory(Category cate){
        try{
            Connection con = DBUtils.getConnection();
            PreparedStatement ps = con.prepareStatement("INSERT INTO dbo.\"Category\" VALUES ( ? )");
            ps.setString(1, cate.getCategory());
            ps.executeQuery();
        }catch(Exception e){
            
        }
        return true;
    }
    
    public int getSize(){
        Category cate = new Category();
        try{
            Connection con = DBUtils.getConnection();
            PreparedStatement ps = con.prepareStatement("Select * from Category");
            int count = 0;
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                count++;
            }
            return count;
        } catch (Exception e){
            
        }
        return -1;
    }
    
    public ArrayList<Category> getCategoryList(){
        ArrayList<Category> cates = new ArrayList<>();
        try{
            Connection con = DBUtils.getConnection();
            PreparedStatement ps = con.prepareStatement("Select * from Category");
            
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                cates.add(new Category(rs.getInt("id"),rs.getString("category")));
            }
            return cates;
        } catch (Exception e){
            e.printStackTrace();
        }
        return cates;
    }
    
    public Category getCategory (int cateId){
        Category gcate = null;
        Category category = new Category();
        try {
            Connection con = DBUtils.getConnection();
            PreparedStatement ps = con.prepareStatement("Select * from Category where id = ? ");
            ps.setInt(1, cateId);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                gcate = new Category();
                gcate.setId(rs.getInt("id"));
                gcate.setCategory(rs.getString("category"));
            }
        }catch (Exception e){
            
        }
        return gcate;
    }
    
    public boolean updateCategory(Category newCate){
        try {
            Connection con = DBUtils.getConnection();
            PreparedStatement ps = con.prepareStatement("Update Category Set category = ? where id = ?");
            ps.setString(1, newCate.getCategory());
            ps.setInt(2, newCate.getId());
            ps.execute();
        }catch (Exception e){
            
        }
        return true;
    }
    
    public boolean deleteCategory(int cateId){
        try {
            Connection con = DBUtils.getConnection();
            PreparedStatement ps = con.prepareStatement("Delete from Category where id = ?");
            ps.setInt(1, cateId);
            ps.execute();
        }catch (Exception e){
            
        }
        return true;
    }
}

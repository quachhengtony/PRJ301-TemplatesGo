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
import java.util.HashMap;
import models.Cart;
import utils.DBUtils;

/**
 *
 * @author Thanh
 */
public class CartManager {
    Connection conn = null;
    PreparedStatement pstm = null;
    ResultSet rs = null;
    
    boolean insertCartItem(int buyerId, int templateId) {
        boolean isSucceed = false;
        try {
            String sql = "insert into CartItem (buyerId, templateId)\n" +
                            "values (?, ?)";
            conn = DBUtils.getConnection();
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, buyerId);
            pstm.setInt(2, templateId);
            int affectedRow = pstm.executeUpdate();
            if (affectedRow != 0)
                isSucceed = true;
        } catch (Exception e) {
        }
        return isSucceed;
    }
    
    boolean checkCartItem(int buyerId, int templateId) {
        boolean isSucceed = false;
        try {
            String sql = "select templateId from CartItem\n" +
                            "where buyerId = ? and templateId = ?";
            conn = DBUtils.getConnection();
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, buyerId);
            pstm.setInt(2, templateId);
            rs = pstm.executeQuery();
            if (rs.next())
                isSucceed = true;
        } catch (Exception e) {
        }
        return isSucceed;
    }
    
    public Cart getCart(int buyerId) {
        Cart cart = null;
        try {
            String sql = "select templateId from CartItem\n" +
                            "where buyerId = ?";
            conn = DBUtils.getConnection();
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, buyerId);
            rs = pstm.executeQuery();
            ArrayList<Integer> templateList = new ArrayList<>();
            while (rs.next()) {
                templateList.add(rs.getInt("templateId"));
            }
            cart = new Cart(buyerId, templateList);
        } catch (Exception e) {
        }
        return cart;
    }
    
    boolean deleteCartItem(int buyerId, int templateId) {
        boolean isSucceed = false;
        try {
            String sql = "delete from CartItem\n"
                    + "where buyerId = ? and templateId = ?";
            conn = DBUtils.getConnection();
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, buyerId);
            pstm.setInt(2, templateId);
            int affectedRow = pstm.executeUpdate();
            if (affectedRow != 0) 
                isSucceed = true;
        } catch (Exception e) {
        }
        return isSucceed;
    }
    
    boolean deleteCart(int buyerId) {
        boolean isSucceed = false;
        try {
            String sql = "delete from CartItem\n"
                    + "where buyerId = ?";
            conn = DBUtils.getConnection();
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, buyerId);
            int affectedRow = pstm.executeUpdate();
            if (affectedRow != 0) 
                isSucceed = true;
        } catch (Exception e) {
        }
        return isSucceed;
    }
}

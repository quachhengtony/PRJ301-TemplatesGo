/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbmanager;

import java.sql.Connection;
import java.util.ArrayList;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import models.Order;
import utils.DBUtils;

/**
 *
 * @author LENOV
 */
public class OrderManager {
    public boolean insertOrder(int templateId,int sellerId, int buyerId,Date date){
        try{
            Connection con = DBUtils.getConnection();
            PreparedStatement ps = con.prepareStatement("INSERT INTO OrderHistory (templateId, sellerId, buyerId, date) values(?,?,?,?)");
            ps.setInt(1, templateId);
            ps.setInt(2, sellerId);
            ps.setInt(3,buyerId);
            ps.setDate(4, date);
            ps.execute();
        }catch(Exception e){
            
        }
        return true;
    }
    
    public List<Order> listOrderBySeller(int sellerId){
        List<Order> orders = new ArrayList<>();
        try{
            Connection con = DBUtils.getConnection();
            PreparedStatement ps = con.prepareStatement("Select templateId, sellerId, buyerId, date from OrderHistory where sellerId = ?");
            ps.setInt(1, sellerId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                orders.add(new Order(rs.getInt("templateId"),rs.getInt("sellerId"),rs.getInt("buyerId"),rs.getDate("date")));
            }
            return orders;
        } catch (Exception e){
            
        }
        return orders;
    }
    
    public List<Order> listOrderByBuyer(int buyerId){
        List<Order> orders = new ArrayList<>();
        try{
            Connection con = DBUtils.getConnection();
            PreparedStatement ps = con.prepareStatement("Select templateId, sellerId, buyerId, date from OrderHistory where buyerId = ?");
            ps.setInt(1, buyerId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                orders.add(new Order(rs.getInt("templateId"),rs.getInt("sellerId"),rs.getInt("buyerId"),rs.getDate("date")));
            }
            return orders;
        } catch (Exception e){
            
        }
        return orders;
    }
}

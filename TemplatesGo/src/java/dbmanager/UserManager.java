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
import java.util.Date;
import java.util.List;
import models.User;
import utils.DBUtils;

/**
 *
 * @author Thanh
 */
public class UserManager {

    public boolean addUser(User user) {

        try {
            Connection con = DBUtils.getConnection();
            PreparedStatement ps = con.prepareStatement("INSERT INTO  dbo.User VALUES (?,?,?,?,?,?,?,?,?,? )");
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getFirstName());
            ps.setString(3, user.getLastName());
            ps.setString(4, user.getEmail());
            ps.setString(5, user.getPassword());
            ps.setString(6, user.getAvatar());
            ps.setString(7, user.getRole());
            ps.setDate(8, user.getCreateDate());
            ps.setBoolean(9, user.isBanStatus());
            ps.setDate(10, user.getUnbanDate());
            ps.executeQuery();
        } catch (Exception e) {

        }
        return true;
    }

    public int getSize() {
        int count = 0;
        try {
            Connection con = DBUtils.getConnection();
            PreparedStatement ps = con.prepareStatement("select id from User");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                count++;
            }
        } catch (Exception e) {
        }

        return count;
    }

    public List<User> getUserList(int offset, int limit) {
        List<User> users = new ArrayList<>();
        try {
            Connection con = DBUtils.getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM User ORDER BY id OFFSET ? ROWS FETCH NEXT ? ROWS ONLY");
            ps.setInt(1, offset);
            ps.setInt(2, limit);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                users.add(new User(rs.getInt("id"), 
                        rs.getString("username"), 
                        rs.getString("firstName"), 
                        rs.getString("lastName"), 
                        rs.getString("email"), 
                        rs.getString("password"), 
                        rs.getString("avartar"), 
                        rs.getString("role"), 
                        rs.getDate("createDate"), 
                        rs.getBoolean("banStatus"), 
                        rs.getDate("unbanDate")));
            }
        } catch (Exception e) {

        }
        return users;
    }

    public User getUser(String username, String password) {
        User user = null;
        try {
            Connection con = DBUtils.getConnection();
            PreparedStatement ps = con.prepareStatement("Select * from users where username = ?  and password = ? ");
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                user = new User(rs.getInt("id"), 
                        rs.getString("username"), 
                        rs.getString("firstName"), 
                        rs.getString("lastName"), 
                        rs.getString("email"), 
                        rs.getString("password"), 
                        rs.getString("avartar"), 
                        rs.getString("role"), 
                        rs.getDate("createDate"), 
                        rs.getBoolean("banStatus"), 
                        rs.getDate("unbanDate"));
            }
        } catch (Exception e) {

        }
        return user;
    }

    public boolean updateUser(User newUser) {
        
        try {
            Connection con = DBUtils.getConnection();
            PreparedStatement ps = con.prepareStatement(" UPDATE User SET username = ?, firstName = ?, lastName= ? ,email= ?, password= ? ,avartar= ? ,role = ?, createDate = ?, banStatus = ?, unbanDate = ? WHERE id = ?");
            ps.setString(1, newUser.getUsername());
            ps.setString(2, newUser.getFirstName());
            ps.setString(3, newUser.getLastName());
            ps.setString(4, newUser.getEmail());
            ps.setString(5, newUser.getPassword());
            ps.setString(6, newUser.getAvatar());
            ps.setString(7, newUser.getRole());
            ps.setDate(8, newUser.getCreateDate());
            ps.setBoolean(9, newUser.isBanStatus());
            ps.setDate(10,  newUser.getUnbanDate());
            ps.setInt(11, newUser.getId());

            ps.execute();
        } catch (Exception e) {

        }
        return true;

    }

    public boolean deleteUser(int userId) {
        User user = new User();
                
        try {
            Connection con = DBUtils.getConnection();
            PreparedStatement ps = con.prepareStatement("DELETE  FROM User WHERE id = ?");
            ps.setInt(1, user.getId());
            
            ps.executeQuery();
        } catch (Exception e) {

        }
        return true;

    }

}

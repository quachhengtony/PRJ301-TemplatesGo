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
 * @author Tony Quach
 */
public class UserManager {

    public boolean addUser(User user) {
        String sql = "INSERT INTO [User] (username, firstName, lastName, email, password, avatar, role, createDate, banStatus, unbanDate) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            Connection con = DBUtils.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
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
            int r = ps.executeUpdate();
            if (r >= 0) {
                return true;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }

    public int getSize() {
        int count = 0;
        try {
            Connection con = DBUtils.getConnection();
            PreparedStatement ps = con.prepareStatement("select id from [dbo].[User]");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                count++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return count;
    }

    public List<User> getUserList(int offset, int limit) {
        List<User> users = new ArrayList<>();
        try {
            Connection con = DBUtils.getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM [dbo].[User] ORDER BY id OFFSET ? ROWS FETCH NEXT ? ROWS ONLY");
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
                        rs.getString("avatar"),
                        rs.getString("role"),
                        rs.getDate("createDate"),
                        rs.getBoolean("banStatus"),
                        rs.getDate("unbanDate")));
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
        return users;
    }

    public User getUser(String email, String password) {
        User user = new User();
        try {
            Connection con = DBUtils.getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM [User] WHERE email = ? AND password = ?");
            ps.setString(1, email);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                user = new User(rs.getInt("id"),
                        rs.getString("username"),
                        rs.getString("firstName"),
                        rs.getString("lastName"),
                        rs.getString("email"),
                        rs.getString("password"),
                        rs.getString("avatar"),
                        rs.getString("role"),
                        rs.getDate("createDate"),
                        rs.getBoolean("banStatus"),
                        rs.getDate("unbanDate"));
            }
            return user;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
    
    public User getUser(int userId) {
        User user = null;
        try {
            Connection con = DBUtils.getConnection();
            PreparedStatement ps = con.prepareStatement("Select * from [dbo].[User] where id = ?");
            ps.setInt(1, userId);
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
            PreparedStatement ps = con.prepareStatement("UPDATE [User] SET username = ?, firstName = ?, lastName= ?, password = ?, avatar = ? WHERE id = ?");
            ps.setString(1, newUser.getUsername());
            ps.setString(2, newUser.getFirstName());
            ps.setString(3, newUser.getLastName());
            ps.setString(4, newUser.getPassword());
            ps.setString(5, newUser.getAvatar());
            ps.setInt(6, newUser.getId());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println(e);
        }
        return true;
    }
    
    public void unbanUser(int userId) {
        try {
            Connection con = DBUtils.getConnection();
            PreparedStatement ps = con.prepareStatement("update [dbo].[User]\n"
                    + "set banStatus = 0, unbanDate = null\n"
                    + "where id= ?");
            ps.setInt(1, userId);
            ps.execute();
        } catch (Exception e) {

        }
    }
    
    public int getSellerIdFromReport(int reportId) {
        String sql = "select t1.id from [dbo].[User] t1\n"
                + "join Template t2 on  t1.id = t2.sellerId\n"
                + "join Report t3 on t3.templateId = t2.id\n"
                + "where t3.id = ?";
        try {
            Connection con = DBUtils.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, reportId);
            ResultSet rs = ps.executeQuery();
            int id = -1;
            if (rs.next()) {
                id = rs.getInt("id");
            }
            return id;
        } catch (Exception e) {
        }
        return -1;
    }
    
    public int getReporterIdFromReport(int reportId) {
        String sql = "select t1.id from [dbo].[User] t1\n"
                + "join Report t2 on t1.id = t2.reporterId\n"
                + "where t2.id = ?";
        try {
            Connection con = DBUtils.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, reportId);
            ResultSet rs = ps.executeQuery();
            int id = -1;
            if (rs.next()) {
                id = rs.getInt("id");
            }
            return id;
        } catch (Exception e) {
        }
        return -1;
    }
    
    public String getSellerNameFromReport(int reportId) {
        String sql = "select t1.username from [dbo].[User] t1\n"
                + "join Template t2 on  t1.id = t2.sellerId\n"
                + "join Report t3 on t3.templateId = t2.id\n"
                + "where t3.id = ?";
        try {
            Connection con = DBUtils.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, reportId);
            ResultSet rs = ps.executeQuery();
            String username = "";
            if (rs.next()) {
                username = rs.getString("username");
            }
            return username;
        } catch (Exception e) {
        }
        return "";
    }
    
    public String getReporterNameFromReport(int reportId) {
        String sql = "select t1.username from [dbo].[User] t1\n"
                + "join Report t2 on t1.id = t2.reporterId\n"
                + "where t2.id = ?";
        try {
            Connection con = DBUtils.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, reportId);
            ResultSet rs = ps.executeQuery();
            String username = "";
            if (rs.next()) {
                username = rs.getString("username");
            }
            return username;
        } catch (Exception e) {
        }
        return "";
    }

    public boolean deleteUser(int userId) {
        User user = new User();

        try {
            Connection con = DBUtils.getConnection();
            PreparedStatement ps = con.prepareStatement("DELETE  FROM [dbo].[User] WHERE id = ?");
            ps.setInt(1, user.getId());

            ps.executeQuery();
        } catch (Exception e) {

        }
        return true;

    }

}

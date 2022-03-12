/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbmanager;

import java.sql.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import static jdk.nashorn.internal.runtime.Debug.id;
import models.User;
import models.UserSession;
import utils.DBUtil;

/**
 *
 * @author Thanh
 */
public class AccountManager {

    public boolean addUser(User user) {

        try {
            Connection con = DBUtil.getConnection();
            PreparedStatement ps = con.prepareStatement("INSERT INTO  dbo.User VALUES ( ?,?,?,?,?,?,?,?,?,?,? )");
            ps.setInt(1, user.getId());
            ps.setString(2, user.getUsername());
            ps.setString(3, user.getFirstName());
            ps.setString(4, user.getLastName());
            ps.setString(5, user.getEmail());
            ps.setString(6, user.getPassword());
            ps.setString(7, user.getAvartar());
            ps.setString(8, user.getRole());
            ps.setDate(9, (java.sql.Date) user.getCreateDate());
            ps.setBoolean(10, user.isBanStatus());
            ps.setDate(11, (java.sql.Date) user.getUnbanDate());
            ps.executeQuery();
        } catch (Exception e) {

        }
        return true;
    }

    public int getSize() {
        User user = new User();
        try {
            Connection con = DBUtil.getConnection();
            PreparedStatement ps = con.prepareStatement("INSERT INTO  dbo.\"User\" where id =?");
            ps.setInt(1, user.getId());
            ps.executeQuery();
        } catch (Exception e) {
        }

        return user.getId();
    }

    public List<User> getUserList(int offset, int limit) {
        List<User> users = new ArrayList<>();
        try {
            Connection con = DBUtil.getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM account ORDER BY uid OFFSET ? ROWS FETCH NEXT ? ROWS ONLY");
            ps.setInt(1, (offset - 1) * 3);

            ps.executeQuery();
        } catch (Exception e) {

        }

        return users;
    }

    public UserSession getUser(String username, String password) {
        UserSession us = null;
        UserSession userSession = new UserSession();
        try {
            Connection con = DBUtil.getConnection();
            PreparedStatement ps = con.prepareStatement("Select * from users where username = ?  and password = ? ");
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                us = new UserSession();
                us.setUsername(rs.getString("username"));
                us.setLoginDate(new Date());
                us.setAccessRight(rs.getString("access_right"));
            }
        } catch (Exception e) {

        }
        return us;
    }

    public boolean updateUser(User newUser) {
        
        try {
            Connection con = DBUtil.getConnection();
            PreparedStatement ps = con.prepareStatement(" UPDATE p SET Username= ? ,firstName= ? ,LastName= ? ,Email= ? ,Password= ? ,Avartar= ? ,Role  `= ? ,  WHERE id = 103");
            ps.setInt(1, newUser.getId());
            ps.setString(2, newUser.getUsername());
            ps.setString(3, newUser.getFirstName());
            ps.setString(4, newUser.getLastName());
            ps.setString(5, newUser.getEmail());
            ps.setString(6, newUser.getPassword());
            ps.setString(7, newUser.getAvartar());
            ps.setString(8, newUser.getRole());
            ps.setDate(9, (java.sql.Date) newUser.getCreateDate());
            ps.setBoolean(10, newUser.isBanStatus());
            ps.setDate(11, (java.sql.Date) newUser.getUnbanDate());
            ps.executeQuery();
        } catch (Exception e) {

        }
        return true;

    }

    public boolean deleteUser(int userId) {
        User user = new User();
                
        try {
            Connection con = DBUtil.getConnection();
            PreparedStatement ps = con.prepareStatement("DELETE  FROM p WHERE Username= ? ,firstName= ? ,LastName= ? ,Email= ? ,Password= ? ,Avartar= ? ,Role  `= ? ,  WHERE id = ?");
            ps.setInt(1, user.getId());
            ps.setString(2, user.getUsername());
            ps.setString(3, user.getFirstName());
            ps.setString(4, user.getLastName());
            ps.setString(5, user.getEmail());
            ps.setString(6, user.getPassword());
            ps.setString(7, user.getAvartar());
            ps.setString(8, user.getRole());
            ps.setDate(9, (java.sql.Date) user.getCreateDate());
            ps.setBoolean(10, user.isBanStatus());
            ps.setDate(11, (java.sql.Date) user.getUnbanDate());
            ps.executeQuery();
        } catch (Exception e) {

        }
        return true;

    }

}

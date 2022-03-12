/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.Date;

/**
 *
 * @author Thanh
 */
public class User {

    private int id;
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String avartar;
    private String role;
    private Date createDate;
    private boolean banStatus;
    private Date unbanDate;

    public User() {
    }

    public User(int id, String username, String firstName, String lastName, String email, String password, String avartar, String role, Date createDate, boolean banStatus, Date unbanDate) {
        this.id = id;
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.avartar = avartar;
        this.role = role;
        this.createDate = createDate;
        this.banStatus = banStatus;
        this.unbanDate = unbanDate;
    }
     public User( String username, String firstName, String lastName, String email, String password, String avartar, String role, Date createDate, boolean banStatus, Date unbanDate) {
       
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.avartar = avartar;
        this.role = role;
        this.createDate = createDate;
        this.banStatus = banStatus;
        this.unbanDate = unbanDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

  

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAvartar() {
        return avartar;
    }

    public void setAvartar(String avartar) {
        this.avartar = avartar;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public boolean isBanStatus() {
        return banStatus;
    }

    

    public void setBanStatus(boolean banStatus) {
        this.banStatus = banStatus;
    }

    public Date getUnbanDate() {
        return unbanDate;
    }

    public void setUnbanDate(Date unbanDate) {
        this.unbanDate = unbanDate;
    }

    @Override
    public String toString() {
        return "Account{" + "id=" + id + ", username=" + username + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", password=" + password + ", avartar=" + avartar + ", role=" + role + ", createDate=" + createDate + ", banStatus=" + banStatus + ", unbanDate=" + unbanDate + '}';
    }

}

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
import models.Template;
import utils.DBUtils;

/**
 *
 * @author Tony Quach
 */
public class TemplateManager {

    public boolean postTemplate(Template template) {
        String sql = "INSERT INTO Template (sellerId, categoryId, name, description, price, hostUrl, sourceCodePath, createdDate) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            Connection connection = DBUtils.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql, new String[]{"id"});
            preparedStatement.setInt(1, template.getSellerId());
            preparedStatement.setInt(2, template.getCategoryId());
            preparedStatement.setString(3, template.getName());
            preparedStatement.setString(4, template.getDescription());
            preparedStatement.setFloat(5, template.getPrice());
            preparedStatement.setString(6, template.getHostUrl());
            preparedStatement.setString(7, template.getSourceCodePath());
            preparedStatement.setString(8, template.getCreatedDate());
            preparedStatement.executeUpdate();
            ResultSet resultSet = preparedStatement.getGeneratedKeys();
            int id = 0;
            if (resultSet.next()) {
                id = resultSet.getInt(1);
                return true;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }

    public Template getTemplateById(int templateId) {
        String sql = "SELECT * FROM Template WHERE id = ?";
        Template template = new Template();
        try {
            Connection connection = DBUtils.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, templateId);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                template = new Template(Integer.parseInt(resultSet.getString("id")), Integer.parseInt(resultSet.getString("sellerId")), Integer.parseInt(resultSet.getString("categoryId")), resultSet.getString("name"), resultSet.getString("description"), Float.parseFloat(resultSet.getString("price")), resultSet.getString("hostUrl"), resultSet.getString("sourceCodePath"), resultSet.getString("createDate"), resultSet.getString("lastModifiedDate"), Integer.parseInt(resultSet.getString("soldQuantity")));
            }
            return template;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public boolean updateTemplate(Template template) {
        String sql = "UPDATE Template SET categoryId = ?, name = ?, description = ?, price = ?, hostUrl = ?, sourceCodePath = ?, lastModifiedDate = ? WHERE id = ?";
        try {
            Connection connection = DBUtils.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql, new String[]{"id"});
            preparedStatement.setInt(1, template.getCategoryId());
            preparedStatement.setString(2, template.getName());
            preparedStatement.setString(3, template.getDescription());
            preparedStatement.setFloat(4, template.getPrice());
            preparedStatement.setString(5, template.getHostUrl());
            preparedStatement.setString(6, template.getSourceCodePath());
            preparedStatement.setString(7, template.getLastModifiedDate());
            preparedStatement.executeUpdate();
            ResultSet resultSet = preparedStatement.getGeneratedKeys();
            int id = 0;
            if (resultSet.next()) {
                id = resultSet.getInt(1);
                return true;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }

    public boolean deleteTemplateById(int templateId) {
        String sql = "DELETE FROM Template WHERE id = ?";
        try {
            Connection connection = DBUtils.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql, new String[]{"id"});
            preparedStatement.setInt(1, templateId);
            preparedStatement.executeUpdate();
            ResultSet resultSet = preparedStatement.getGeneratedKeys();
            int id = 0;
            if (resultSet.next()) {
                id = resultSet.getInt(1);
                return true;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }

    public List<Template> getTemplates(int offset, int limit) {
        String sql = "SELECT * FROM Template ORDER BY id OFFSET ? ROWS FETCH NEXT ? ROWS ONLY";
        ArrayList<Template> templates = new ArrayList<>();
        try {
            Connection connection = DBUtils.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, offset);
            preparedStatement.setInt(2, limit);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                templates.add(new Template(Integer.parseInt(resultSet.getString("id")), Integer.parseInt(resultSet.getString("sellerId")), Integer.parseInt(resultSet.getString("categoryId")), resultSet.getString("name"), resultSet.getString("description"), Float.parseFloat(resultSet.getString("price")), resultSet.getString("hostUrl"), resultSet.getString("sourceCodePath"), resultSet.getString("createdDate"), resultSet.getString("lastModifiedDate"), Integer.parseInt(resultSet.getString("soldQuantity"))));
            }
            return templates;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public List<Template> getTemplatesBySellerId(int sellerId, int offset, int limit) {
        String sql = "SELECT * FROM Template WHERE sellerId = ? ORDER BY id OFFSET ? ROWS FETCH NEXT ? ROWS ONLY";
        ArrayList<Template> templates = new ArrayList<>();
        try {
            Connection connection = DBUtils.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, sellerId);
            preparedStatement.setInt(2, offset);
            preparedStatement.setInt(3, limit);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                templates.add(new Template(Integer.parseInt(resultSet.getString("id")), Integer.parseInt(resultSet.getString("sellerId")), Integer.parseInt(resultSet.getString("categoryId")), resultSet.getString("name"), resultSet.getString("description"), Float.parseFloat(resultSet.getString("price")), resultSet.getString("hostUrl"), resultSet.getString("sourceCodePath"), resultSet.getString("createdDate"), resultSet.getString("lastModifiedDate"), Integer.parseInt(resultSet.getString("soldQuantity"))));
            }
            return templates;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public List<Template> getTemplatesByCategory(int categoryId, int offset, int limit) {
        String sql = "SELECT * FROM Template WHERE categoryId = ? ORDER BY id OFFSET ? ROWS FETCH NEXT ? ROWS ONLY";
        ArrayList<Template> templates = new ArrayList<>();
        try {
            Connection connection = DBUtils.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, categoryId);
            preparedStatement.setInt(2, offset);
            preparedStatement.setInt(3, limit);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                templates.add(new Template(Integer.parseInt(resultSet.getString("id")), Integer.parseInt(resultSet.getString("sellerId")), Integer.parseInt(resultSet.getString("categoryId")), resultSet.getString("name"), resultSet.getString("description"), Float.parseFloat(resultSet.getString("price")), resultSet.getString("hostUrl"), resultSet.getString("sourceCodePath"), resultSet.getString("createdDate"), resultSet.getString("lastModifiedDate"), Integer.parseInt(resultSet.getString("soldQuantity"))));
            }
            return templates;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public List<Template> getTemplatesBySearchString(String searchString, int offset, int limit) {
        String sql = "SELECT * FROM Template WHERE name OR descripion LIKE '%?%' ORDER BY id OFFSET ? ROWS FETCH NEXT ? ROWS ONLY";
        ArrayList<Template> templates = new ArrayList<>();
        try {
            Connection connection = DBUtils.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, searchString);
            preparedStatement.setInt(2, offset);
            preparedStatement.setInt(3, limit);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                templates.add(new Template(Integer.parseInt(resultSet.getString("id")), Integer.parseInt(resultSet.getString("sellerId")), Integer.parseInt(resultSet.getString("categoryId")), resultSet.getString("name"), resultSet.getString("description"), Float.parseFloat(resultSet.getString("price")), resultSet.getString("hostUrl"), resultSet.getString("sourceCodePath"), resultSet.getString("createdDate"), resultSet.getString("lastModifiedDate"), Integer.parseInt(resultSet.getString("soldQuantity"))));
            }
            return templates;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public List<Template> getTemplatesByPrice(int price, int offset, int limit) {
        String sql = "SELECT * FROM Template WHERE price <= ? ORDER BY id OFFSET ? ROWS FETCH NEXT ? ROWS ONLY";
        ArrayList<Template> templates = new ArrayList<>();
        try {
            Connection connection = DBUtils.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, price);
            preparedStatement.setInt(2, offset);
            preparedStatement.setInt(3, limit);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                templates.add(new Template(Integer.parseInt(resultSet.getString("id")), Integer.parseInt(resultSet.getString("sellerId")), Integer.parseInt(resultSet.getString("categoryId")), resultSet.getString("name"), resultSet.getString("description"), Float.parseFloat(resultSet.getString("price")), resultSet.getString("hostUrl"), resultSet.getString("sourceCodePath"), resultSet.getString("createdDate"), resultSet.getString("lastModifiedDate"), Integer.parseInt(resultSet.getString("soldQuantity"))));
            }
            return templates;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public List<Template> getTemplatesByPopularity(int offset, int limit) {
        String sql = "SELECT * FROM Template ORDER BY soldQuantity DESC OFFSET ? ROWS FETCH NEXT ? ROWS ONLY";
        ArrayList<Template> templates = new ArrayList<>();
        try {
            Connection connection = DBUtils.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, offset);
            preparedStatement.setInt(2, limit);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                templates.add(new Template(Integer.parseInt(resultSet.getString("id")), Integer.parseInt(resultSet.getString("sellerId")), Integer.parseInt(resultSet.getString("categoryId")), resultSet.getString("name"), resultSet.getString("description"), Float.parseFloat(resultSet.getString("price")), resultSet.getString("hostUrl"), resultSet.getString("sourceCodePath"), resultSet.getString("createdDate"), resultSet.getString("lastModifiedDate"), Integer.parseInt(resultSet.getString("soldQuantity"))));
            }
            return templates;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public List<Template> getTemplatesByLatest(int offset, int limit) {
        String sql = "SELECT * FROM Template ORDER BY createdDate OFFSET ? ROWS FETCH NEXT ? ROWS ONLY";
        ArrayList<Template> templates = new ArrayList<>();
        try {
            Connection connection = DBUtils.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, offset);
            preparedStatement.setInt(2, limit);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                templates.add(new Template(Integer.parseInt(resultSet.getString("id")), Integer.parseInt(resultSet.getString("sellerId")), Integer.parseInt(resultSet.getString("categoryId")), resultSet.getString("name"), resultSet.getString("description"), Float.parseFloat(resultSet.getString("price")), resultSet.getString("hostUrl"), resultSet.getString("sourceCodePath"), resultSet.getString("createdDate"), resultSet.getString("lastModifiedDate"), Integer.parseInt(resultSet.getString("soldQuantity"))));
            }
            return templates;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public List<Template> getTemplatesByOldest(int offset, int limit) {
        String sql = "SELECT * FROM Template ORDER BY createdDate DESC OFFSET ? ROWS FETCH NEXT ? ROWS ONLY";
        ArrayList<Template> templates = new ArrayList<>();
        try {
            Connection connection = DBUtils.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, offset);
            preparedStatement.setInt(2, limit);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                templates.add(new Template(Integer.parseInt(resultSet.getString("id")), Integer.parseInt(resultSet.getString("sellerId")), Integer.parseInt(resultSet.getString("categoryId")), resultSet.getString("name"), resultSet.getString("description"), Float.parseFloat(resultSet.getString("price")), resultSet.getString("hostUrl"), resultSet.getString("sourceCodePath"), resultSet.getString("createdDate"), resultSet.getString("lastModifiedDate"), Integer.parseInt(resultSet.getString("soldQuantity"))));
            }
            return templates;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
}

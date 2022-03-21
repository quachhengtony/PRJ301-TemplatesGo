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
import models.Report;
import models.Template;
import utils.DBUtils;

/**
 *
 * @author Tony Quach
 */
public class TemplateManager {

    public int getSize(int sellerId) {
        String sql = "select id from Template where sellerId = ?";
        try {
            Connection conn = DBUtils.getConnection();
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setInt(1, sellerId);
            ResultSet rs = pstm.executeQuery();
            int count = 0;
            while (rs.next()) {
                count++;
            }
            return count;
        } catch (Exception e) {
        }
        return -1;
    }

    public boolean postTemplate(Template template) {
        String sql = "INSERT INTO Template (sellerId, categoryId, name, description, price, hostURL, sourceCodePath, createdDate, lastModifiedDate, soldQuantity) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
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
            preparedStatement.setDate(8, template.getCreatedDate());
            preparedStatement.setDate(9, template.getLastModifiedDate());
            preparedStatement.setInt(10, template.getSoldQuantity());
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

    public int postTemplateAndReturnId(Template template) {
        String sql = "INSERT INTO Template (sellerId, categoryId, name, description, price, hostURL, sourceCodePath, createdDate, lastModifiedDate, soldQuantity) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
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
            preparedStatement.setDate(8, template.getCreatedDate());
            preparedStatement.setDate(9, template.getLastModifiedDate());
            preparedStatement.setInt(10, template.getSoldQuantity());
            preparedStatement.executeUpdate();
            ResultSet resultSet = preparedStatement.getGeneratedKeys();
            int id = 0;
            if (resultSet.next()) {
                id = resultSet.getInt(1);
                return id;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return -1;
    }

    public boolean updateSourceCodePath(int tempId, String path) {
        String sql = "UPDATE Template SET sourceCodePath = ? WHERE id = ?";
        try {
            Connection connection = DBUtils.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql, new String[]{"id"});
            preparedStatement.setInt(2, tempId);
            preparedStatement.setString(1, path);
            preparedStatement.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }

    public boolean addTemplateImage(int templateId, String imagePath) {
        String sql = "INSERT INTO TemplateImage (templateId, path) VALUES (?, ?)";
        try {
            Connection connection = DBUtils.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql, new String[]{"id"});
            preparedStatement.setInt(1, templateId);
            preparedStatement.setString(2, imagePath);
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

    public List<String> getTemplateImages(int templateId) {
        String sql = "SELECT path FROM TemplateImage WHERE templateId = ?";
        try {
            Connection connection = DBUtils.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, templateId);
            ResultSet resultSet = preparedStatement.executeQuery();
            List<String> images = new ArrayList<>();
            while (resultSet.next()) {
                images.add(resultSet.getString("path"));
            }
            return images;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public String getTemplateSeller(int userId) {
        String sql = "SELECT username FROM [User] WHERE id = ?";
        try {
            Connection connection = DBUtils.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, userId);
            ResultSet resultSet = preparedStatement.executeQuery();
            String username = "";
            while (resultSet.next()) {
                username = resultSet.getString("username");
            }
            return username;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public boolean incrementTemplateSoldQuantity(int templateId) {
        String sql = "UPDATE Template SET soldQuantity = soldQuantity + 1 WHERE id = ?";
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

    public Template getTemplateById(int templateId) {
        String sql = "SELECT * FROM Template WHERE id = ?";
        Template template = new Template();
        try {
            Connection connection = DBUtils.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, templateId);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                template = new Template(Integer.parseInt(resultSet.getString("id")), Integer.parseInt(resultSet.getString("sellerId")), Integer.parseInt(resultSet.getString("categoryId")), resultSet.getString("name"), resultSet.getString("description"), Float.parseFloat(resultSet.getString("price")), resultSet.getString("hostUrl"), resultSet.getString("sourceCodePath"), resultSet.getDate("createdDate"), resultSet.getDate("lastModifiedDate"), Integer.parseInt(resultSet.getString("soldQuantity")));
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
            preparedStatement.setDate(7, template.getLastModifiedDate());
            preparedStatement.setInt(8, template.getId());
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
                templates.add(new Template(Integer.parseInt(resultSet.getString("id")), Integer.parseInt(resultSet.getString("sellerId")), Integer.parseInt(resultSet.getString("categoryId")), resultSet.getString("name"), resultSet.getString("description"), Float.parseFloat(resultSet.getString("price")), resultSet.getString("hostURL"), resultSet.getString("sourceCodePath"), resultSet.getDate("createdDate"), resultSet.getDate("lastModifiedDate"), Integer.parseInt(resultSet.getString("soldQuantity"))));
            }
            return templates;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public int getNumberOfRecords() {
        String sql = "SELECT * FROM Template";
        int count = 0;
        try {
            Connection connection = DBUtils.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                count++;
            }
            return count;
        } catch (Exception e) {
            System.out.println(e);
        }
        return count;
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
                templates.add(new Template(Integer.parseInt(resultSet.getString("id")), Integer.parseInt(resultSet.getString("sellerId")), Integer.parseInt(resultSet.getString("categoryId")), resultSet.getString("name"), resultSet.getString("description"), Float.parseFloat(resultSet.getString("price")), resultSet.getString("hostUrl"), resultSet.getString("sourceCodePath"), resultSet.getDate("createdDate"), resultSet.getDate("lastModifiedDate"), Integer.parseInt(resultSet.getString("soldQuantity"))));
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
                templates.add(new Template(Integer.parseInt(resultSet.getString("id")), Integer.parseInt(resultSet.getString("sellerId")), Integer.parseInt(resultSet.getString("categoryId")), resultSet.getString("name"), resultSet.getString("description"), Float.parseFloat(resultSet.getString("price")), resultSet.getString("hostUrl"), resultSet.getString("sourceCodePath"), resultSet.getDate("createdDate"), resultSet.getDate("lastModifiedDate"), Integer.parseInt(resultSet.getString("soldQuantity"))));
            }
            return templates;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public List<Template> getTemplatesBySearchString(String searchString, int offset, int limit) {
        String sql = "SELECT * FROM Template WHERE name LIKE '%" + searchString + "%' OR description LIKE '%" + searchString + "%' ORDER BY id OFFSET ? ROWS FETCH NEXT ? ROWS ONLY";
        ArrayList<Template> templates = new ArrayList<>();
        try {
            Connection connection = DBUtils.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, offset);
            preparedStatement.setInt(2, limit);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                templates.add(new Template(Integer.parseInt(resultSet.getString("id")), Integer.parseInt(resultSet.getString("sellerId")), Integer.parseInt(resultSet.getString("categoryId")), resultSet.getString("name"), resultSet.getString("description"), Float.parseFloat(resultSet.getString("price")), resultSet.getString("hostURL"), resultSet.getString("sourceCodePath"), resultSet.getDate("createdDate"), resultSet.getDate("lastModifiedDate"), Integer.parseInt(resultSet.getString("soldQuantity"))));
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
                templates.add(new Template(Integer.parseInt(resultSet.getString("id")), Integer.parseInt(resultSet.getString("sellerId")), Integer.parseInt(resultSet.getString("categoryId")), resultSet.getString("name"), resultSet.getString("description"), Float.parseFloat(resultSet.getString("price")), resultSet.getString("hostUrl"), resultSet.getString("sourceCodePath"), resultSet.getDate("createdDate"), resultSet.getDate("lastModifiedDate"), Integer.parseInt(resultSet.getString("soldQuantity"))));
            }
            return templates;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public List<Template> getTemplatesByPriceAscending(int offset, int limit) {
        String sql = "SELECT * FROM Template ORDER BY price OFFSET ? ROWS FETCH NEXT ? ROWS ONLY";
        ArrayList<Template> templates = new ArrayList<>();
        try {
            Connection connection = DBUtils.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, offset);
            preparedStatement.setInt(2, limit);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                templates.add(new Template(Integer.parseInt(resultSet.getString("id")), Integer.parseInt(resultSet.getString("sellerId")), Integer.parseInt(resultSet.getString("categoryId")), resultSet.getString("name"), resultSet.getString("description"), Float.parseFloat(resultSet.getString("price")), resultSet.getString("hostUrl"), resultSet.getString("sourceCodePath"), resultSet.getDate("createdDate"), resultSet.getDate("lastModifiedDate"), Integer.parseInt(resultSet.getString("soldQuantity"))));
            }
            return templates;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public List<Template> getTemplatesByPriceDescending(int offset, int limit) {
        String sql = "SELECT * FROM Template ORDER BY price DESC OFFSET ? ROWS FETCH NEXT ? ROWS ONLY";
        ArrayList<Template> templates = new ArrayList<>();
        try {
            Connection connection = DBUtils.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, offset);
            preparedStatement.setInt(2, limit);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                templates.add(new Template(Integer.parseInt(resultSet.getString("id")), Integer.parseInt(resultSet.getString("sellerId")), Integer.parseInt(resultSet.getString("categoryId")), resultSet.getString("name"), resultSet.getString("description"), Float.parseFloat(resultSet.getString("price")), resultSet.getString("hostUrl"), resultSet.getString("sourceCodePath"), resultSet.getDate("createdDate"), resultSet.getDate("lastModifiedDate"), Integer.parseInt(resultSet.getString("soldQuantity"))));
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
                templates.add(new Template(Integer.parseInt(resultSet.getString("id")), Integer.parseInt(resultSet.getString("sellerId")), Integer.parseInt(resultSet.getString("categoryId")), resultSet.getString("name"), resultSet.getString("description"), Float.parseFloat(resultSet.getString("price")), resultSet.getString("hostUrl"), resultSet.getString("sourceCodePath"), resultSet.getDate("createdDate"), resultSet.getDate("lastModifiedDate"), Integer.parseInt(resultSet.getString("soldQuantity"))));
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
                templates.add(new Template(Integer.parseInt(resultSet.getString("id")), Integer.parseInt(resultSet.getString("sellerId")), Integer.parseInt(resultSet.getString("categoryId")), resultSet.getString("name"), resultSet.getString("description"), Float.parseFloat(resultSet.getString("price")), resultSet.getString("hostUrl"), resultSet.getString("sourceCodePath"), resultSet.getDate("createdDate"), resultSet.getDate("lastModifiedDate"), Integer.parseInt(resultSet.getString("soldQuantity"))));
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
                templates.add(new Template(Integer.parseInt(resultSet.getString("id")), Integer.parseInt(resultSet.getString("sellerId")), Integer.parseInt(resultSet.getString("categoryId")), resultSet.getString("name"), resultSet.getString("description"), Float.parseFloat(resultSet.getString("price")), resultSet.getString("hostUrl"), resultSet.getString("sourceCodePath"), resultSet.getDate("createdDate"), resultSet.getDate("lastModifiedDate"), Integer.parseInt(resultSet.getString("soldQuantity"))));
            }
            return templates;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public boolean createReport(Report report) {
        String sql = "INSERT INTO Report (templateId, reporterId, content, createDate, status) VALUES (?, ?, ?, ?, ?)";
        try {
            Connection connection = DBUtils.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, report.getTemplateId());
            preparedStatement.setInt(2, report.getReporterId());
            preparedStatement.setString(3, report.getContent());
            preparedStatement.setDate(4, report.getCreateDate());
            preparedStatement.setString(5, report.getStatus());
            if (preparedStatement.executeUpdate() >= 0) {
                return true;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }
}

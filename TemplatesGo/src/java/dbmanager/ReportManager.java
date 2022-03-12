
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
import utils.DBUtils;

/**
 *
 * @author Thanh
 */
public class ReportManager {
   
    public boolean insert(Report report) {
        try {
            Connection con = DBUtils.getConnection();
            PreparedStatement ps = con.prepareStatement("INSERT INTO  dbo.Report VALUES (?,?,?,?,? )");
            ps.setInt(1, report.getReporterId());
            ps.setInt(2, report.getTemplateId());
            ps.setString(3, report.getContent());
            ps.setDate(4, report.getCreateDate());
            ps.setString(5, report.getStatus());

            ps.execute();
        } catch (Exception e) {

        }
        return true;
    }
  public List<Report> list(int offset, int limit){
      List<Report> report = new ArrayList<>();
       
        try {
            Connection con = DBUtils.getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM Report ORDER BY id OFFSET ? ROWS FETCH NEXT ? ROWS ONLY");
            ps.setInt(1, offset);
            ps.setInt(2, limit);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                report.add(new Report(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getDate(5), rs.getString(6)));
            }
        } catch (Exception e) {

        }

       
      return report;
  }
  public Report load(int reportId){
      Report load = null;
         try {
            Connection con = DBUtils.getConnection();
            PreparedStatement ps = con.prepareStatement("Select * from Report where id=?");
            ps.setInt(1, reportId);

            ResultSet rs = ps.executeQuery();
            while(rs.next()){
            load = new Report(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getDate(5), rs.getString(6));     
           return load;
            }
        } catch (Exception e) {

        }
      return null;
  }
    public boolean update(Report newReport) {
        try {
            Connection con = DBUtils.getConnection();
            PreparedStatement ps = con.prepareStatement(" UPDATE Report SET templateId = ?, reporterId = ?, content = ?, createDate = ?, status = ? WHERE id = ?");
            ps.setInt(1, newReport.getTemplateId());
            ps.setInt(2, newReport.getReporterId());
            ps.setString(3, newReport.getContent());
            ps.setDate(4, newReport.getCreateDate());
            ps.setString(5, newReport.getStatus());
            ps.setInt(6, newReport.getId());

            ps.execute();
        } catch (Exception e) {

        }
        return true;
    }
    public boolean delete(int reportId) {
        try {
            Connection con = DBUtils.getConnection();
            PreparedStatement ps = con.prepareStatement("DELETE FROM Report WHERE id = ?");
            ps.setInt(1, reportId);

            ps.execute();
        } catch (Exception e) {

        }
        return true;
    }
  
}

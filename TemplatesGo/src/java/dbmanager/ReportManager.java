
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
import utils.DBUtil;

/**
 *
 * @author Thanh
 */
public class ReportManager {
   
  public boolean insert(Report report){
          try {
            Connection con = DBUtil.getConnection();
            PreparedStatement ps = con.prepareStatement("INSERT INTO  dbo.Report VALUES ( ?,?,?,?,?,? )");
            ps.setInt(1, report.getId());
             ps.setInt(2, report.getReporterId());
              ps.setInt(3, report.getTemplateId());
              ps.setString(4, report.getContent());
            ps.setDate(5, (java.sql.Date) report.getCreateDate());
              ps.setString(6, report.getStatus());
          
            ps.executeQuery();
        } catch (Exception e) {

        }
        return true;
  }
  public List<Report> list(){
      List<Report> report = new ArrayList<>();
       
        try {
            Connection con = DBUtil.getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM dbo.Report");
            

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
            Connection con = DBUtil.getConnection();
            PreparedStatement ps = con.prepareStatement("Select * from Report where id=?");
            

            ResultSet rs = ps.executeQuery();
            while(rs.next()){
            load = new Report(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getDate(5), rs.getString(6));     
           return load;
            }
        } catch (Exception e) {

        }
      return null;
  }
  public boolean update(Report newReport){
          try {
            Connection con = DBUtil.getConnection();
            PreparedStatement ps = con.prepareStatement(" UPDATE p SET Username= ? ,firstName= ? ,LastName= ? ,Email= ? ,Password= ? ,Avartar= ? ,Role  `= ? ,  WHERE id = 103");
             ps.setInt(1, newReport.getId());
             ps.setInt(2, newReport.getReporterId());
              ps.setInt(3, newReport.getTemplateId());
              ps.setString(4, newReport.getContent());
            ps.setDate(5, (java.sql.Date) newReport.getCreateDate());
              ps.setString(6, newReport.getStatus());
            ps.executeQuery();
        } catch (Exception e) {

        }
        return true;
  }
  public boolean delete(int reportId){
         Report report = new Report();
                
        try {
            Connection con = DBUtil.getConnection();
            PreparedStatement ps = con.prepareStatement("DELETE  FROM p WHERE Username= ? ,firstName= ? ,LastName= ? ,Email= ? ,Password= ? ,Avartar= ? ,Role  `= ? ,  WHERE id = ?");
           ps.setInt(1, report.getId());
             ps.setInt(2, report.getReporterId());
              ps.setInt(3, report.getTemplateId());
              ps.setString(4, report.getContent());
            ps.setDate(5, (java.sql.Date) report.getCreateDate());
              ps.setString(6, report.getStatus());
            ps.executeQuery();
        } catch (Exception e) {

        }
        return true;
  }
  
  
  
}


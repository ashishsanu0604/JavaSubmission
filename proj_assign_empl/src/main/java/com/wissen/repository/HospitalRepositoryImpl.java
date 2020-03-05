package com.wissen.repository;

import com.wissen.model.Employee;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class HospitalRepositoryImpl implements HospitalRepository {
    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }
    @Override
    public void addEmp(Employee employee){
        String query = "insert into Employee values (?,?,?,?)";
        Connection con = null;
        PreparedStatement ps = null;
        try{
            con = dataSource.getConnection();
            ps = con.prepareStatement(query);
            ps.setInt(1, employee.getId());
            ps.setString(2, employee.getJob());
            ps.setInt(3,employee.getWorkHours());
            Integer sal=employee.calcSalary(employee.getWorkHours());
            ps.setInt(4,sal);
            int out = ps.executeUpdate();
            if(out !=0){
                System.out.println("Employee saved with id="+employee.getId());
            }else System.out.println("Employee save failed with id="+employee.getId());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try {
                ps.close();
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


}

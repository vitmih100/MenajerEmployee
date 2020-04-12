package menajeremployee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;
import java.util.List;


public class EmployeeDb {
  void insert(Employee emp) {
     String sql = "insert into postgres.employee(idnp,nume,prenume,sarariu,data_ang,data_nast,gen)"
                + "values(?,?,?,?,?,?,?)";
    Connection conn = ConnectionDb.initConnection();
    PreparedStatement statement=null;
    
    try{
      if(conn!=null){
        statement = conn.prepareStatement(sql);
        statement.setInt   (1, emp.getIdnp());
        statement.setString(2, emp.getName());
        statement.setString(3, emp.getsurName());
        statement.setFloat (4, (float)emp.getSalary());
        statement.setDate  (5, Date.valueOf(emp.getHireDay()));
        statement.setDate  (6, Date.valueOf(emp.getBirthDay()));
        statement.setInt   (7, emp.getGender().ordinal());
        int rows = statement.executeUpdate();
        System.out.println("Inserted" + rows + " rows"); 
      } else {
        System.out.println("Insert failed");
      } 
    } catch(SQLException ex){
      System.out.println("ERROR! Insert failed. " + ex.getMessage());
    }finally{
      try {
        if(statement!=null){
          statement.close(); 
        }
        if(conn!=null){
          conn.close();
        }
      }catch(SQLException ex){
        System.out.println(ex.getMessage());
      }
    }   
  }
  void insert(List<Employee> emps) {
     String sql = "insert into postgres.employee(idnp,nume,prenume,sarariu,data_ang,data_nast,gen)"
                + "values(?,?,?,?,?,?,?)";
    Connection conn = ConnectionDb.initConnection();
    PreparedStatement statement=null;
    
    try{
      if(conn!=null){
        for(Employee emp : emps){
          statement = conn.prepareStatement(sql);
          statement.setInt   (1, emp.getIdnp());
          statement.setString(2, emp.getName());
          statement.setString(3, emp.getsurName());
          statement.setFloat (4, (float)emp.getSalary());
          statement.setDate  (5, Date.valueOf(emp.getHireDay()));
          statement.setDate  (6, Date.valueOf(emp.getBirthDay()));
          statement.setInt   (7, emp.getGender().ordinal());
          int rows = statement.executeUpdate();
          System.out.println("Inserted " + rows + " rows"); 
        }
      } else {
        System.out.println("Multiple insert failed");
      } 
    } catch(SQLException ex){
      System.out.println("ERROR! Multiple insert failed. " + ex.getMessage());
    }finally{
      try {
        if(statement!=null){
          statement.close(); 
        }
        if(conn!=null){
          conn.close();
        }
      }catch(SQLException ex){
        System.out.println(ex.getMessage());
      }
    }       
      
  }
   
}

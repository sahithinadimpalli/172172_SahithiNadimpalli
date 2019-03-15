package com.cg.Jdbc;

import org.springframework.jdbc.core.JdbcTemplate;  

public class EmployeeDao {  
private JdbcTemplate jdbcTemplate;  
  
public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {  
    this.jdbcTemplate = jdbcTemplate;  
}  
  
public int saveEmployee(Employee e){  
    String query="insert into employee values( '"+e.getEmpno()+"','"+e.getEname()+"','"+e.getSal()+"' ";  
    return jdbcTemplate.update(query);  
}  
public int updateEmployee(Employee e){  
    String query="update employee set name='"+e.getEname()+"',salary='"+e.getSal()+"' where id='"+e.getEmpno()+"' ";  
    return jdbcTemplate.update(query);  
}  
public int deleteEmployee(Employee e){  
    String query="delete from employee where id='"+e.getEmpno()+"' ";  
    return jdbcTemplate.update(query);  
}  
  
}  

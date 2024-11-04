/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */





//for data base connectivity by JDBC

//package travel.management.system1;
//



package travel.management.system1;

import java.sql.Connection;
import java.sql.*;


public class Con {           //to show in database open mysqlcommand line client then
                            // query show databases, use online, show tables
    
    static
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Load Successfully");
            
        }
        catch(ClassNotFoundException e)
        {
            System.out.println(e);
        }
    }
    public static Connection getConnection()
    {
        
    
            
    PreparedStatement ps=null;
       Connection con=null;
       Statement s;
    try{
    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/online","root","root");
            System.out.println("Connection successful");
}
    catch(Exception e)
    {
        System.out.println(e); 
    }
    return con;
}
}

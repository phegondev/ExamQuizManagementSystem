/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;
import java.sql.*;

/**
 *
 * @author decagon
 */
public class ConnectionProvider {
    public static Connection getCon(){
        try{ //here we are connectng to our database and returning the instance
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qems","root","");
            return con;
        }
        catch(Exception e){
            return null;
            
        }
        
    }
    
}

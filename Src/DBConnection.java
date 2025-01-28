package jFrames;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Ankul
 */
public class DBConnection {
    
  static Connection con = null;
  
  public static Connection getmysqlConnection(){
            try {
            Class.forName("com.mysql.cj.jdbc.Driver");
             con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library_ms","root","2868");

      } catch (Exception e) {
          e.printStackTrace();
      }
      return con;
  }
        
}
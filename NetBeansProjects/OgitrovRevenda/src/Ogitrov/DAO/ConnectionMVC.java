
package Ogitrov.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class ConnectionMVC {
    
    private static final String URL = "jdbc:mysql://localhost:3306/ogitrovrevenda";
    private static final String USER = "root";
    
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String SENHA = "";
    
    public static void executar(String query){
        try{
            Class.forName(DRIVER);
            Connection conn = DriverManager.getConnection(URL,USER,SENHA);
            Statement st = conn.createStatement();
            System.out.println();
            st.execute(query);
            conn.close();
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    
    public static ResultSet consultar(String query){
        try{
            Class.forName(DRIVER);
            Connection conn = DriverManager.getConnection(URL,USER,SENHA);
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            return rs;
          
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return null;
        }
    }
    
    
}

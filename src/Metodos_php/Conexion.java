

package Metodos_php;

import com.toedter.calendar.JDateChooser;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Conexion {

    Connection con;
    Statement stmt;
   public Conexion (){
       
       try {
           Class.forName("com.mysql.cj.jdbc.Driver");
           /* con = DriverManager.httpget("https://desarrollos.cl/app-contigo/api/api.service.php");*/
         con = DriverManager.getConnection("jdbc:mysql://localhost:3306/contigosw?useTimezone=true&serverTimezone=UTC", "root", "root");
           stmt = con.createStatement( );
       } catch (ClassNotFoundException | SQLException ex) {
           Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
   public void modificabd (String sql){
        try {
            stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
   }

   public ResultSet consultabd (String sql){
       ResultSet rs = null;
        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
   }
   
   SimpleDateFormat Formato = new SimpleDateFormat("dd-MM-yyyy");
         public String getFecha(JDateChooser jd){
            if (jd.getDate()!=null){
            return Formato.format(jd.getDate());
            }else{
            return null;
            }
    }   
}

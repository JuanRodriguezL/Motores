/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zapateriadb;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author juanc
 */
public class ConexionModel {
     Connection con ;
       String url="jdbc:postgresql://localhost/Proyecto";
       String usuario="postgres";
       String contrasena="2143";
       
       
          public void conectar(){
             try {
             con = DriverManager.getConnection(url, usuario, contrasena);
             JOptionPane.showMessageDialog(null,"Conexion exitosa");
             } catch (Exception e) {
                  System.out.println("No se pudo conectar");
        }
    }
          
           public Connection get_connection(){
        return con;
    } 
}

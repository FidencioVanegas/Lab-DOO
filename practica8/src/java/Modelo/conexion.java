/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Metal
 */
public class conexion {
    private Connection conexion;
    private void abrirConexion() throws SQLException{
        String url, usuario, password;
        url = "jdbc:derby:C:/Users/Metal/Documents/NetBeansProjects/practica8/BD";
        usuario = "APP";
        password = "admin";
        conexion = DriverManager.getConnection(url,usuario,password);
    }
    private void cerrarConexion() throws SQLException{
        conexion.close();
    }
    public void registrar(Usuario usuario) throws SQLException{
        try{
            abrirConexion();
            String nombre = usuario.getNombre();
            String correo = usuario.getCorreo();
            String fechaDeNacimiento = usuario.getFecha();
            String contrasenia = usuario.getContra();
            String sql = "insert into USUARIOS values ('"+nombre+"', '"+correo+"', '"+fechaDeNacimiento+"', '"+contrasenia+"')";
            Statement stmt = conexion.createStatement();
            stmt.executeUpdate(sql);
            cerrarConexion();
        }catch(SQLException registroFallido){
            System.out.println("El error fue al momento del registro");
        }
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Models.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ConsultasDAO {
    ConexionDAO con = new ConexionDAO();
    

        
        public List<Usuario> consultarUsuarios() throws Exception {
        List<Usuario> Usuarios = new ArrayList<Usuario>();

        try {
            String query = "SELECT id_usuario, persona_id, nombre_usuario, contraseña, rol_id, fecha_ingreso, fecha_login, estado FROM usuario";
            Statement s = con.conexionMysql().createStatement();
            ResultSet r = s.executeQuery(query);

            while (r.next()) {
                Usuario datos = new Usuario();

                datos.setId_usuario(r.getLong("id_usuario"));
                datos.setPersona_id(r.getLong("persona_id"));
                datos.setNombre_usuario(r.getString("nombre_usuario"));
                datos.setContraseña(r.getString("contraseña"));
                datos.setRol_id(r.getLong("rol_id"));
                datos.setFecha_ingreso(r.getString("fecha_ingreso"));
                datos.setFecha_login(r.getString("fecha_login"));
                datos.setEstado(r.getString("estado"));
                Usuarios.add(datos);
            }
        } catch (Exception e) {
            System.out.println("Error al consultar usuarios");
        } finally {
            if (con != null) {
                try {
                    con.conexionMysql().close();
                    System.out.println("Cierre de conexion exitosa");
                } catch (SQLException ex) {
                    System.out.println("Error al cerrar conexion");
                }
            }
        }

        return Usuarios;
    }
    

}

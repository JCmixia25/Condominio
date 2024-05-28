/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Models.Anuncio;
import Models.Usuario;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;

public class ConsultasDAO implements Serializable {

    ConexionDAO con = new ConexionDAO();
    private StreamedContent image;
    private Connection conexion;

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

    public List<Anuncio> consultarAnuncios() throws Exception {
        List<Anuncio> anuncios = new ArrayList<Anuncio>();
        String query = "SELECT id_anuncio, usuario_id, descripcion, fecha_publicacion, fecha_vencimiento FROM anuncio";

        try {

            Statement s = con.conexionMysql().createStatement();
            ResultSet r = s.executeQuery(query);

            while (r.next()) {
                Anuncio datos = new Anuncio();

                datos.setId_anuncio(r.getLong("id_anuncio"));
                datos.setUsuario_id(r.getLong("usuario_id"));
                datos.setDescripcion(r.getString("descripcion"));
//              datos.setImagen(r.getBlob("imagen"));
                datos.setFecha_publicacion(r.getString("fecha_publicacion"));
                datos.setFecha_vencimiento(r.getString("fecha_vencimiento"));
                anuncios.add(datos);
            }
        } catch (Exception e) {
            System.out.println("Error al consultar anuncios" + query);
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

        return anuncios;
    }

    public Long getUserId(String usuario, String contraseña) {
        String query = "SELECT id FROM usuarios WHERE usuario = ? AND contraseña = ?";
        try (PreparedStatement stmt = conexion.prepareStatement(query)) {
            stmt.setString(1, usuario);
            stmt.setString(2, contraseña);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getLong("id");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}

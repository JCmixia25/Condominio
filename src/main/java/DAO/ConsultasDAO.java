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

import Models.ControlReportes;
import Models.Cuenta;
import Models.RegistroPropiedad;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.Serializable;

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

    public List<ControlReportes> consultarReporte() throws Exception {
        List<ControlReportes> Reporte = new ArrayList<ControlReportes>();
        String query = "SELECT id_reporte, autor_id, usuario_asignado_id, descripcion, fecha_creacion, fecha_cierre, estado FROM reporte";
        try {

            Statement s = con.conexionMysql().createStatement();
            ResultSet r = s.executeQuery(query);

            while (r.next()) {
                ControlReportes reporte = new ControlReportes();

                reporte.setId_reporte(r.getLong("id_reporte"));
                reporte.setAutor_id(r.getLong("autor_id"));
                reporte.setUsuario_asignado_id(r.getLong("usuario_asignado_id"));
                reporte.setDescripcion(r.getString("descripcion"));
                reporte.setFecha_creacion(r.getString("fecha_creacion"));
                reporte.setFecha_cierre(r.getString("fecha_cierre"));
                reporte.setEstado(r.getString("estado"));
                Reporte.add(reporte);
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
        System.out.println("Reporte query: " + query);
        return Reporte;
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
            System.out.println("Error al consultar anuncios");

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

    public List<Anuncio> consultarPagos() throws Exception {
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
            System.out.println("Error al consultar anuncios");

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

    public List<Cuenta> consultarCuenta() throws Exception {
        List<Cuenta> cuentas = new ArrayList<Cuenta>();
        String query = "SELECT id_cuenta, usuario_id, estado, saldo_pagar, saldo_deudor FROM cuenta";
        try {

            Statement s = con.conexionMysql().createStatement();
            ResultSet r = s.executeQuery(query);

            while (r.next()) {
                Cuenta datos = new Cuenta();

                datos.setId_cuenta(r.getLong("id_cuenta"));
                datos.setUsuario_id(r.getLong("usuario_id"));
                datos.setEstados(r.getString("estado"));
//              datos.setImagen(r.getBlob("imagen"));
                datos.setSaldo_pagar(r.getString("saldo_pagar"));
                datos.setSaldo_deudor(r.getString("saldo_deudor"));
                cuentas.add(datos);
            }
        } catch (Exception e) {
            System.out.println("Error al consultar cuentas: "+query);

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
        return cuentas;
    }
    
        public List<RegistroPropiedad> consultarRegistroPropiedad() throws Exception {
        List<RegistroPropiedad> registros = new ArrayList<RegistroPropiedad>();
        String query = "SELECT id_registro, persona_id, propiedad_id FROM registro_propiedad";
        try {

            Statement s = con.conexionMysql().createStatement();
            ResultSet r = s.executeQuery(query);

            while (r.next()) {
                RegistroPropiedad datos = new RegistroPropiedad();

                datos.setId_registro(r.getLong("id_registro"));
                datos.setPersona_id(r.getLong("persona_id"));
                datos.setPropiedad_id(r.getLong("propiedad_id"));

                registros.add(datos);
            }
        } catch (Exception e) {
            System.out.println("Error al consultar registros cuentas: "+query);

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
        return registros;
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

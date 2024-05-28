/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.ConsultasDAO;
import Models.Anuncio;
import Models.ControlReportes;
import Models.Usuario;
import java.io.IOException;
import java.io.Serializable;
import java.sql.Blob;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

//import org.primefaces.context.RequestContext;

@ManagedBean(name = "bkn_inicio")
public class inicioController implements Serializable {

    /**
     * @return the listaReportesFiltrados2
     */
    public List<ControlReportes> getListaReportesFiltrados2() {
        return listaReportesFiltrados2;
    }

    /**
     * @param listaReportesFiltrados2 the listaReportesFiltrados2 to set
     */
    public void setListaReportesFiltrados2(List<ControlReportes> listaReportesFiltrados2) {
        this.listaReportesFiltrados2 = listaReportesFiltrados2;
    }
    
    /**
     * @return the listaReportesFiltrados
     */
    public List<ControlReportes> getListaReportesFiltrados() {
        return listaReportesFiltrados;
    }

    /**
     * @param listaReportesFiltrados the listaReportesFiltrados to set
     */
    public void setListaReportesFiltrados(List<ControlReportes> listaReportesFiltrados) {
        this.listaReportesFiltrados = listaReportesFiltrados;
    }


    private ConsultasDAO consulta;

    /**
     * @return the listaAnuncios
     */
    public List<Anuncio> getListaAnuncios() {
        return listaAnuncios;
    }

    /**
     * @param listaAnuncios the listaAnuncios to set
     */
    public void setListaAnuncios(List<Anuncio> listaAnuncios) {
        this.listaAnuncios = listaAnuncios;
    }

    /**
     * @return the id_anuncio
     */
    public Long getId_anuncio() {
        return id_anuncio;
    }

    /**
     * @param id_anuncio the id_anuncio to set
     */
    public void setId_anuncio(Long id_anuncio) {
        this.id_anuncio = id_anuncio;
    }

    /**
     * @return the usuario_id
     */
    public Long getUsuario_id() {
        return usuario_id;
    }

    /**
     * @param usuario_id the usuario_id to set
     */
    public void setUsuario_id(Long usuario_id) {
        this.usuario_id = usuario_id;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the imagen
     */
    public Blob getImagen() {
        return imagen;
    }

    /**
     * @param imagen the imagen to set
     */
    public void setImagen(Blob imagen) {
        this.imagen = imagen;
    }

    /**
     * @return the fecha_publicacion
     */
    public String getFecha_publicacion() {
        return fecha_publicacion;
    }

    /**
     * @param fecha_publicacion the fecha_publicacion to set
     */
    public void setFecha_publicacion(String fecha_publicacion) {
        this.fecha_publicacion = fecha_publicacion;
    }

    /**
     * @return the fecha_vencimiento
     */
    public String getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    /**
     * @param fecha_vencimiento the fecha_vencimiento to set
     */
    public void setFecha_vencimiento(String fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    /**
     * @return the id_reporte
     */
    public Long getId_reporte() {
        return id_reporte;
    }

    /**
     * @param id_reporte the id_reporte to set
     */
    public void setId_reporte(Long id_reporte) {
        this.id_reporte = id_reporte;
    }

    /**
     * @return the autor_id
     */
    public Long getAutor_id() {
        return autor_id;
    }

    /**
     * @param autor_id the autor_id to set
     */
    public void setAutor_id(Long autor_id) {
        this.autor_id = autor_id;
    }

    /**
     * @return the usuario_asignado_id
     */
    public Long getUsuario_asignado_id() {
        return usuario_asignado_id;
    }

    /**
     * @param usuario_asignado_id the usuario_asignado_id to set
     */
    public void setUsuario_asignado_id(Long usuario_asignado_id) {
        this.usuario_asignado_id = usuario_asignado_id;
    }

    /**
     * @return the descripcion
     */
  

    /**
     * @return the fecha_creacion
     */
    public String getFecha_creacion() {
        return fecha_creacion;
    }

    /**
     * @param fecha_creacion the fecha_creacion to set
     */
    public void setFecha_creacion(String fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    /**
     * @return the fecha_cierre
     */
    public String getFecha_cierre() {
        return fecha_cierre;
    }

    /**
     * @param fecha_cierre the fecha_cierre to set
     */
    public void setFecha_cierre(String fecha_cierre) {
        this.fecha_cierre = fecha_cierre;
    }

    /**
     * @return the estador
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estador the estador to set
     */
    public void setEstado(String estador) {
        this.estado = estador;
    }

    /**
     * @return the listaReportes
     */
    public List<ControlReportes> getListaReportes() {
        return listaReportes;
    }

    /**
     * @param listaReportes the listaReportes to set
     */
    public void setListaReportes(List<ControlReportes> listaReportes) {
        this.listaReportes = listaReportes;
    }

    /**
     * @return the mensaje
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * @param mensaje the mensaje to set
     */
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public void validarUsuario() throws Exception {

        ConsultasDAO consulta = new ConsultasDAO();

        try {
            setListaUsuarios(consulta.consultarUsuarios());
            System.out.println("Usuarios: " + consulta.consultarUsuarios());
        } catch (Exception e) {
            System.out.println("Error al listar usuarios");
        }

        if (nombre_usuario.isEmpty() || contraseña.isEmpty()) {
            mensaje = "Por favor llene los campos";
        }

        for (Usuario usuario : listaUsuarios) {
            Direccionamiento direccion = new Direccionamiento();

            if (usuario.getNombre_usuario().compareTo(nombre_usuario) == 0 && usuario.getContraseña().compareTo(contraseña) == 0) {
                System.out.println("Usuario correcto");

                nombre_usuario = "";
                contraseña = "";
                mensaje = "";

                if (usuario.getRol_id() == 1) {
                    direccion.inicioAdmin();
                } else if (usuario.getRol_id() == 2) {
                    direccion.inicioManto();
                } else if (usuario.getRol_id() == 3) {
                    direccion.inicioCliente();
                }

            } else {
                mensaje = "Credenciales incorrectas";
            }
        }
    }

    public void cargarUsuarios() {

        System.out.println("HOLA ESTA ES UNA PRUEBA");
//        RequestContext.getCurrentInstance().execute("cargarVistaUsuarios()");

    }

    /**
     * @return the contraseña
     */
    public String getContraseña() {
        return contraseña;
    }

    /**
     * @param contraseña the contraseña to set
     */
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    /**
     * @return the id_usuario
     */
    public Long getId_usuario() {
        return id_usuario;
    }

    /**
     * @param id_usuario the id_usuario to set
     */
    public void setId_usuario(Long id_usuario) {
        this.id_usuario = id_usuario;
    }

    /**
     * @return the persona_id
     */
    public Long getPersona_id() {
        return persona_id;
    }

    /**
     * @param persona_id the persona_id to set
     */
    public void setPersona_id(Long persona_id) {
        this.persona_id = persona_id;
    }

    /**
     * @return the nombre_usuario
     */
    public String getNombre_usuario() {
        return nombre_usuario;
    }

    /**
     * @param nombre_usuario the nombre_usuario to set
     */
    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    /**
     * @return the rol_id
     */
    public Long getRol_id() {
        return rol_id;
    }

    /**
     * @param rol_id the rol_id to set
     */
    public void setRol_id(Long rol_id) {
        this.rol_id = rol_id;
    }

    /**
     * @return the fecha_ingreso
     */
    public String getFecha_ingreso() {
        return fecha_ingreso;
    }

    /**
     * @param fecha_ingreso the fecha_ingreso to set
     */
    public void setFecha_ingreso(String fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    /**
     * @return the fecha_login
     */
    public String getFecha_login() {
        return fecha_login;
    }

    /**
     * @param fecha_login the fecha_login to set
     */
    public void setFecha_login(String fecha_login) {
        this.fecha_login = fecha_login;
    }

    /**
     * @return the listaUsuarios
     */
    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    /**
     * @param listaUsuarios the listaUsuarios to set
     */
    public void setListaUsuarios(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    //Usuarios
    private Long id_usuario;
    private Long persona_id;
    private String nombre_usuario = "";
    private String contraseña = "";
    private Long rol_id;
    private String fecha_ingreso = "";
    private String fecha_login = "";
    private String estado = "";
    private List<Usuario> listaUsuarios;
    private String mensaje = "";

    
    //Anuncio
    private Long id_anuncio;
    private Long usuario_id;
    private String descripcion;
    private Blob imagen;
    private String fecha_publicacion;
    private String fecha_vencimiento;
    private List<Anuncio> listaAnuncios;


    //Control reporte
    private Long id_reporte;
    private Long autor_id;
    private Long usuario_asignado_id;
    private String fecha_creacion;
    private String fecha_cierre;
    // private String estado;
    private List<ControlReportes> listaReportes;
    private List<ControlReportes> listaReportesFiltrados;
    private List<ControlReportes> listaReportesFiltrados2;

    
      public void listarReportesFiltrados() {
        try {
            if (listaReportes!= null) {
                setListaReportesFiltrados(listaReportes.stream()
                        .filter(reporte -> "resuelto".equalsIgnoreCase(reporte.getEstado()))
                        .collect(Collectors.toList()));
                System.out.println("Reportes filtrados encontrados: " + getListaReportesFiltrados().size());
            } else {
                System.out.println("No hay reportes para filtrar.");
            }
        } catch (Exception e) {
            System.out.println("Error al filtrar reportes");
            e.printStackTrace();
        }
    }
      
      public void listarReportesFiltrados2() {
    try {
        if (listaReportes!= null) {
            setListaReportesFiltrados2(listaReportes.stream()
                   .filter(reporte -> "pendiente".equalsIgnoreCase(reporte.getEstado()))
                   .collect(Collectors.toList()));
            System.out.println("Reportes filtrados encontrados: " + getListaReportesFiltrados2().size());
        } else {
            System.out.println("No hay reportes para filtrar.");
        }
    } catch (Exception e) {
        System.out.println("Error al filtrar reportes");
        e.printStackTrace();
    }
}


      
    public void listarUsuarios() {

        ConsultasDAO consulta = new ConsultasDAO();

        try {
            setListaUsuarios(consulta.consultarUsuarios());
            System.out.println("Usuarios: " + consulta.consultarUsuarios());
        } catch (Exception e) {
            System.out.println("Error al listar usuarios");
        }

    }

    public void listarAnuncios() {

        ConsultasDAO consulta = new ConsultasDAO();

        try {

            setListaAnuncios(consulta.consultarAnuncios());
            System.out.println("Usuarios: " + consulta.consultarAnuncios());

        } catch (Exception e) {
            System.out.println("Error al listar anuncios");
        }

    }
        public void listarReportes() {

        ConsultasDAO consulta = new ConsultasDAO();

        try {
            setListaReportes(consulta.consultarReporte());
            System.out.println("Reportes: " + consulta.consultarReporte());
        } catch (Exception e) {
            System.out.println("Error al listar usuarios");
        }

    }
            

    public void logout() {
        FacesContext context = FacesContext.getCurrentInstance();
        HttpSession session = (HttpSession) context.getExternalContext().getSession(false);
        Long userId = consulta.getUserId(nombre_usuario, contraseña);
        if (session != null) {
            session.invalidate(); // Invalida la sesión actual
            System.out.println("Session ID: " + session.getId());
            System.out.println("User ID stored in session: " + userId);
        }
        try {
            // Redirigir a la página de login
            context.getExternalContext().redirect("Login.xhtml");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @PostConstruct
    public void init() {
        // Puedes inicializar algún dato aquí si es necesario
        listarUsuarios();
        listarAnuncios();
        listarReportes();
        listarReportesFiltrados();
        listarReportesFiltrados2();
    }

}
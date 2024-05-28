/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.ConsultasDAO;
import Models.Anuncio;
import Models.Usuario;
import java.io.IOException;
import java.io.Serializable;
import java.sql.Blob;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
//import org.primefaces.context.RequestContext;

@ManagedBean(name = "bkn_inicio")
public class inicioController implements Serializable {
    
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
                
                if(usuario.getRol_id()==1){
                    direccion.inicioAdmin();
                }else if(usuario.getRol_id()==2){
                    direccion.inicioManto();
                }else if(usuario.getRol_id()==3){
                    direccion.inicioCliente();
                }
                   
            } else {
                mensaje = "Credenciales incorrectas";
            }
        }
    }
    
    public void cargarUsuarios(){
        
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
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
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
    }

}

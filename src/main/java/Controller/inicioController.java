/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.ConsultasDAO;
import Models.ControlReportes;
import Models.Usuario;
import Models.Reporte;
import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
//import org.primefaces.context.RequestContext;

@ManagedBean(name = "bkn_inicio")


    
public class inicioController implements Serializable {

    
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

    //Reporte
    private Long id_reporte;
    private Long autor_id;
    private Long usuario_asignado_id;
    private Long imagen;
    private String descripcion;
    private String estado_reporte;
    private String fecha_cierre;
    private String fecha_creacion;
    private List<Reporte>listaReportes;
   
/*     private List<ControlReportes> listaReportesFiltrados;
    private List<ControlReportes> listaReportesFiltrados2;
    // Filtro de Usuario Asignado ID de Mantenimiento 
    private List<ControlReportes> listaReportesManto;
    private List<ControlReportes> listaReportesManto2;
  */ 
   
    public void listarUsuarios() {

        ConsultasDAO consulta = new ConsultasDAO();

        try {
            setListaUsuarios(consulta.consultarUsuarios());
            System.out.println("Usuarios: " + consulta.consultarUsuarios());
        } catch (Exception e) {
            System.out.println("Error al listar usuarios");
        }

    }
    
    public void listarReportes() {

        ConsultasDAO consultaa = new ConsultasDAO();

        try {
            setListaReportes(consultaa.consultarReportes());
            System.out.println("Reportes: " + consultaa.consultarReportes());
        } catch (Exception e) {
            System.out.println("Error al listar usuarios");
        }

    }


    @PostConstruct
    public void init() {
        // Puedes inicializar algún dato aquí si es necesario
        listarUsuarios();
//       cargarUsuarios();

         listarReportes();


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
                 } else if (usuario.getRol_id() == 4){
                    direccion.inicioManto2(); 
            } else {
                mensaje = "Credenciales incorrectas";
            }
        }
    }
}
    
    public void cargarUsuarios(){
        
        System.out.println("HOLA ESTA ES UNA PRUEBA");
//        RequestContext.getCurrentInstance().execute("cargarVistaUsuarios()");
       
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
     * @return the imagen
     */
    public Long getImagen() {
        return imagen;
    }

    /**
     * @param imagen the imagen to set
     */
    public void setImagen(Long imagen) {
        this.imagen = imagen;
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
     * @return the estado_reporte
     */
    public String getEstado_reporte() {
        return estado_reporte;
    }

    /**
     * @param estado_reporte the estado_reporte to set
     */
    public void setEstado_reporte(String estado_reporte) {
        this.estado_reporte = estado_reporte;
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
     * @return the listaReportes
     */
    public List<Reporte> getListaReportes() {
        return listaReportes;
    }

    /**
     * @param listaReportes the listaReportes to set
     */
    public void setListaReportes(List<Reporte> listaReportes) {
        this.listaReportes = listaReportes;
    }
    
    //agregado manual
    /**
     * @return the listaReportesManto2
     */
    /*public List<ControlReportes> getListaReportesManto2() {
        return listaReportesManto2;
    }

    /**
     * @param listaReportesManto2 the listaReportesManto2 to set
     */
  /*  public void setListaReportesManto2(List<ControlReportes> listaReportesManto2) {
        this.listaReportesManto2 = listaReportesManto2;
    }
*/
    /**
     * @return the listaReportesManto
     */
  /*  public List<ControlReportes> getListaReportesManto() {
        return listaReportesManto;
    }
*/
    /**
     * @param listaReportesManto the listaReportesManto to set
     */
   /* public void setListaReportesManto(List<ControlReportes> listaReportesManto) {
        this.listaReportesManto = listaReportesManto;
    }
    */
    
   
           /*
     public void listarReportesFiltradosPorUsuarioAsignadoId() {
        try {
            if (listaReportes!= null) {
                // Filtrar reportes donde usuario_asignado_id es igual a 2
                setListaReportesManto(listaReportes.stream()
                       .filter(reporte -> "2".equals(String.valueOf(reporte.getUsuario_asignado_id())))
                       .collect(Collectors.toList()));
                System.out.println("Reportes filtrados encontrados: " + getListaReportesManto().size());
            } else {
                System.out.println("No hay reportes para filtrar.");
            }
        } catch (Exception e) {
            System.out.println("Error al filtrar reportes");
            e.printStackTrace();
        }
    }
     
      public void listarReportesFiltradosPorUsuarioAsignadoId2() {
        try {
            if (listaReportes!= null) {
                // Filtrar reportes donde usuario_asignado_id es igual a 4
                setListaReportesManto2(  listaReportes.stream()
                       .filter(reporte -> "4".equals(String.valueOf(reporte.getUsuario_asignado_id())))
                       .collect(Collectors.toList()));
                System.out.println("Reportes filtrados encontrados: " + getListaReportesManto2().size());
            } else {
                System.out.println("No hay reportes para filtrar.");
            }
        } catch (Exception e) {
            System.out.println("Error al filtrar reportes");
            e.printStackTrace();
        }
    }
      
  
   */
    
}


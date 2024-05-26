/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.ConsultasDAO;
import Models.Usuario;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;


@ManagedBean(name = "bkn_inicio")
public class inicioController implements Serializable  {

    
    private String usuario;
    private String contraseña;
    private int rptLogin;
    private List<Usuario> listaUsuarios;

    @PostConstruct
    public void init() {
        // Puedes inicializar algún dato aquí si es necesario
        System.out.println("");
        try{
            validarUsuario();
        }catch(Exception e){
            System.out.println("Error en el inicio");
        }
        
    }
    
    public void validarUsuario() throws Exception{
        
        ConsultasDAO consulta = new ConsultasDAO();
        
        try{
          
        } catch(Exception e){
            
        }
        
        System.out.println("Respuesta es: "+rptLogin);
        
    }

    
    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
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
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.ConsultasDAO;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;


@ManagedBean(name = "bkn_inicio")
public class inicioController implements Serializable  {
    
    private List<inicioController> listaUsuarios;

    @PostConstruct
    public void init() {
        // Puedes inicializar algún dato aquí si es necesario
        listarUsuarios();
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
    
        /**
     * @return the listaUsuarios
     */
    public List<inicioController> getListaUsuarios() {
        return listaUsuarios;
    }

    /**
     * @param listaUsuarios the listaUsuarios to set
     */
    public void setListaUsuarios(List<inicioController> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

}

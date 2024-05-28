/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.io.IOException;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.inject.Named;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

/**
 *
 * @author CompuFire
 */
@Named("bkn_direccionamiento")

public class Direccionamiento implements Serializable{
    
    public void inicioAdmin() {
        
        ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
        try {
            externalContext.redirect("http://localhost:8089/CondominioGT/pages/inicio/bienvenidaAdmin.xhtml"); // Reemplaza esta URL con la que desees abrir.
        } catch (IOException ex) {
            Logger.getLogger( Direccionamiento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void inicioManto() {
        
        ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
        try {
            externalContext.redirect("http://localhost:8089/CondominioGT/pages/inicio/bienvenidaManto.xhtml"); // Reemplaza esta URL con la que desees abrir.
        } catch (IOException ex) {
            Logger.getLogger( Direccionamiento.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
    
    public void inicioCliente() {
        
        ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
        try {
            externalContext.redirect("http://localhost:8075/CondominioGT/pages/inicio/bienvenidaCliente.xhtml"); // Reemplaza esta URL con la que desees abrir.
        } catch (IOException ex) {
            Logger.getLogger( Direccionamiento.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
}

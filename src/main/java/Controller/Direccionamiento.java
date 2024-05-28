/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.io.IOException;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.inject.Named;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

/**
 *
 * @author CompuFire actionListener="#{bkn_direccion.inicioAdmin}"
 */

@ManagedBean(name = "bkn_direccion")
public class Direccionamiento implements Serializable {


         public void inicioLogin() {

        ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
        try {
            externalContext.redirect("http://localhost:8089/CondominioGT/pages/inicio/Login.xhtml"); // Reemplaza esta URL con la que desees abrir.
        } catch (IOException ex) {
            Logger.getLogger(Direccionamiento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
         
    public void inicioAdmin() {

        ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
        try {
            externalContext.redirect("http://localhost:8089/CondominioGT/pages/inicio/bienvenidaAdmin.xhtml"); // Reemplaza esta URL con la que desees abrir.
        } catch (IOException ex) {
            Logger.getLogger(Direccionamiento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

    public void inicioManto() {

        ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
        try {
            externalContext.redirect("http://localhost:8089/CondominioGT/pages/inicio/bienvenidaManto.xhtml");
            System.out.println("direccionando a pasarela pagos");
        } catch (IOException ex) {
            Logger.getLogger(Direccionamiento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void inicioCliente() {

        ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
        try {


            externalContext.redirect("http://localhost:8089/CondominioGT/pages/inicio/bienvenidaCliente.xhtml"); // Reemplaza esta URL con la que desees abrir.

        } catch (IOException ex) {
            Logger.getLogger(Direccionamiento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void pasarelaPagos() {

        ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
        try {
            externalContext.redirect("http://localhost:8089/CondominioGT/pages/inicio/pasarelapagos.xhtml"); // Reemplaza esta URL con la que desees abrir.
        } catch (IOException ex) {
            Logger.getLogger(Direccionamiento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void controlReportes() {

        ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
        try {
            externalContext.redirect("http://localhost:8089/CondominioGT/pages/inicio/ControlReportes.xhtml"); // Reemplaza esta URL con la que desees abrir.
        } catch (IOException ex) {
            Logger.getLogger(Direccionamiento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void controlPropiedades() {

        ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
        try {
            externalContext.redirect("http://localhost:8089/CondominioGT/pages/inicio/ControlPropiedades.xhtml"); // Reemplaza esta URL con la que desees abrir.
        } catch (IOException ex) {
            Logger.getLogger(Direccionamiento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void estadoCuenta() {

        ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
        try {
            externalContext.redirect("http://localhost:8089/CondominioGT/pages/inicio/ControlPropiedades.xhtml"); // Reemplaza esta URL con la que desees abrir.
        } catch (IOException ex) {
            Logger.getLogger(Direccionamiento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void controlPagos() {

        ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
        try {
            externalContext.redirect("http://localhost:8089/CondominioGT/pages/inicio/ControlDePagos.xhtml"); // Reemplaza esta URL con la que desees abrir.
        } catch (IOException ex) {
            Logger.getLogger(Direccionamiento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void propiedades() {

        ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
        try {
            externalContext.redirect("http://localhost:8089/CondominioGT/pages/inicio/Propiedades.xhtml"); // Reemplaza esta URL con la que desees abrir.
        } catch (IOException ex) {
            Logger.getLogger(Direccionamiento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void controlUsuarios() {

        ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
        try {
            externalContext.redirect("http://localhost:8089/CondominioGT/pages/inicio/Usuario.xhtml"); // Reemplaza esta URL con la que desees abrir.
        } catch (IOException ex) {
            Logger.getLogger(Direccionamiento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void reportesManto() {

        ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
        try {
            externalContext.redirect("http://localhost:8089/CondominioGT/pages/inicio/ReportesManto.xhtml"); // Reemplaza esta URL con la que desees abrir.
        } catch (IOException ex) {
            Logger.getLogger(Direccionamiento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}

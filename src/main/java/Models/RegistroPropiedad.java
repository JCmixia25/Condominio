/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.io.Serializable;

/**
 *
 * @author CompuFire
 */
public class RegistroPropiedad implements Serializable {

    private Long id_registro;
    private Long persona_id;
    private Long propiedad_id;

    public RegistroPropiedad(Long id_registro, Long persona_id, Long propiedad_id) {
        this.id_registro = id_registro;
        this.persona_id = persona_id;
        this.propiedad_id = propiedad_id;
    }

    public RegistroPropiedad() {
        
    }
    
    

    /**
     * @return the id_registro
     */
    public Long getId_registro() {
        return id_registro;
    }

    /**
     * @param id_registro the id_registro to set
     */
    public void setId_registro(Long id_registro) {
        this.id_registro = id_registro;
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
     * @return the propiedad_id
     */
    public Long getPropiedad_id() {
        return propiedad_id;
    }

    /**
     * @param propiedad_id the propiedad_id to set
     */
    public void setPropiedad_id(Long propiedad_id) {
        this.propiedad_id = propiedad_id;
    }

}

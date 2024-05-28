/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.io.Serializable;
import java.sql.Blob;

/**
 *
 * @author CompuFire
 */
public class Anuncio implements Serializable {

    private Long id_anuncio;
    private Long usuario_id;
    private String descripcion;
    private Blob imagen;
    private String fecha_publicacion;
    private String fecha_vencimiento;

    public Anuncio(Long usuario_id, String descripcion, Blob imagen, String fecha_publicacion, String fecha_vencimiento) {
        this.usuario_id = usuario_id;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.fecha_publicacion = fecha_publicacion;
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public Anuncio() {
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

}

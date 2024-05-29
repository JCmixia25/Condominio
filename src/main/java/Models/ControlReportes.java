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
public class ControlReportes implements Serializable {

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
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estador to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    private Long id_reporte;
    private Long autor_id;
    private Long usuario_asignado_id;
    private String descripcion;
    private String fecha_creacion;
    private String fecha_cierre;
    private String estado;

    public ControlReportes(Long id_reporte, Long autor_id, Long usuario_asignado_id, String descripcion, String fecha_creacion, String fecha_cierre, String estado) {
        this.id_reporte = id_reporte;
        this.autor_id = autor_id;
        this.usuario_asignado_id = usuario_asignado_id;
        this.descripcion = descripcion;
        this.fecha_creacion = fecha_creacion;
        this.fecha_cierre = fecha_cierre;
        this.estado = estado;
    }

    public ControlReportes() {
        
    }
    
}

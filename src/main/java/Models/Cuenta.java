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
public class Cuenta implements Serializable{

    /**
     * @return the id_cuenta
     */
    public Long getId_cuenta() {
        return id_cuenta;
    }

    /**
     * @param id_cuenta the id_cuenta to set
     */
    public void setId_cuenta(Long id_cuenta) {
        this.id_cuenta = id_cuenta;
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
     * @return the estados
     */
    public String getEstados() {
        return estado;
    }

    /**
     * @param estados the estados to set
     */
    public void setEstados(String estado) {
        this.estado = estado;
    }

    /**
     * @return the saldo_pagar
     */
    public String getSaldo_pagar() {
        return saldo_pagar;
    }

    /**
     * @param saldo_pagar the saldo_pagar to set
     */
    public void setSaldo_pagar(String saldo_pagar) {
        this.saldo_pagar = saldo_pagar;
    }

    /**
     * @return the saldo_deudor
     */
    public String getSaldo_deudor() {
        return saldo_deudor;
    }

    /**
     * @param saldo_deudor the saldo_deudor to set
     */
    public void setSaldo_deudor(String saldo_deudor) {
        this.saldo_deudor = saldo_deudor;
    }
    
    private Long id_cuenta;
    private Long usuario_id;
    private String estado;
    private String saldo_pagar;
    private String saldo_deudor;

    public Cuenta(Long usuario_id, String estado, String saldo_pagar, String saldo_deudor) {
        this.usuario_id = usuario_id;
        this.estado = estado;
        this.saldo_pagar = saldo_pagar;
        this.saldo_deudor = saldo_deudor;
    }

    public Cuenta() {
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

/**
 *
 * @author Jh0ny2k2
 */
public class SocioDeporte {
    
    private String idSocio;
    private String nombreSocio;
    private String codigoDeporte;
    private String descripcionDeporte;

    // Constructor
    public SocioDeporte(String idSocio, String nombreSocio, String codigoDeporte, String descripcionDeporte) {
        this.idSocio = idSocio;
        this.nombreSocio = nombreSocio;
        this.codigoDeporte = codigoDeporte;
        this.descripcionDeporte = descripcionDeporte;
    }

    // Getters y Setters
    public String getIdSocio() {
        return idSocio;
    }

    public void setIdSocio(String idSocio) {
        this.idSocio = idSocio;
    }

    public String getNombreSocio() {
        return nombreSocio;
    }

    public void setNombreSocio(String nombreSocio) {
        this.nombreSocio = nombreSocio;
    }

    public String getCodigoDeporte() {
        return codigoDeporte;
    }

    public void setCodigoDeporte(String codigoDeporte) {
        this.codigoDeporte = codigoDeporte;
    }

    public String getDescripcionDeporte() {
        return descripcionDeporte;
    }

    public void setDescripcionDeporte(String descripcionDeporte) {
        this.descripcionDeporte = descripcionDeporte;
    }
    
}

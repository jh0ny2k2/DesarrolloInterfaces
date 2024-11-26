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
    
    private int codigoSocio;
    private int codigoDeporte;
    private int nivel;

    public SocioDeporte(int codigoSocio, int codigoDeporte, int nivel) {
        this.codigoSocio = codigoSocio;
        this.codigoDeporte = codigoDeporte;
        this.nivel = nivel;
    }

    public int getCodigoSocio() {
        return codigoSocio;
    }

    public void setCodigoSocio(int codigoSocio) {
        this.codigoSocio = codigoSocio;
    }

    public int getCodigoDeporte() {
        return codigoDeporte;
    }

    public void setCodigoDeporte(int codigoDeporte) {
        this.codigoDeporte = codigoDeporte;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    
    
    
}

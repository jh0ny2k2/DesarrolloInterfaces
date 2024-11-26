/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import datos.Deporte;
import datos.Socio;
import datos.SocioDeporte;
import java.util.ArrayList;

/**
 *
 * @author Jh0ny2k2
 */
public class Logica {
    private ArrayList<Socio> socios = new ArrayList<>();
   
    private ArrayList<SocioDeporte> socioDeportes = new ArrayList<>();

    // Métodos para CRUD de socios
    
    // Metodo para Agregar Socio
    public void agregarSocio(Socio socio) { 
        socios.add(socio); 
    }
    
    // Metodo para obtener los socios
    public ArrayList<Socio> obtenerSocios() { 
        return socios; 
    }
    
    // Metodo para eliminar socio
    public void eliminarSocio(int codigo) {
        socios.removeIf(s -> s.getCodigo() == codigo);
        socioDeportes.removeIf(sd -> sd.getCodigoSocio() == codigo);
    }
    
    // Metodo para modificar Socio
    public void modificarSocio(Socio socioModificado) {
        for (Socio socio : socios) {
            if (socio.getCodigo() == socioModificado.getCodigo()) {
                socio.setNombre(socioModificado.getNombre());
                socio.setEdad(socioModificado.getEdad());
                socio.setCuota(socioModificado.getCuota());
                break;
            }
        }
    }
    

    // Métodos para CRUD de deportes
    public void agregarDeporte(Deporte deporte) { deportes.add(deporte); }
    public void eliminarDeporte(int codigo) {
        deportes.removeIf(d -> d.getCodigo() == codigo);
        socioDeportes.removeIf(sd -> sd.getCodigoDeporte() == codigo);
    }
    public ArrayList<Deporte> obtenerDeportes() { return deportes; }

    // Métodos para la relación socio-deporte
    public void inscribirSocioEnDeporte(int codigoSocio, int codigoDeporte, int nivel) {
        socioDeportes.add(new SocioDeporte(codigoSocio, codigoDeporte, nivel));
        actualizarNumDeportes(codigoSocio);
    }
    public void quitarDeporteASocio(int codigoSocio, int codigoDeporte) {
        socioDeportes.removeIf(sd -> sd.getCodigoSocio() == codigoSocio && sd.getCodigoDeporte() == codigoDeporte);
        actualizarNumDeportes(codigoSocio);
    }
    public ArrayList<Deporte> obtenerDeportesDeSocio(int codigoSocio) {
        ArrayList<Deporte> lista = new ArrayList<>();
        for (SocioDeporte sd : socioDeportes) {
            if (sd.getCodigoSocio() == codigoSocio) {
                for (Deporte deporte : deportes) {
                    if (deporte.getCodigo() == sd.getCodigoDeporte()) {
                        lista.add(deporte);
                    }
                }
            }
        }
        return lista;
    }

    private void actualizarNumDeportes(int codigoSocio) {
        long count = socioDeportes.stream()
                .filter(sd -> sd.getCodigoSocio() == codigoSocio)
                .count();
        for (Socio socio : socios) {
            if (socio.getCodigo() == codigoSocio) {
                socio.setNumDeportes((int) count);
                break;
            }
        }
    }
}

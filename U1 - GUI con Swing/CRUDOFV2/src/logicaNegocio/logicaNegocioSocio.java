/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicaNegocio;

import datos.Deporte;
import datos.Socio;
import datos.SocioDeporte;
import java.awt.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 *
 * @author Jhony
 */
public class logicaNegocioSocio {
    private ArrayList<Socio> socios;
    private ArrayList<Deporte> deportes;
    private ArrayList<SocioDeporte> deportesSocios;

    public logicaNegocioSocio() {
        socios = new ArrayList<>();
        deportes = new ArrayList<>();
        deportesSocios = new ArrayList<>();
    }

   
    
    // LOGICA NEGOCIO SOCIO
    public void addSocio(Socio socio) {
        socios.add(socio);
    }

    public void removeSocio(String id) {
        socios.removeIf(socio -> socio.getId().equals(id));
    }

    public void updateSocio(Socio updatedSocio) {
        for (Socio socio : socios) {
            if (socio.getId().equals(updatedSocio.getId())) {
                socio.setNombre(updatedSocio.getNombre());
                socio.setEdad(updatedSocio.getEdad());
                socio.setCuota(updatedSocio.getCuota());
                break;
            }
        }
    }

    public ArrayList<Socio> getSocios() {
        return socios;
    }

    
    // LOGICA NEGOCIO DEPORTE
    public void addDeporte(Deporte deporte) {
        deportes.add(deporte);
    }

    public void removeDeporte(String codigo) {
        deportes.removeIf(deporte -> deporte.getCodigo().equals(codigo));
    }

    public ArrayList<Deporte> getDeportes() {
        return deportes;
    }
    
    
    
    
    
    // LOGICA NEGOCIO SOCIO-DEPORTES
    public void addDeporteASocio(String idSocio, String codigoDeporte) {
        // Busca el socio y el deporte
        Socio socio = socios.stream().filter(s -> s.getId().equals(String.valueOf(idSocio))).findFirst().orElse(null);
        Deporte deporte = deportes.stream().filter(d -> d.getCodigo().equals(String.valueOf(codigoDeporte))).findFirst().orElse(null);

        if (socio != null && deporte != null) {
            deportesSocios.add(new SocioDeporte(idSocio, socio.getNombre(), codigoDeporte, deporte.getDescripcion()));
        } else {
            throw new IllegalArgumentException("Socio o Deporte no encontrados");
        }
    }

    public void removeDeporteDeSocio(String idSocio, String idDeporte) {
        deportesSocios.removeIf(sd -> sd.getIdSocio() == idSocio && sd.getCodigoDeporte() == idDeporte);
    }

    public ArrayList<SocioDeporte> getDeportesDeSocio(String idSocio) {
        return (ArrayList<SocioDeporte>) deportesSocios.stream()
                .filter(sd -> sd.getIdSocio() == idSocio)
                .collect(Collectors.toList());
    }

    public ArrayList<SocioDeporte> getTodosDeportesSocios() {
        return deportesSocios;
    }

}

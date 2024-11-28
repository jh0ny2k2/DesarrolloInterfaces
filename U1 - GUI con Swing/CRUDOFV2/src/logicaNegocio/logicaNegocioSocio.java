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

    public void addDeporte(Deporte deporte) {
        deportes.add(deporte);
    }

    public void removeDeporte(String codigo) {
        deportes.removeIf(deporte -> deporte.getCodigo().equals(codigo));
    }

    public ArrayList<Deporte> getDeportes() {
        return deportes;
    }
}

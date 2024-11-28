/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import datos.Deporte;
import datos.Socio;
import datos.SocioDeporte;
import java.util.ArrayList;

/**
 *
 * @author Jhony
 */
public class LogicaApp {
    
    // ARRAY LIST DE SOCIOS, SOCIOSDEPORTE Y DEPORTES
    public ArrayList<Socio> socios = new ArrayList<>();
    public ArrayList<SocioDeporte> socioDeportes = new ArrayList<>();
    public ArrayList<Deporte> deportes = new ArrayList<>();
    
    
    // Logica de Deportes
    
    public void addDeporte(Deporte d) {
        deportes.add(d);
    }
    
    public ArrayList<Deporte> obtenerDeportes() {
        return deportes;
    }
    
    
    // Logica de Socios
    
    public void addSocio(Socio s) {
        socios.add(s);
    }
    
    public ArrayList<Socio> obtenerSocios() {
        return socios;
    } 
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio6interfaces;

import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author Jhony
 */
public class Registro {
    
    private String deporte;   // Cambiado a minúsculas para consistencia
    private String nivel;     // Cambiado a minúsculas para consistencia
    private String turno;
    private String renovacion; // Cambiado a minúsculas para consistencia
    private Hijo hijo;
    
    private ArrayList<Hijo> hijos;
    
    public Registro() {
        hijos = new ArrayList<>(); // Inicializar la lista de hijos
    }

    // Método para agregar un hijo a la lista
    public void agregarHijo(Hijo hijo) {
        hijos.add(hijo);
    }

    // Getters y setters corregidos
    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getRenovacion() {
        return renovacion;
    }

    public void setRenovacion(String renovacion) {
        this.renovacion = renovacion;
    }

    public Hijo getHijo() {
        return hijo;
    }

    public void setHijo(Hijo hijo) {
        this.hijo = hijo;
    }

    public ArrayList<Hijo> getHijos() {
        return hijos;
    }
    
}

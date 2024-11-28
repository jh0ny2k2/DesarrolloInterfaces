/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

/**
 *
 * @author Jh0ny2k2
 */
public class Socio {
    
    private String id;
    private String nombre;
    private int edad;
    private int cuota;
    private int numDeportes;

    public Socio(String id, String nombre, int edad, int cuota, int numDeportes) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.cuota = cuota;
        this.numDeportes = numDeportes;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCuota() {
        return cuota;
    }

    public void setCuota(int cuota) {
        this.cuota = cuota;
    }

    public int getNumDeportes() {
        return numDeportes;
    }

    public void setNumDeportes(int numDeportes) {
        this.numDeportes = numDeportes;
    }
    
}

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
    
    private int codigo;
    private String nombre;
    private int edad;
    private int cuota;
    private int numDeportes;

    public Socio(int codigo, String nombre, int edad, int cuota) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.edad = edad;
        this.cuota = cuota;
        this.numDeportes = 0;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

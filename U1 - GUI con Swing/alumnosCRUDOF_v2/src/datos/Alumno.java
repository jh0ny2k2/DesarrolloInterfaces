/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

/**
 *
 * @author aguilera
 */
public class Alumno {
    private String codigo;
    private String nombre;
    private int edad;
    private double cuantiaBeca;

    public Alumno(String codigo, String nombre, int edad, double cuantiaBeca) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.edad = edad;
        this.cuantiaBeca = cuantiaBeca;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getCuantiaBeca() {
        return cuantiaBeca;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCuantiaBeca(double cuantiaBeca) {
        this.cuantiaBeca = cuantiaBeca;
    }
    
    
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio6interfaces;
/**
 *
 * @author Jhony
 */
public class Hijo {
    
    private String nombre;
    private String Apellidos;
    private String deporte;
    private String nivel;
    private String fechaNacimiento;

    public Hijo(String nombre, String Apellidos, String deporte, String nivel, String fechaNacimiento) {
        this.nombre = nombre;
        this.Apellidos = Apellidos;
        this.deporte = deporte;
        this.nivel = nivel;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

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

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String [] toArrayString(){
        String[] s = new String[5];
        s[0] = this.nombre;
        s[1] = this.Apellidos;
        s[2] = this.deporte;
        s[3] = this.nivel;
        s[4] = this.fechaNacimiento;
        return s;
    }

    
    

    

    

    
    
    
    
    
}

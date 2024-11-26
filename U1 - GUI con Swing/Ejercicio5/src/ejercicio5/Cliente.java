/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author Jh0ny2k2
 */
public class Cliente {
    
    private String profesion;
    private int hermanos;
    private String edad;
    private String sexo;
    private String deporte;
    private int compras;
    private int verTelevision;
    private int IrCine;
    
    
    public Cliente(String profesion, int hermanos, String edad, String sexo, String deporte, int compras, int verTelevision, int IrCine) {
        this.profesion = profesion;
        this.hermanos = hermanos;
        this.edad = edad;
        this.sexo = sexo;
        this.deporte = deporte;
        this.compras = compras;
        this.verTelevision = verTelevision;
        this.IrCine = IrCine;
    }
    
    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public int getHermanos() {
        return hermanos;
    }

    public void setHermanos(int hermanos) {
        this.hermanos = hermanos;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public int getCompras() {
        return compras;
    }

    public void setCompras(int compras) {
        this.compras = compras;
    }

    public int getVerTelevision() {
        return verTelevision;
    }

    public void setVerTelevision(int verTelevision) {
        this.verTelevision = verTelevision;
    }

    public int getIrCine() {
        return IrCine;
    }

    public void setIrCine(int IrCine) {
        this.IrCine = IrCine;
    }
    
     public String [] toArrayString(){
        String[] s = new String[8];
        s[0] = this.profesion;
        s[1] = String.valueOf(this.hermanos);
        s[2] = this.edad;
        s[3] = this.sexo;
        s[4] = this.deporte;
        s[5] = String.valueOf(this.compras);
        s[6] = String.valueOf(this.verTelevision);
        s[7] = String.valueOf(this.IrCine);
        
        return s;
    }

}

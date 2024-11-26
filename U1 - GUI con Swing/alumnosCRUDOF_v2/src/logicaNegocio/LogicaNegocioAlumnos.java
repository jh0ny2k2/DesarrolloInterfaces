/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicaNegocio;

import datos.Alumno;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author aguilera
 */
public class LogicaNegocioAlumnos {

    private  List<Alumno> listaAlumnos=new ArrayList<>();
    
    public LogicaNegocioAlumnos() {
        this.listaAlumnos=obtenerAlumnos();
    }

    private ArrayList<Alumno>  obtenerAlumnos(){
        ArrayList<Alumno> listaA=new ArrayList<>();
        listaA.add(new Alumno("C01","Pedro",23,3400.25));
        listaA.add(new Alumno("C02","Ana",42,3200));
        listaA.add(new Alumno("C03","Greta",26,890));
        return listaA;
    }
    
    public void setListaAlumnos(List<Alumno> listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    } 

    public  List<Alumno> getListaAlumnos() {
        return listaAlumnos;
    }    
}

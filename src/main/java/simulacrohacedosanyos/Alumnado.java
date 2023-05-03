/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulacrohacedosanyos;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author FX506
 */
public class Alumnado implements Comparable<Alumnado> {
    
    private String nombre;
    private Map<String, String> calificaciones;

    public Alumnado() {
        this.calificaciones = new TreeMap<>();
    }

    public Alumnado(String nombre, Map<String, String> calificaciones) {
        this.nombre = nombre;
        this.calificaciones = calificaciones;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Map<String, String> getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(Map<String, String> calificaciones) {
        this.calificaciones = calificaciones;
    }
    

    @Override
    public String toString() {
        String texto = this.nombre + "\n";
        for (String clave : calificaciones.keySet()) {
            String valor = calificaciones.get(clave);
            texto += ("[" + clave + ": " + valor + "]");
        }
        return texto;
    }

    

    @Override
    public int compareTo(Alumnado o) {
        return this.getNombre().compareToIgnoreCase(o.nombre);
    }

    
    
}

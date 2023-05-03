/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulacrohacedosanyos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author FX506
 */
public class Estadistica {
    
    private List<Integer> calificaciones;

    public Estadistica(List<Integer> calificaciones) {
        this.calificaciones = calificaciones;
    }

    public Estadistica(List<Alumnado> lista, String ini) {
        calificaciones = lista.stream().map(v->stringToInt(v.getCalificaciones().get(ini))).filter(v->v>=0).toList();
    }

    public List<Integer> getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(List<Integer> calificaciones) {
        this.calificaciones = calificaciones;
    }

    @Override
    public String toString() {
        return "Estadistica{" + "calificaciones=" + calificaciones + '}';
    }
    
    private static List<String> listaCalificaciones(String iniciales, List<Alumnado> lista){
        List<String> calificaciones = new ArrayList<>();
        
        calificaciones = lista.stream().map(l->l.getCalificaciones().get(iniciales)).toList();
        
        return calificaciones;
    }
    
    private static int stringToInt(String s){
        try{
            return Integer.parseInt(s);
        }catch(NumberFormatException nfe){
            return -1;
        }
        
    }
    
}

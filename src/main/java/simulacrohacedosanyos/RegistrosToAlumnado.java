/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulacrohacedosanyos;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author FX506
 */
public class RegistrosToAlumnado {

    public static List<Alumnado> registrosAlumnado(List<RegistroJSON> listaJ) {
        List<Alumnado> listaAlumnado = new ArrayList<>();

        for (RegistroJSON r : listaJ) {
            Map<String, String> calificaciones = new TreeMap<>();
            calificaciones.put("OACV", r.getoACV());
            calificaciones.put("EA", r.geteA());
            calificaciones.put("TII", r.gettII());
            calificaciones.put("TC", r.gettC());
            calificaciones.put("ING", r.getiNG());
            calificaciones.put("FOL", r.getfOL());
            calificaciones.put("CEAC", r.getcEAC());
            listaAlumnado.add(new Alumnado(r.getAlumno(), calificaciones));
        }

        return listaAlumnado;
    }

}

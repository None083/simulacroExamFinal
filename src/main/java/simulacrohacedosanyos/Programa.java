/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simulacrohacedosanyos;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 *
 * @author FX506
 */
public class Programa {

    public static void main(String[] args) throws IOException {

        Map<String, String> inicialNombre = LecturaCSV.lecturaFichero("nombresModulos2.csv");
        
        System.out.println("---------LecturaCSV--------------------");
        for (String clave : inicialNombre.keySet()) {
            String valor = inicialNombre.get(clave);
            System.out.println(clave + ", " + valor);
        }
        
        
        System.out.println("---------LecturaJSON--------------------");
        List<RegistroJSON> notas = LecturaJSON.lecturaJson("calificacionesGrupo.json");

        for (RegistroJSON nota : notas) {
            System.out.println(nota);
        }
        
        System.out.println("-------------ConversionJsonToAlumnado------------------------");
        List<Alumnado> listaAlumnado = RegistrosToAlumnado.registrosAlumnado(notas);
        
        for (Alumnado a : listaAlumnado) {
            System.out.println(a);
        }
        
        
        System.out.println("--------------------AlumnadoToTsv--------------------");
        
        AlumnadoToCSV.crearDirectorio("./alumnado");
        
        for (Alumnado a : listaAlumnado) {
            String[] tokens = a.getNombre().split(" ");
            if(tokens[2].equalsIgnoreCase("Delia")){
                AlumnadoToCSV.alumnadoCsv(a, inicialNombre);
            }
        }
        
        System.out.println("--------------------ListaCalificaciones--------------------------");
        
        Estadistica e = new Estadistica(listaAlumnado, "OACV");
        
        for (Integer i : e.getCalificaciones()) {
            System.out.println(i);
        }

    }

}

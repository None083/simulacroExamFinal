/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulacrohacedosanyos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

/**
 *
 * @author FX506
 */
public class AlumnadoToCSV {

    public static void alumnadoCsv(Alumnado a, Map<String, String> map) {
        
        try ( BufferedWriter flujo = new BufferedWriter(new FileWriter("./alumnado/" + a.getNombre().replaceAll(" |,", "") + ".tsv"))) {
            for (String key : map.keySet()) {
                flujo.write(map.get(key) + "\t" + a.getCalificaciones().get(key));
                flujo.newLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
    
    public static void crearDirectorio(String ruta) {
        File directorio = new File(ruta);
        if (!directorio.exists()) {
            if (directorio.mkdirs()) {
                System.out.println("Directorio creado");
            } else {
                System.out.println("Error al crear directorio");
            }
        }
    }

}

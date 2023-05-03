/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulacrohacedosanyos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author FX506
 */
public class LecturaCSV {
    
    public static Map<String, String> lecturaFichero(String id){
        Map<String, String> inicialNombre = new TreeMap<>();
        String linea;
        String[] tokens;

        try ( Scanner datosFichero = new Scanner(new File(id), "ISO-8859-1")) {
            datosFichero.nextLine();
            while (datosFichero.hasNextLine()) {
                linea = datosFichero.nextLine();
                tokens = linea.split(";");
                inicialNombre.put(tokens[0], tokens[1]);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return inicialNombre;
    }
    
}

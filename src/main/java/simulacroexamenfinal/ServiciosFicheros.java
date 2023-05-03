/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulacroexamenfinal;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author FX506
 */
public class ServiciosFicheros {
    
    public static void leerFichero(String id, List<Mano> partida){
        String linea;
        String[] tokens;

        try ( Scanner datosFichero = new Scanner(new File(id), "UTF-8")) {
            datosFichero.nextLine();
            while (datosFichero.hasNextLine()) {
                linea = datosFichero.nextLine();
                tokens = linea.split(";");
                
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
    
}

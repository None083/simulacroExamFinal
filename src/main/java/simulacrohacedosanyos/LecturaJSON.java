/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulacrohacedosanyos;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author FX506
 */
public class LecturaJSON {

    public static List<RegistroJSON> lecturaJson(String id) throws IOException {
        ObjectMapper mapeador = new ObjectMapper();
        mapeador.registerModule(new JavaTimeModule());

        List<RegistroJSON> notas = mapeador.readValue(new File(id),
                mapeador.getTypeFactory().constructCollectionType(ArrayList.class, RegistroJSON.class));

        return notas;
    }

}

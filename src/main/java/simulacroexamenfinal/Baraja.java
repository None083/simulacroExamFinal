/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulacroexamenfinal;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author FX506
 */
public class Baraja {
    
    private List<Carta> baraja = new ArrayList<>();

    public Baraja() {
        
        for (int i = 1; i < 13; i++) {
            baraja.add(new Carta(i, Palo.PICAS));
        }
        for (int i = 1; i < 13; i++) {
            baraja.add(new Carta(i, Palo.CORAZONES));
        }
        for (int i = 1; i < 13; i++) {
            baraja.add(new Carta(i, Palo.DIAMANTES));
        }
        for (int i = 1; i < 13; i++) {
            baraja.add(new Carta(i, Palo.TREVOLES));
        }
//        for (int i = 0; i < Palo.values().length; i++) {
//            for (int j = 1; j < 13; j++) {
//                baraja.add(new Carta(j, Palo.values()[i]));
//            }
//        }
    }

    public List<Carta> getBaraja() {
        return baraja;
    }

    public void setBaraja(List<Carta> baraja) {
        this.baraja = baraja;
    }
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulacroexamenfinal;

/**
 *
 * @author FX506
 */
public class Carta {
    
    private int numero;
    private Palo palo;

    public Carta(int numero, Palo palo) {
        this.numero = numero;
        this.palo = palo;
    }

    public int getNumero() {
        return numero;
    }

    public Palo getPalo() {
        return palo;
    }

    @Override
    public String toString() {
        switch (this.numero) {
            case 10:
                return "J" + " de " + palo + ";";
            case 11:
                return "Q" + " de " + palo + ";";
            case 12:
                return "K" + " de " + palo + ";";
            default:
          
                return numero + " de " + palo + ";";
        }
    }
    
    
    
}

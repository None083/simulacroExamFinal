/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulacrohacedosanyos;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author FX506
 */
public class RegistroJSON {
    
    @JsonProperty("Alumno/a") 
    public String alumno;
    @JsonProperty("OACV") 
    public String oACV;
    @JsonProperty("EA") 
    public String eA;
    @JsonProperty("TII") 
    public String tII;
    @JsonProperty("TC") 
    public String tC;
    @JsonProperty("ING") 
    public String iNG;
    @JsonProperty("FOL") 
    public String fOL;
    @JsonProperty("CEAC") 
    public String cEAC;

    public RegistroJSON() {
    }

    public RegistroJSON(String alumno, String oACV, String eA, String tII, String tC, String iNG, String fOL, String cEAC) {
        this.alumno = alumno;
        this.oACV = oACV;
        this.eA = eA;
        this.tII = tII;
        this.tC = tC;
        this.iNG = iNG;
        this.fOL = fOL;
        this.cEAC = cEAC;
    }

    public String getAlumno() {
        return alumno;
    }

    public void setAlumno(String alumno) {
        this.alumno = alumno;
    }

    public String getoACV() {
        return oACV;
    }

    public void setoACV(String oACV) {
        this.oACV = oACV;
    }

    public String geteA() {
        return eA;
    }

    public void seteA(String eA) {
        this.eA = eA;
    }

    public String gettII() {
        return tII;
    }

    public void settII(String tII) {
        this.tII = tII;
    }

    public String gettC() {
        return tC;
    }

    public void settC(String tC) {
        this.tC = tC;
    }

    public String getiNG() {
        return iNG;
    }

    public void setiNG(String iNG) {
        this.iNG = iNG;
    }

    public String getfOL() {
        return fOL;
    }

    public void setfOL(String fOL) {
        this.fOL = fOL;
    }

    public String getcEAC() {
        return cEAC;
    }

    public void setcEAC(String cEAC) {
        this.cEAC = cEAC;
    }

    @Override
    public String toString() {
        return "RegistroJSON{" + "alumno=" + alumno + ", oACV=" + oACV + ", eA=" + eA + ", tII=" + tII + ", tC=" + tC + ", iNG=" + iNG + ", fOL=" + fOL + ", cEAC=" + cEAC + '}';
    }
    
    
    
}

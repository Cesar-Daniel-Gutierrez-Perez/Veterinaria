/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lg;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author perez
 */
public class Caninos extends Veterinaria{    

    /**
     * @return the nivEn
     */
    public String getNivEn() {
        return nivEn;
    }

    /**
     * @param nivEn the nivEn to set
     */
    public void setNivEn(String nivEn) {
        this.nivEn = nivEn;
    }
    private String nivEn;

    public Caninos(String nombre, String raza, String color, String edad, String nivEn) {
        super(nombre, raza, color, edad);
        this.nivEn = nivEn;
    }    
}
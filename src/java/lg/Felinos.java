/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lg;

import java.util.ArrayList;

/**
 *
 * @author perez
 */
public class Felinos extends Veterinaria{

    /**
     * @return the tox
     */
    public String getTox() {
        return tox;
    }

    /**
     * @param tox the tox to set
     */
    public void setTox(String tox) {
        this.tox = tox;
    }
    private String tox;

    public Felinos(String nombre, String raza, String color, String edad, String tox) {        
        super(nombre, raza, color, edad);
        this.tox = tox;
    }   
}

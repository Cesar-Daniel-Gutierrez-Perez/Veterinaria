/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lg;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author perez
 */
public class IFelinos implements Mascota{
    ArrayList c;
    @Override    
    public ArrayList mas(String a, ArrayList c) {         
        c.add(a);
        this.c = c;
        return c;
    } 
    public ArrayList guar(String a, ArrayList b){
       c=b;
       c.add(a);
       return c;
    }
    public IFelinos() { 
        
    }    
}

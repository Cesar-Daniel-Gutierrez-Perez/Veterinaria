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
public class Datosp extends Caninos{

    /**
     * @return the lp
     */
    public ArrayList getLp() {
        return lp;
    }

    /**
     * @param lp the lp to set
     */
    public void setLp(ArrayList lp) {
        this.lp = lp;
    }

    /**
     * @return the listap
     */
    public String getListap() {
        return listap;
    }

    /**
     * @param listap the listap to set
     */
    public void setListap(String listap) {
        this.listap = listap;
    }
    private ArrayList lp = new ArrayList();
    ArrayList<String> nom = new ArrayList<>();
    ArrayList<String> ra = new ArrayList<>();
    ArrayList<String> co = new ArrayList<>();
    ArrayList<String> ed = new ArrayList<>();
    ArrayList<String> niv = new ArrayList<>();
    public String listap="";    
    public Datosp(String nombre, String raza, String color, String edad, String nivEn, ArrayList lp) {
        super(nombre, raza, color, edad, nivEn);
        this.lp = lp;
        Caninos p = new Caninos(nombre, raza, color, edad, nivEn);
        nom.add(p.getNombre());ra.add(p.getRaza());co.add(p.getColor());ed.add(p.getEdad());niv.add(p.getNivEn());
        for (int i = 0; i < lp.size(); i++) {
            listap = listap +("----//-----//-----//----");
            listap = listap + "\n";
            int enumerador = i+1;
            listap = listap + enumerador+". "+ "Nombre del perro: " + nom.get(i)+"\n" + "Raza del perro: " + ra.get(i) + "\n" + "Color del perro: " + co.get(i) + "\n" + "Edad del perro: " + ed.get(i) + "\n" + "El perro tiene un nivel de entrenamiento nivel " + niv.get(i) + "\n";
            listap = listap +("----//-----//-----//----");
            listap = listap +("\n");
        }
        ICaninos ap = new ICaninos();
        lp = ap.guar(listap, lp);
    } 
}
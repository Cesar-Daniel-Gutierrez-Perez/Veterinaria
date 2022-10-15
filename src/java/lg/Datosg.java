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
public class Datosg extends Felinos{

    /**
     * @return the lg
     */
    public ArrayList getLg() {
        return lg;
    }

    /**
     * @param lg the lg to set
     */
    public void setLg(ArrayList lg) {
        this.lg = lg;
    }

    /**
     * @return the listag
     */
    public String getListag() {
        return listag;
    }

    /**
     * @param listag the listag to set
     */
    public void setListag(String listag) {
        this.listag = listag;
    }
    private ArrayList lg = new ArrayList();
    ArrayList<String> nom = new ArrayList<>();
    ArrayList<String> ra = new ArrayList<>();
    ArrayList<String> co = new ArrayList<>();
    ArrayList<String> ed = new ArrayList<>();
    ArrayList<String> to = new ArrayList<>();    
    public String listag="";
    public Datosg(String nombre, String raza, String color, String edad, String tox, ArrayList lg) {
        super(nombre, raza, color, edad, tox);
        this.lg = lg;
        Felinos g = new Felinos(nombre, raza, color, edad, tox);
        nom.add(g.getNombre());ra.add(g.getRaza());co.add(g.getColor());ed.add(g.getEdad());to.add(g.getTox());
        for (int i = 0; i < lg.size(); i++) {
            listag = listag +("----//-----//-----//----");
            listag = listag + "\n";
            int enumerador = i+1;
            listag = listag + enumerador+". "+ "Nombre del gato: " + nom.get(i)+"\n" + "Raza del gato: " + ra.get(i) + "\n" + "Color del gato: " + co.get(i) + "\n" + "Edad del gato: " + ed.get(i) + "\n" + "El gato " + to.get(i) + " tiene toxoplasmosis \n";
            listag = listag +("----//-----//-----//----");
            listag = listag +("\n");
        }
        IFelinos ag = new IFelinos();
        lg = ag.guar(listag, lg);
    }    
}
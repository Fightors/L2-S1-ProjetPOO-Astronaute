package projet;
import java.lang.Math.*;
import java.util.ArrayList;

public class Univers{
    private Astronaute astronaute;
    private ArrayList<CorpsCeleste> listeCorps;


    /**
     * @param astronaute
     * @param listeCorps
     */
    public Univers(Astronaute astronaute, ArrayList<CorpsCeleste> listeCorps) {
        this.astronaute = astronaute;
        this.listeCorps = listeCorps;
    }

    //fonction qui va retourner un coprs celeste en verifiant si notre astronaute est dans un des rayons du corps celeste.
    public CorpsCeleste intersectionCorpsCeleste(){
        double distance;

        for(CorpsCeleste c : this.listeCorps){
            distance = Math.sqrt(Math.pow(c.getPos().getX() - this.astronaute.getPos().getX(),2) + Math.pow(c.getPos().getY() - this.astronaute.getPos().getY(),2));
            
            if(distance <= c.getDiam()/2){
                return c;
            }
        }  

        return null;
    }

    //affichage tout les corps celeste dans l'univers
    public void affichage(){
        int i = 1;
        for(CorpsCeleste c : this.listeCorps){
            System.out.println("Corps celeste numero: " + i + " ,la temperature: " + c.getTemp() + "°C, avec diametre: " + c.getDiam() + " km, avec gravite: "
                             + c.getGrav() + ", a la position X: " + c.getPos().getX() + ", position Y: " + c.getPos().getY());
            i++;            
        }
    }

    public Astronaute getAstronaute() {
        return astronaute;
    }

    public void setAstronaute(Astronaute astronaute) {
        this.astronaute = astronaute;
    }

    public ArrayList<CorpsCeleste> getListeCorps() {
        return listeCorps;
    }

    public void setListeCorps(ArrayList<CorpsCeleste> listeCorps) {
        this.listeCorps = listeCorps;
    }
}
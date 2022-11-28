package projet;

import java.util.ArrayList;
import java.lang.Math.*;
public class Vaisseau{
    private int puissance;

    public Vaisseau(int puissance) {
        this.puissance = puissance;
    }

    public ArrayList<CorpsCeleste> scanner(Univers u, Astronaute astro, double rad){
        ArrayList<CorpsCeleste> ls = new ArrayList<CorpsCeleste>();
        double distance;

        for(CorpsCeleste c : u.getListeCorps()){
            distance = Math.sqrt(Math.pow(c.getPos().getX() - astro.getPos().getX(),2) + Math.pow(c.getPos().getY() - astro.getPos().getY(),2));
            
            if(distance <= rad){
                ls.add(c);
            }
        }         

        return ls;
    }

    public int getPuissance(){
        return this.puissance;
    }

    public void setPuissance(int puissance) {
        this.puissance = puissance;
    }
}

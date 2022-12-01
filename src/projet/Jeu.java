package projet;

import java.util.ArrayList;

public class Jeu{
    
    public static void main(String[] args){ 
        boolean foundIt = false;
        Vaisseau v1;
        v1 = new Vaisseau(5);
        
        BouteilleO2 bout = new BouteilleO2(1000,900);

        CorpsCeleste p1,p2,p3,c1;

        p1 = new Planete(50,true,4,1,new Position(0,0),80,false);
        p2 = new Planete(60,true,2,1,new Position(5,5),80,false);
        p3 = new Planete(20,true,2,1,new Position(8,-10),80,false);

        ArrayList<CorpsCeleste> lC = new ArrayList<CorpsCeleste>();
        ArrayList<CorpsCeleste> lS;

        lC.add(p3);
        lC.add(p2);
        lC.add(p1);
            
        Astronaute Thomas = new Astronaute(bout,new Position(5,7),v1);

        Univers u = new Univers(Thomas,lC);
        Tour turn = new Tour();
        while(Thomas.getVivant() && !foundIt){
            ArrayList<CorpsCeleste> l_scan = Thomas.getVaisseau().scanner(u, Thomas, 10);
            turn.jouerTour(u,Thomas,foundIt);
        }
    }
    
}

package projet;

import java.util.ArrayList;

public class Jeu{
    public static void main(String[] args){ 
        boolean foundIt = false;
        Astronaute Thomas = new Astronaute();
        Univers universal = new Univers();
        Tour turn = new Tour();
        while(Thomas.estVivant && !foundit){
            asn.vaisseau.scanner(universal, Thomas, 10);
            turn.jouerTour();
        }
    }
}

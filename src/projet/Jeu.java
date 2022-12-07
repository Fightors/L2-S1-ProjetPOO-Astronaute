package projet;

import java.util.ArrayList;

/**
* Classe contenant le main
* La classe ou la partie va s'effectuer
*/
public class Jeu{
    /**
     * Main ou se deroule la partie
     * 
     * @param args Argument du main
     */
    public static void main(String[] args){
        Univers univ = Univers.universTest();
        Tour turn = new Tour();

        
        while(univ.getAstronaute().getVivant()==true && univ.getAstronaute().getTrouvePlanete() == false){
            ArrayList<CorpsCeleste> l_scan = univ.getAstronaute().getVaisseau().scanner(univ, univ.getAstronaute(), 100);
            turn.jouerTour(univ,univ.getAstronaute());
            System.out.println("\n");
        }
    }
    
}

/*
Méthode affichage
    Ouvre la fenêtre en affichant tout

Méthode fermeture
    Ferme la fenêtre

Dans le main
    Ouvre
    On demande
    On ferme
*/

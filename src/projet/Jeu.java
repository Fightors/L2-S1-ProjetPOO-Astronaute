package projet;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.scene.Group;
import java.util.ArrayList;

public class Jeu{
      
    public static void main(String[] args){
        Graph graph = new Graph();

        Vaisseau v1;
        v1 = new Vaisseau(50);
        
        BouteilleO2 bout = new BouteilleO2(100,70);

        CorpsCeleste p1,p2,p3,p4,p5,aste1,eto1;

        p1 = new Tellurique(60,40,1,new Position(100,250),80,false);
        p2 = new Tellurique(50,20,(float)0.7,new Position(400,200),80,true);
        p3 = new Tellurique(20,20,1,new Position(250,-250),80,false);
        p4 = new Gazeuse(0,50,0,new Position(50,-300),2);
        p5 = new Tellurique(-50,50,1,new Position(-300,-100),50,false);
        aste1 = new Asteroide(0,40,1,new Position(450,450),new Position(-20,-20));
        eto1 = new Etoile(500,50,50,new Position(-200,250));

        ArrayList<CorpsCeleste> lC = new ArrayList<CorpsCeleste>();
        ArrayList<CorpsCeleste> lS;

        lC.add(p3);
        lC.add(p2);
        lC.add(p1);
        lC.add(aste1);
        lC.add(eto1);
        lC.add(p4);
        lC.add(p5);

            
        Astronaute Thomas = new Astronaute(bout,new Position(0,0),v1);
        
        Univers u = new Univers(Thomas,lC);
        Tour turn = new Tour();

        
        while(Thomas.getVivant()==true && Thomas.getTrouvePlanete() == false){
            ArrayList<CorpsCeleste> l_scan = Thomas.getVaisseau().scanner(u, Thomas, 100);
            turn.jouerTour(u,Thomas);
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

package projet;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;




public class Graph {
    @Override 
    public void start(Stage stage){
        Univers univ = Univers.universTest();
        Group root = new Group();
        Scene s = new Scene(root, 1000, 1000, Color.BLACK);
        Canvas canvas = this.draw(univ);

        root.getChildren().add(canvas);
        stage.setTitle("Captain Planet");
        stage.setScene(s);
        stage.show(); // Fonctionne jusqu'ici, bug de la fenre après quand elle s'execute en même temps qu'une demande du terminal
        /*
        while(univ.getAstronaute().getVivant()==true && univ.getAstronaute().getTrouvePlanete() == false){
            ArrayList<CorpsCeleste> l_scan = univ.getAstronaute().getVaisseau().scanner(univ, univ.getAstronaute(), 100);
            this.jouerTour(univ,univ.getAstronaute());
            System.out.println("\n");
        }
        */
    }

    public Canvas draw(Univers u){
        Canvas canvas = new Canvas(1000,1000);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setFill(Color.WHITE);
        gc.fillOval(u.getAstronaute().getPos().getX(),u.getAstronaute().getPos().getY(),10,10);
        gc.setFill(Color.RED);
        for(CorpsCeleste c : u.getListeCorps()){
            gc.fillOval(c.getPos().getX(),c.getPos().getY(),c.getDiam()/2,c.getDiam()/2);  
        }
        return canvas;
    }

    public void jouerTour(Univers univ, Astronaute asn){
        univ.moveAste();
        System.out.println("Position de l'astronaute:" );
        asn.getPos().affichagePos();
        asn.seDeplacer();
        asn.reducO2();
        if(asn.getBouteilleO2().getO2actuel()<=0){
            System.out.println("Vous êtes mort car votre bouteille d'oxygène est vide !");
            asn.setEstVivant(false);
        }
        else{
            CorpsCeleste corps = univ.intersectionCorpsCeleste();
            if(corps!=null){
                if(corps.estDangereux() == true){
                    asn.setEstVivant(false);
                }
                else{
                    if(corps.estVivable()==false){
                        System.out.println("Cette planète n'est pas vivable, vous avez néanmoins rechargé votre bouteille d'oxygène !");
                        asn.getBouteilleO2().setO2actuel(asn.getBouteilleO2().getcapaO2Max());
                    }
                    else{
                        asn.setTrouvePlanete(true);
                        System.out.println("Bravo ! Vous avez trouvé une planète vivable en X tour(s), il est temps de commencer votre nouvelle vie !");
                        System.out.println("Le corps céleste vivable que vous avez trouvé est :");
                        corps.afficherCorpsCeleste();
                    }
                }
            }
            else{
                System.out.println("Vous n'avez rencontré aucun corps céleste lors de ce tour !");
            }
        } 
    }

    public void fermetureInterface(Stage stage){
        stage.close();
    }
   
    public static void main(String[] args){
        launch(args);
    } 
}
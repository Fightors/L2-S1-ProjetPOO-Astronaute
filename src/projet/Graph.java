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
import javafx.event.EventHandler;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.KeyCode;


public class Graph extends Application {
    public void start(Stage stage){
        Tour turn = new Tour();
        Univers univ = Univers.universTest();
        Group root = new Group();
        Scene s = new Scene(root, 1000, 1000, Color.BLACK);
        Canvas canvas = new Canvas(1000,1000);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        root.getChildren().add(canvas);
        stage.setTitle("Captain Planet");
        stage.setScene(s);
        stage.show();
        
        
        s.setOnKeyPressed(new EventHandler<KeyEvent>(){
        @Override
            public void handle( KeyEvent event){
                if(event.getCode()==KeyCode.Z || event.getCode()==KeyCode.W){
                    univ.getAstronaute().getVaisseau().scanner(univ, univ.getAstronaute(), 100);
                    turn.jouerTour(univ,univ.getAstronaute());
                    System.out.println("\n");
                    draw(univ, gc);
                    if(univ.getAstronaute().getVivant()==false || univ.getAstronaute().getTrouvePlanete() == true){
                        Platform.exit();
                    }
                }
                else if(event.getCode()==KeyCode.Q || event.getCode()==KeyCode.A){
                    Platform.exit();
                }
            }
        });
    }

    

    public void draw(Univers u, GraphicsContext gc){
        gc.setFill(Color.BLACK);
        gc.fillRect(0,0,1000,1000);
        gc.setFill(Color.WHITE);
        gc.fillOval(u.getAstronaute().getPos().getX(),u.getAstronaute().getPos().getY(),10,10);
        gc.setFill(Color.RED);
        for(CorpsCeleste c : u.getListeCorps()){
            gc.fillOval(c.getPos().getX(),c.getPos().getY(),c.getDiam()/2,c.getDiam()/2);  
        }
    }

    public void fermetureInterface(Stage stage){
        stage.close();
    }
   
    public static void main(String[] args){
        launch(args);
    } 
}
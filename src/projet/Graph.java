package projet;

import javafx.application.Application;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.application.Platform;
import javafx.scene.Scene;

public class Graph extends Application {
    private Univers univ;

    @Override 
    public void start(Stage stage){
        Group root = new Group();
        root.getChildren().add( new Circle(this.univ.getAstronaute().getPos().getX(),this.univ.getAstronaute().getPos().getY(),5, Color.WHITE));
        for(CorpsCeleste c : this.univ.getListeCorps()){
            root.getChildren().add(new Circle( c.getPos().getX(), c.getPos().getY(), c.getDiam()/2, Color.RED));  
        }
        Scene scene = new Scene(root,1000,1000,Color.BLACK);
        stage.setTitle("Captain Planet");
        stage.setScene(scene);
        stage.show();
    }

    public void fermetureInterface(Stage stage){
        stage.close();
    }
    

    public Univers getUnivers(){
        return this.univ;
    }

    public static void main(String[] args){
        launch(args);
    }

}
package projet;

import javafx.application.Application;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.application.Platform;
import javafx.scene.Scene;

public class Graph extends Application {
    
    // Point d'entrée du programme
    public static void main(String[] args) {
        launch(args); // Appel du point d'entrée de l'application JavaFx (voir ci-dessous)
    }
    
    // Point d'entrée de l'application JavaFX
    @Override
    public void start(Stage primaryStage) {
        
         
        

        // Appel d'une méthode permettant une fermeture propre de l'application
        primaryStage.setOnCloseRequest(e -> Platform.exit());
    }
}
package com.example.calculatrice;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.Arrays; // Nécessaire pour manipuler les arguments de la ligne de commande

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Chargement du fichier FXML pour l'interface utilisateur
        Parent root = FXMLLoader.load(getClass().getResource("/com/example/calculatrice/hello-view.fxml"));

        // Configuration du titre de la fenêtre de l'application
        primaryStage.setTitle("Calculatrice");

        // Configuration de la scène principale avec le contenu chargé du FXML
        primaryStage.setScene(new Scene(root));

        // Affichage de la fenêtre principale de l'application
        primaryStage.show();
    }

    public static void main(String[] args) {
        // Vérification et affichage des arguments de la ligne de commande
        if (args.length == 0) {
            System.out.println("No command line arguments were provided.");
        } else {
            System.out.println("Command line arguments: " + Arrays.toString(args));
        }

        // Lancement de l'application JavaFX
        launch(args);
    }
}

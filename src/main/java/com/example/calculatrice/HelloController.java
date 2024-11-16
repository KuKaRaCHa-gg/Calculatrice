package com.example.calculatrice;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.event.ActionEvent;

public class HelloController {

    @FXML
    private Label Affichage; // Étiquette principale pour l'affichage des chiffres et des résultats

    @FXML
    private Label Affichage2; // Utilisé si nécessaire pour un affichage supplémentaire

    // Gestionnaire pour "Help -> About". Ajoutez la logique d'affichage des informations de l'application.
    @FXML
    private void handleAboutAction(ActionEvent event) {
        System.out.println("About Clicked!");
    }

    // Gestionnaires d'événements pour les clics de boutons numériques.
    @FXML
    private void bouton1Click() {
        updateDisplay("1");
    }

    @FXML
    private void bouton2Click() {
        updateDisplay("2");
    }

    // Ajoutez d'autres gestionnaires pour les boutons numériques ici...

    // Gestionnaire pour le bouton "+".
    @FXML
    private void boutonPlusClick() {
        // Ajoutez votre logique pour l'addition ici.
    }

    // Méthode pour mettre à jour l'affichage de la calculatrice.
    private void updateDisplay(String value) {
        String currentText = Affichage.getText();
        if ("0".equals(currentText)) {
            Affichage.setText(value);
        } else {
            Affichage.setText(currentText + value);
        }
    }

    // Méthode pour réinitialiser l'affichage à "0".
    @FXML
    private void boutonClearClick() {
        Affichage.setText("0");
    }

    // Ajoutez des méthodes pour gérer d'autres opérations (+, -, *, /, =) et logique spécifique ici...

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp03_exemple;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import static javafx.scene.paint.Color.*;
import javafx.scene.shape.Circle;

/**
 * FXML Controller class
 *
 * @author toufi
 */
public class JeuController implements Initializable {

    @FXML
    private Circle c1, c2, c3, c4,c5;
    
    @FXML
    private Circle p12;

    @FXML
    private Circle p11;

    @FXML
    private Circle p13;

    @FXML
    private Circle p14;
    
    
    Circle[] pions = new Circle[32];
    Label[] results = new Label[8];
   
    
    Mastermind jeu ;
    int tentative  = 0;
    Alert alert = new Alert(AlertType.CONFIRMATION);
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
         pions[0] = p11; pions[1] = p12; pions[2] = p13; pions[3] = p14;
        

	}


    private Color getColor(String id)
    {
        Color couleur = null;
         switch (id) {

                case "c1":
                    couleur = RED;
                    break;

                case "c2":
                    couleur = YELLOW;
                    break;
        
                case "c3":
                    couleur =BLUE;
                    break;
      
                case "c4":
                     couleur= GREEN;
                    break;
                 case "c5":
                     couleur = ORANGE;
                    break;
                default:
                    break;
            }
            return couleur;
    }
    
        static int i = 0;
        
        @FXML
        void Select(MouseEvent event) {
           
            Circle selected = (Circle)event.getSource();
            String id = selected.getId();

            Color c = getColor(id);
            pions[i].setFill(c);
            i++;
           
            

    }
}

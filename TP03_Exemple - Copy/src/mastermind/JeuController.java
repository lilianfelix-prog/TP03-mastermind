/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mastermind;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import static javafx.scene.paint.Color.*;
import javafx.scene.shape.Circle;


public class JeuController implements Initializable {

    @FXML
    private Circle c1, c2, c3, c4,c5;
    
    
    
    
    @FXML
    private FlowPane flowPaneBoard;

    
    
    
    Label[] results = new Label[8];
    Circle[] pions = new Circle[32];
    
    Mastermind jeu ;
    int tentative  = 0;
    Alert alert = new Alert(AlertType.CONFIRMATION);
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
         for (int j = 0; j < 32; j++){
             pions[j]= new Circle();
             pions[j].setRadius(20);
             pions[j].setCenterX(20*j);
             pions[j].setCenterY(30);
             pions[j].setFill(Color.GREY);
         }
         flowPaneBoard.getChildren().addAll(pions);
         

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
            if(i == 4){
                System.out.println(i);
            }
                
           
            

    }
}

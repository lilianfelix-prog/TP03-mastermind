package mastermind;
import java.util.ArrayList;
import javafx.scene.paint.Color;
import static javafx.scene.paint.Color.BLUE;
import static javafx.scene.paint.Color.GREEN;
import static javafx.scene.paint.Color.ORANGE;
import static javafx.scene.paint.Color.RED;
import static javafx.scene.paint.Color.YELLOW;

/**
 * Classe Serie
 */
public class Serie {
	private ArrayList<Color> couleurs ;

	public ArrayList<Color> getCouleurs() {
		return couleurs;
	}

	/**
	 * Constructeur Série Instancie un ArrayList de couleurs vide
	 */
	public Serie() {
		couleurs = new ArrayList<>();
	}

	/**
	 * Methode qui retourne la couleur à la position donnée dans la série
	 * @param position
	 * @return couleurs.get(position)
	 */
	public Color getCouleur(int position) {
		
		return null;
	}

	/**
	 * Methode ajouterCouleur qui ajoute une couleur ala série
	 *
	 * @param uneCouleur
	 */
	public void ajouterCouleur(Color uneCouleur) {
		
	}

	/**
	 * Methode qui retourne vrai si la série comporte les même couleur et faux si elle ne la comporte
	 * pas.
	 *
	 * @param uneSérie
	 * @return equal
	 */
	public boolean equals(Serie uneSérie) {
		
		return true;
	}

	/**
	 * Methode comparer qui compare la serie noir des blancs
	 *
	 * @param uneSérie
	 * @return
	 */
	public String comparer(Serie uneSérie) {
		
		return "";
	}

	/**
	 * Methode ToString qui renvoit la serie par chaine d'abéviation
	 *
	 * @return chaineAbréviation
	 */
        @Override
	public String toString() {

		return "";
	}
        
       private String getAbréviation(Color color)
       {
           String abr ="";
            if (color.equals(RED)) 
                abr = "R";
            else if (color.equals(BLUE)) {
                abr = "B";
            }
            else if (color.equals(GREEN)) {
                abr = "G";
            }
            else if (color.equals(YELLOW)) {
                abr = "Y";
            }
            else if(color.equals(ORANGE))
                 abr = "O";
            return abr;
               
               
    }
         
}

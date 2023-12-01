package mastermind;

/**
 * Classe Mastermind
 */
public class Mastermind {
	private final Serie solution;
	private int nombresEssais;
        public boolean win = false;
	
	private ArrayList<Color> inputColors new ArrayList<>();

	public ArrayList<Color> getIntputColors() {
		return intputColors;
	}
	public void setInputColors(Color color) {
		inputColors.add(color);
	}

	/**
	 * Constructeur Mastermind qui crée un jeu avec la solution au hasard
	 */
	public Mastermind() {
		
		solution = new Serie();
	}

	public Serie getSolution() {
		return this.solution;
	}

	public int getNombreEssais() {
		return this.nombresEssais;
	}

	/**
	 * Methode Essayer qui compare lordre des couleurs
	 *
	 * @param uneSérie
	 * @return
	 */
	public String essayer(Serie uneSerie) {
		String output = "";
                Color ;
		for(int i = 0; i <= uneSerie.length(); i++){
			if (uneSerie.get(i) == inputColors.get(i)){
				output+= "N";
			}
		for(int j = 0; j <= uneSerie
		}
		return "";
	}

	public boolean isWin() {
		return win;
	}

	/**
	 * Methode ToString qui renvoit tout les essaiTenté
	 * @return essaiTenté
	 */
	public String toString() {
		return "";
	}
}

	




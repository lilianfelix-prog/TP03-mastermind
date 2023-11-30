package mastermind;

/**
 * Classe Mastermind
 */
public class Mastermind {
	private final Serie solution;
	private int nombresEssais;
        public boolean win = false;
	

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
	public String essayer(Serie uneSérie) {
		
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

	




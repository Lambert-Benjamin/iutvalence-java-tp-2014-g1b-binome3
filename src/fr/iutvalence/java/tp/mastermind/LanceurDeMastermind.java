package fr.iutvalence.java.tp.mastermind;
/**
 *Lancement de la partie de Mastermind
 * @author Nicolas et Benjamin
 * 
 */
public class LanceurDeMastermind
{
	/**
	 * Fonction principale de l'application
	 * 
	 */
	public static void main(String[] args)
	{
		/**
		 * Le motif à trouver est généré aléatoirement 
		 */
	System.out.println("creation de la partie");
	Mastermind partieDeMastermind=new Mastermind();
	System.out.println("demarrage de la partie");
		partieDeMastermind.jouer();
	System.out.println("Fin de la partie");
	}
}

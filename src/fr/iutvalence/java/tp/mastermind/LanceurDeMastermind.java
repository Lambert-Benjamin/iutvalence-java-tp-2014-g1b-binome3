package fr.iutvalence.java.tp.mastermind;

/**
 * Lancement de la partie de Mastermind
 * 
 * @author Nicolas et Benjamin
 * 
 */
public class LanceurDeMastermind
{
	// TODO compléter le commentaire
	/**
	 * Fonction principale de l'application
	 * 
	 */
	public static void main(String[] args)
	{
		System.out.println("creation de la partie");
		Mastermind partieDeMastermind = new Mastermind();
		System.out.println("demarrage de la partie");
		partieDeMastermind.jouer();
		System.out.println("Fin de la partie");
	}
}

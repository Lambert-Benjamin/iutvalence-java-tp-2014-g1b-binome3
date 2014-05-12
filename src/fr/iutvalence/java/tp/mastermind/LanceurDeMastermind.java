package fr.iutvalence.java.tp.mastermind;

/**
 * Lancement de la partie de Mastermind
 * 
 * @author Nicolas et Benjamin
 * 
 */
public class LanceurDeMastermind
{
	/**
	 * Fonction principale de l'application
	 * Debut d'une partie de Mastermind
	 * On affiche des messages pour informer l'avancement de la partie
	 * @param args argument
	 */
	public static void main(String[] args)
	{
		System.out.println("Creation de la partie");
		Mastermind partieDeMastermind = new Mastermind(new JoueurAleatoire(), new AffichageConsole());
		System.out.println("Demarrage de la partie");
		partieDeMastermind.jouer();
		System.out.println("Fin de la partie");
	}
}

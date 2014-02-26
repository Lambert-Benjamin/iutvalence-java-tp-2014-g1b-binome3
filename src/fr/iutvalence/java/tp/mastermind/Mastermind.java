package fr.iutvalence.java.tp.mastermind;

// TODO écrire un commentaire plus précis
/**
 * Debut de la partie
 * 
 * @author Nicolas et Benjamin
 */
public class Mastermind
{
	// TODO déplacer le commentaire au bon endroit
	/**
	 * La partie de Mastermind est prete a etre lancer On dispose de plusieurs
	 * pions de 8 couleurs differentes Un motif de 4 pions a trouver est genere
	 * aleatoirement Vous avez 12 essais pour trouver le motif Les jetons rouges
	 * annoncent un pion de bonne couleur bien placé Les jetons blancs annoncent
	 * un pion de bonne couleur mais mal placé On ne met rien quand un pion ne
	 * fait pas partie de la combinaison La partie se finit quand on a trouve le
	 * bon motif ou quand on n'a plus d'essais
	 */

	// TODO corriger la déclaration (ce n'est pas une constante)
	// TODO renommer
	/**
	 * Nombre d'essai maximum
	 */
	public static int LONGUEUR_DEFAULT = 12;

	// TODO corriger la déclaration (ce n'est pas une constante)
	// TODO renommer
	/**
	 * Nombre de pion par essai
	 */
	public static int LARGEUR_DEFAULT = 4;

	// TODO écrire un commentaire 
	public Mastermind()
	{
		Motif motifATrouver = new Motif();

	}

	// TODO écrire un commentaire 
	public void jouer()
	{

		System.out.println("Rentre ton motif de pions");
	}
}

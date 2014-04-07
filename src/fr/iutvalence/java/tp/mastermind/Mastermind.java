package fr.iutvalence.java.tp.mastermind;

// TODO (fait)écrire un commentaire plus précis
/**
 * Debut de la partie
 * La partie de Mastermind est prete a etre lancer On dispose de plusieurs
 * pions de 8 couleurs differentes Un motif de 4 pions a trouver est genere
 * aleatoirement Vous avez 12 essais pour trouver le motif.
 *  Les jetons rouges annoncent un pion de bonne couleur bien placé 
 *  Les jetons blancs annoncent un pion de bonne couleur mais mal place
 *   On ne met rien quand un pion ne fait pas partie de la combinaison 
 *   La partie se finit quand on a trouve le bon motif ou quand on n'a plus d'essais
 * @author Nicolas et Benjamin
 */
public class Mastermind
{
	// TODO (fait) déplacer le commentaire au bon endroit


	// TODO (fait)corriger la déclaration (ce n'est pas une constante)
	// TODO (fait)renommer
	/**
	 * Nombre d'essai maximum
	 */
	public final static int ESSAI_DEFAULT = 12;
	
	// TODO (fait) écrire un commentaire 
	/**
	 * Creation d'un motif aleatoire a trouver de 4 pions de couleurs différentes
	 * 
	 */
	public static Motif motifADeviner;
	/**
	 * Le motif proposer par l'utilisateur
	 */
	public static Motif motifPropose;
	/**
	 * On cree un tableau pour mettre les pions d'un motif
	 */
	public Mastermind()
	{
		motifADeviner = new Motif();		
	}

	// TODO (fait) écrire un commentaire 
	/**
	 * Permet au joueur de proposer un motif à 4 pions 
	 * On le compare avec le motif a trouver
	 */
	public void jouer()
	{
		System.out.println(motifADeviner.toString());
		int essai = 0;
		while((motifPropose != motifADeviner)&&(essai<ESSAI_DEFAULT))
		{
			Motif motifPropose = new Motif();
			System.out.println(motifPropose.toString());
			Motif.comparerMotif(motifPropose);
			essai++;//entre nous c'est complètement faux
		}
		//System.out.println("Rentre ton motif de pions:");
	}	
}

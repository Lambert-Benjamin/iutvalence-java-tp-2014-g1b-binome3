package fr.iutvalence.java.tp.mastermind;


// TODO (fait)écrire un commentaire  plus précis
/**
 * Un motif est compose de 4 pions parmis 8 couleurs differentes
 * 
 * @author Nicolas et Benjamin
 */
public class Motif
{
	/**
	 * Nombre de pion par essai
	 */
	public final static int LARGEUR_DEFAULT = 4;
	
	/**
	 * On cree un tableau pour mettre les pions d'un motif
	 */
	private int[] pions;
	
	// TODO(fait) écrire un commentaire plus précis
	/**
	 * Creer un motif aléatoire
	 */
	public Motif()
	{
		this.pions=new int[LARGEUR_DEFAULT];
		
		for (int ligne = 0 ;ligne < LARGEUR_DEFAULT; ligne++) 
			this.pions[ligne] =  (int) Math.floor((Math.random()*7)+1);
	}
	
}


package fr.iutvalence.java.tp.mastermind;

import java.util.Random;


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
		Random r = new Random();		
		for (int ligne = 0 ;ligne < LARGEUR_DEFAULT; ligne++) 
			this.pions[ligne] = r.nextInt(8);
		
	}
	
}


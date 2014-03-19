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
	 *Le motif a chercher
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
		for (int emplacement = 0 ;emplacement < LARGEUR_DEFAULT; emplacement++) 
			this.pions[emplacement] = r.nextInt(8);
		
	}
	/**
	 * 
	 */
	public Motif testMotif(Motif motifPropose)
	{
		while(this.motifPropose != this.motifATrouver)
		{
			Motif motifPropose = new Motif();
			int compteurBienPlacer = 0;
			int compteurMalPlacer = 0;
			for(int emplacement = 0; emplacement<LARGEUR_DEFAULT;emplacement++)
			{
				if(this.motifPropose[emplacement]==this.motifATrouver[emplacement])
					compteurBienPlacer++;
			}	
		}
	}
}


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
	public Motif motifATrouver;
	/**
	 * Le motif proposer par l'utilisateur
	 */
	public Motif motifPropose;
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
		for (int emplacement = 0 ;emplacement < LARGEUR_DEFAULT; emplacement++) 
			this.pions[emplacement] = r.nextInt(8);
		
	}
	public void testMotif()
	{
			while(motifPropose != motifATrouver)
			{
				Motif motifPropose = new Motif();
				for(int emplacement = 0; emplacement<LARGEUR_DEFAULT;emplacement++)
				{
					if(motifPropose[emplacement]==motifATrouver[emplacement])
						compteurBienPlacer=
				
					
				}	
			}
	}
}


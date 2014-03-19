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
	 * Fonction qui va comparer le motif a trouver et le motif proposer par l'utilisateur
	 *@param Motif motifApropose a verifier
	 *@return (pas défini)
	 */
	public String testMotif(Motif motifAPropose)
	{
		while(this.motifPropose != this.motifATrouver)
		{
			Motif motifPropose = new Motif();
			int compteurBienPlacer = 0;
			int compteurMalPlacer = 0;
			boolean[] mask ;
			for(int emplacement = 0; emplacement<LARGEUR_DEFAULT;emplacement++)
			{
				if(this.motifPropose[emplacement]==this.motifATrouver[emplacement])
					compteurBienPlacer++;
					
			}
			for(int emplacement = 0; emplacement<LARGEUR_DEFAULT;emplacement++)
			{
				for(int indice = 0;indice<LARGEUR_DEFAULT;indice++)
				{
					if()
				}
			}
		}
		
	}
}


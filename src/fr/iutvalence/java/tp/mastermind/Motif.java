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
	 * Le motif a chercher
	 */

	private int[] pions;

	// TODO(fait) écrire un commentaire plus précis
	/**
	 * Creer un motif aléatoire
	 */
	public Motif()
	{
		this.pions = new int[LARGEUR_DEFAULT];
		Random r = new Random();
		for (int emplacement = 0; emplacement < LARGEUR_DEFAULT; emplacement++)
			this.pions[emplacement] = r.nextInt(8);

	}

	/**
	 * Fonction qui va comparer le motif a trouver et le motif proposer par
	 * l'utilisateur
	 * 
	 * @param motif
	 *            motifApropose (a verifier)
	 * @return une chaine qui affiche les pions bien placé et mal placé par rapport
	 * 			au motif à trouver
	 */
	public String testMotif(Motif motif)
	{
		int compteurBienPlacer;
		int compteurMalPlacer;
		while(Mastermind.motifPropose != Mastermind.motifATrouver)
		{
			Motif motifPropose = new Motif();
			compteurBienPlacer = 0;
			compteurMalPlacer = 0;
			boolean[] maskTrouver;
			boolean[] maskPropose;
			for(int emplacement = 0; emplacement<LARGEUR_DEFAULT;emplacement++)
			{
				if(motifPropose[emplacement]==Mastermind.motifATrouver[emplacement])
					compteurBienPlacer++;
					maskPropose[emplacement]=false;
					maskTrouver[emplacement]=false;
					
			}
			for(int emplacement = 0; emplacement<LARGEUR_DEFAULT;emplacement++)
			{
				for(int indice = 0;indice<LARGEUR_DEFAULT;indice++)
				{
					if((maskPropose[indice]!=false)&&(maskTrouver[emplacement]!=false)&&(Mastermind.motifATrouver[emplacement]==motifPropose[indice]))
							compteurMalPlacer++;
							maskPropose[indice]=false;
							maskTrouver[emplacement]=false;
				}
			}
		}
		return "Il y a "+compteurBienPlacer+" pion(s) bien placé et "+compteurMalPlacer+" pion(s) mal placé";
	}
}	

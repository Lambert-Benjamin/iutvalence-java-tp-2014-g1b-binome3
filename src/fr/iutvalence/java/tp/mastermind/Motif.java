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
	 *           Le motif proposer par le joueur 
	 * @param motifAlea 
	 * 			Le motif a trouver par le joueur
	 * @return une chaine qui affiche les pions bien placé et mal placé par rapport
	 * 			au motif à trouver
	 */
	public static String testMotif(Motif motif[],Motif motifAlea[])
	{
		int compteurBienPlacer;
		int compteurMalPlacer;
		compteurBienPlacer = 0;
		compteurMalPlacer = 0;
		boolean[] maskTrouver=new boolean[LARGEUR_DEFAULT];
		boolean[] maskPropose=new boolean[LARGEUR_DEFAULT];
		for(int vrai=0;vrai<LARGEUR_DEFAULT;vrai++)
			{
				maskTrouver[vrai]=true;
				maskPropose[vrai]=true;
			}
			for(int emplacement = 0; emplacement<LARGEUR_DEFAULT;emplacement++)
			{
				if(motif[emplacement]==motifAlea[emplacement])
					compteurBienPlacer++;
					maskPropose[emplacement]=false;
					maskTrouver[emplacement]=false;
					
			}
			for(int emplacement = 0; emplacement<LARGEUR_DEFAULT;emplacement++)
			{
				for(int indice = 0;indice<LARGEUR_DEFAULT;indice++)
				{
					if((maskPropose[indice]!=false)&&(maskTrouver[emplacement]!=false)&&(motifAlea[emplacement]==motif[indice]))
							compteurMalPlacer++;
							maskPropose[indice]=false;
							maskTrouver[emplacement]=false;
				}
			}
	return "Il y a "+compteurBienPlacer+" pion(s) bien placé et "+compteurMalPlacer+" pion(s) mal placé";
	}	
}	

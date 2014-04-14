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
	public final static int NOMBRE_DE_PIONS = 4;
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
		this.pions = new int[NOMBRE_DE_PIONS];
		Random r = new Random();
		for (int emplacement = 0; emplacement < NOMBRE_DE_PIONS; emplacement++)
			this.pions[emplacement] = r.nextInt(8);
	}

	/**
	 * Fonction qui va comparer le motif a trouver et le motif proposer par
	 * l'utilisateur
	 *
	 * @param motifPropose
	 *            Le motif a trouver par le joueur
	 * @return une chaine qui affiche les pions bien placé et mal placé par
	 *         rapport au motif à trouver
	 */
	public static String comparerMotif(Motif motifPropose)
	{
		int nombreDePionsBienPlaces = 0;
		int nombreDePionsMalPlaces = 0;

		boolean[] masqueDuMotifATrouver = new boolean[NOMBRE_DE_PIONS];
		boolean[] masqueDuMotifPropose = new boolean[NOMBRE_DE_PIONS];
		
		for (int numeroDuPion = 0; numeroDuPion < NOMBRE_DE_PIONS; numeroDuPion++)
		{
			masqueDuMotifATrouver[numeroDuPion] = true;
			masqueDuMotifPropose[numeroDuPion] = true;
		}
		
		for (int numeroDuPion = 0; numeroDuPion < NOMBRE_DE_PIONS; numeroDuPion++)
		{
			if (Mastermind.motifADeviner.getPion(numeroDuPion) == motifPropose.getPion(numeroDuPion))
			{
				nombreDePionsBienPlaces++;
				masqueDuMotifPropose[numeroDuPion] = false;
				masqueDuMotifATrouver[numeroDuPion] = false;
			}
			
		}
		
		for (int numeroDuPionDansLeMotifATrouver = 0; numeroDuPionDansLeMotifATrouver < NOMBRE_DE_PIONS; numeroDuPionDansLeMotifATrouver++)
		{
			if (!masqueDuMotifATrouver[numeroDuPionDansLeMotifATrouver]) continue;
			
			for (int numeroDuPionDansLeMotifPropose = 0; numeroDuPionDansLeMotifPropose < NOMBRE_DE_PIONS; numeroDuPionDansLeMotifPropose++)
			{
				if (!masqueDuMotifPropose[numeroDuPionDansLeMotifPropose]) continue;
						
				if (Mastermind.motifADeviner.getPion(numeroDuPionDansLeMotifATrouver) == motifPropose.getPion(numeroDuPionDansLeMotifPropose))
					{
						nombreDePionsMalPlaces++;					
						masqueDuMotifPropose[numeroDuPionDansLeMotifPropose] = false;
						masqueDuMotifATrouver[numeroDuPionDansLeMotifATrouver] = false;
						break;
					}
			}
		}
		return "Il y a " + nombreDePionsBienPlaces + " pion(s) bien placé et " + nombreDePionsMalPlaces
				+ " pion(s) mal placé";
	}
	/**
	 * Méthode qui renvoie le caractère à une position donné d'un motif
	 * @param position
	 * 		l'indice à l'endroit où l'on cherche l'entier
	 * @return l'entier à la position donné du motif
	 */
	public int getPion(int position)
	{
		return this.pions[position];
	}
	/**
	*
	*/
	public String toString()
	{ 
		if(this.pions != null)
		{
		String resultat = "";
		for(int pion : this.pions)
			resultat += pion; 
		return resultat;
		}
		return "";
	}
	/**
	 * méthode qui lit le motif a deviner
	 * @return un tableau d'entier
	 */

}

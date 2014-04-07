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

		boolean[] maskTrouver = new boolean[NOMBRE_DE_PIONS];
		boolean[] maskPropose = new boolean[NOMBRE_DE_PIONS];
		for (int numeroDuPion = 0; numeroDuPion < NOMBRE_DE_PIONS; numeroDuPion++)
		{
			maskTrouver[numeroDuPion] = true;
			maskPropose[numeroDuPion] = true;
		}
		for (int numeroDuPion = 0; numeroDuPion < NOMBRE_DE_PIONS; numeroDuPion++)
		{
			if (Mastermind.motifADeviner.getPion(numeroDuPion) == motifPropose.getPion(numeroDuPion))
				nombreDePionsBienPlaces++;
			maskPropose[numeroDuPion] = false;
			maskTrouver[numeroDuPion] = false;

		}
		for (int emplacement = 0; emplacement < NOMBRE_DE_PIONS; emplacement++)
		{
			for (int indice = 0; indice < NOMBRE_DE_PIONS; indice++)
			{
				if ((maskPropose[indice] != false) && (maskTrouver[emplacement] != false)
						&& (motifPropose.getPion(indice) == Mastermind.motifADeviner.getPion(emplacement)))
					nombreDePionsMalPlaces++;
				maskPropose[indice] = false;
				maskTrouver[emplacement] = false;
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
}

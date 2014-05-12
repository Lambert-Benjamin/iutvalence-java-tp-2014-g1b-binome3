package fr.iutvalence.java.tp.mastermind;

import java.util.Arrays;
import java.util.Random;

/**
 * Représente un motif de matermind, composé de 4 pions parmi un ensemble de couleurs differentes
 * 
 * @author Nicolas et Benjamin
 */
public class Motif
{

	/**
	 * Nombre de pions
	 */
	public final static int NOMBRE_DE_PIONS = 4;
	
	/**
	 * Les pions
	 */
	private Couleur[] pions;

	/**
	 * Creer un motif aléatoire
	 */
	public Motif()
	{
		this.pions = new Couleur[NOMBRE_DE_PIONS];
		Random generateurDeNombresAleatoires = new Random();
		for (int emplacement = 0; emplacement < NOMBRE_DE_PIONS; emplacement++)
			this.pions[emplacement] = Couleur.values()[generateurDeNombresAleatoires.nextInt(Couleur.values().length)];
	}

	/**
	 * Fonction qui va comparer le motif a trouver et le motif proposer par
	 * l'utilisateur
	 *
	 * @param autreMotif
	 *            Le motif a trouver par le joueur
	 * @return une chaine qui affiche les pions bien placé et mal placé par
	 *         rapport au motif à trouver
	 */
	public ResultatComparaisonMotifs comparerMotif(Motif autreMotif)
	{
		int nombreDePionsBienPlaces = 0;
		int nombreDePionsMalPlaces = 0;

		boolean[] pionsEncoreATraiterDansLeMotif = new boolean[NOMBRE_DE_PIONS];
		boolean[] pionsEncoreATraiterDansLAutreMotif = new boolean[NOMBRE_DE_PIONS];
		
		for (int numeroDuPion = 0; numeroDuPion < NOMBRE_DE_PIONS; numeroDuPion++)
		{
			pionsEncoreATraiterDansLeMotif[numeroDuPion] = true;
			pionsEncoreATraiterDansLAutreMotif[numeroDuPion] = true;
		}
		
		for (int numeroDuPion = 0; numeroDuPion < NOMBRE_DE_PIONS; numeroDuPion++)
		{
			if (this.pions[numeroDuPion] == autreMotif.pions[numeroDuPion])
			{
				nombreDePionsBienPlaces++;
				pionsEncoreATraiterDansLAutreMotif[numeroDuPion] = false;
				pionsEncoreATraiterDansLeMotif[numeroDuPion] = false;
			}
			
		}
		
		for (int numeroDuPionDansLeMotifATrouver = 0; numeroDuPionDansLeMotifATrouver < NOMBRE_DE_PIONS; numeroDuPionDansLeMotifATrouver++)
		{
			if (!pionsEncoreATraiterDansLeMotif[numeroDuPionDansLeMotifATrouver]) continue;
			
			for (int numeroDuPionDansLeMotifPropose = 0; numeroDuPionDansLeMotifPropose < NOMBRE_DE_PIONS; numeroDuPionDansLeMotifPropose++)
			{
				if (!pionsEncoreATraiterDansLAutreMotif[numeroDuPionDansLeMotifPropose]) continue;
						
				if (this.pions[numeroDuPionDansLeMotifATrouver] == autreMotif.pions[numeroDuPionDansLeMotifPropose])
					{
						nombreDePionsMalPlaces++;					
						pionsEncoreATraiterDansLAutreMotif[numeroDuPionDansLeMotifPropose] = false;
						pionsEncoreATraiterDansLeMotif[numeroDuPionDansLeMotifATrouver] = false;
						break;
					}
			}
		}
		return new ResultatComparaisonMotifs(nombreDePionsBienPlaces, nombreDePionsMalPlaces);
	}

	@Override
	public String toString()
	{
		return "Motif [pions=" + Arrays.toString(this.pions) + "]";
	}

}

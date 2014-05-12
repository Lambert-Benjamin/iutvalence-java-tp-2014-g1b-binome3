package fr.iutvalence.java.tp.mastermind;

/**
 * Classe permettant de représenter le résultat de la comparaison de 2 motifs de
 * Mastermind.
 * @author sebastienjean
 *
 */
public class ResultatComparaisonMotifs
{
	/**
	 * Nombre de pions bien placés
	 */
	private final int nombreDePionsBienPlaces;

	/**
	 * Nombre de pions mal placés
	 */
	private final int nombreDePionsMalPlaces;

	/**
	 * Création d'un nouveau résultat de combinaison, étant donnés un nombre de pions 
	 * bien placés et un nombre de pions mal placés.
	 * @param nombreDePionsBienPlaces le nombre de pions bien placés
	 * @param nombreDePionsMalPlaces le nombre de pions mal placés
	 */
	public ResultatComparaisonMotifs(int nombreDePionsBienPlaces,
			int nombreDePionsMalPlaces)
	{
		this.nombreDePionsBienPlaces = nombreDePionsBienPlaces;
		this.nombreDePionsMalPlaces = nombreDePionsMalPlaces;
	}

	/**
	 * Obtenir le nombre de pions bien placés
	 * @return le nombre de pions bien placés
	 */
	public int obtenirNombreDePionsBienPlaces()
	{
		return this.nombreDePionsBienPlaces;
	}

	/**
	 * Obtenir le nombre de pions mal placés
	 * @return le nombre de pions mal placés
	 */
	public int obtenirNombreDePionsMalPlaces()
	{
		return this.nombreDePionsMalPlaces;
	}

	@Override
	public String toString()
	{
		return "ResultatComparaisonMotifs [nombreDePionsBienPlaces="
				+ this.nombreDePionsBienPlaces + ", nombreDePionsMalPlaces="
				+ this.nombreDePionsMalPlaces + "]";
	}

}

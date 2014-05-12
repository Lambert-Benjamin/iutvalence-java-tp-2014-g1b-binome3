package fr.iutvalence.java.tp.mastermind;

/**
 * Joueur simulé proposant des motifs aléatoires
 * @author sebastienjean
 *
 */
public class JoueurAleatoire implements Joueur
{

	@Override
	public Motif obtenirMotif()
	{
		return new Motif();
	}

}

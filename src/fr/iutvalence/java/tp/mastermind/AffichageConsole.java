package fr.iutvalence.java.tp.mastermind;

/**
 * Affichage en mode console
 * @author sebastienjean
 *
 */
public class AffichageConsole implements Affichage
{

	@Override
	public void notifierDemandeDeMotif()
	{
		System.out.println("Motif ?");
	}

	@Override
	public void notifierResultatTour(int numeroDuTour, Motif motifPropose,
			ResultatComparaisonMotifs resultat)
	{
		System.out.println("Tour  "+ numeroDuTour);
		System.out.println("Motif proposé : "+ motifPropose);
		System.out.println("Résultat : "+ resultat);
	}

	@Override
	public void afficherVictoire(int numeroDuTour)
	{
		System.out.println("Gagné en "+ numeroDuTour +" tours");
	}

	@Override
	public void afficherDefaite(Motif motifADeviner)
	{
		System.out.println("Perdu, il fallait deviner : "+motifADeviner);

	}

}

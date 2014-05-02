package fr.iutvalence.java.tp.mastermind;

/**
 * Représente une partie de MasterMind
 * 
 * @author Nicolas et Benjamin
 */
public class Mastermind
{

	/**
	 * Nombre d'essais maximum
	 */
	public final static int NOMBRE_D_ESSAIS_MAXIMUM = 12;

	/**
	 * Le motif à deviner
	 */
	private Motif motifADeviner;

	/**
	 * Création d'une nouvelle partie de Mastermind (le motif à deviner est
	 * choisi aléatoirement)
	 */
	public Mastermind()
	{
		this.motifADeviner = new Motif();
	}

	/**
	 * Jouer la partie
	 */
	public void jouer()
	{
		System.out.print("Le motif à trouver:");
		System.out.println(this.motifADeviner);

		for (int essai = 1; essai <= NOMBRE_D_ESSAIS_MAXIMUM; essai++)
		{
			Motif motifPropose = new Motif();
			System.out.println(motifPropose);
			ResultatComparaisonMotifs resultatComparaisonMotifs = this.motifADeviner.comparerMotif(motifPropose); 
			System.out.println(resultatComparaisonMotifs);
			
			if (resultatComparaisonMotifs.obtenirNombreDePionsBienPlaces() == Motif.NOMBRE_DE_PIONS)
			{
				System.out
						.println("Gagne en " + essai + " essai(s)");
				return;
			}
		}
		System.out.println("Perdu");
	}
}

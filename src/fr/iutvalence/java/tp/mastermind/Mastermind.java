package fr.iutvalence.java.tp.mastermind;

import javax.swing.SwingUtilities;

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
	private final Motif motifADeviner;
	
	/**
	 * Le joueur
	 */
	private final Joueur joueur;
	
	/**
	 * L'affichage
	 */
	private final Affichage affichage;
	
	

	/**
	 * Création d'une nouvelle partie de Mastermind (le motif à deviner est
	 * choisi aléatoirement)
	 * @param joueur le joueur
	 * @param affichage l'affichage
	 */
	public Mastermind(Joueur joueur, AfficherFenetre affichage)
	{
		this.motifADeviner = new Motif();
		this.joueur = joueur;
		this.affichage = affichage;
		SwingUtilities.invokeLater((Runnable)affichage);
	}

	/**
	 * Jouer la partie
	 */
	public void jouer()
	{
		for (int numeroDuTour = 1; numeroDuTour <= NOMBRE_D_ESSAIS_MAXIMUM; numeroDuTour++)
		{
			// this.affichage.notifierDemandeDeMotif();
			Motif motifPropose = this.joueur.obtenirMotif();
			ResultatComparaisonMotifs resultatComparaisonMotifs = this.motifADeviner.comparerMotif(motifPropose); 
			this.affichage.notifierResultatTour(numeroDuTour, motifPropose, resultatComparaisonMotifs);
			
			if (resultatComparaisonMotifs.obtenirNombreDePionsBienPlaces() == Motif.NOMBRE_DE_PIONS)
			{
				this.affichage.afficherVictoire(numeroDuTour);
				return;
			}
		}
		this.affichage.afficherDefaite(this.motifADeviner);
	}
}

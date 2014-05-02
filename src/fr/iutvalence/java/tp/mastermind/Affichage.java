package fr.iutvalence.java.tp.mastermind;

/**
 * Interfzce décrivant le comportement attendu d'un affichage de partie de MasterMind
 * @author sebastienjean
 *
 */
public interface Affichage
{
	/**
	 * Afficher une demande de motif
	 */
	public void notifierDemandeDeMotif();
	
	/**
	 * Afficher le résultat d'un tour
	 * @param numeroDuTour le numéro du tour
	 * @param motifPropose le motif proposé
	 * @param resultat le résultat de la comparaison
	 */
	public void notifierResultatTour(int numeroDuTour, Motif motifPropose, ResultatComparaisonMotifs resultat);

	/**
	 * Afficher la victoire
	 * @param numeroDuTour le numéro du tour
	 */
	public void afficherVictoire(int numeroDuTour);

	/**
	 * Afficher la défaite
	 * @param motifADeviner le motif à deviner
	 */
	public void afficherDefaite(Motif motifADeviner);
}

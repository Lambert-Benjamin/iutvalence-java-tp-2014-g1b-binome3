package fr.iutvalence.java.tp.mastermind;

import javax.swing.JFrame;

/**
 * Affiche la fenetre du mastermind 
 * @author rougen
 *
 */
public class AfficherFenetre implements Runnable , Affichage
{
	/**
	 * fenetre principale du mastermind
	 */
	private JFrame fenetre;
	
	
	@Override
	public void run()
	{
		this.fenetre = new JFrame();
		this.fenetre.setSize(300,200);
		this.fenetre.setTitle("Test de Fenetre");
		this.fenetre.setVisible(true);
		
		
	}

	@Override
	public void notifierDemandeDeMotif()
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void notifierResultatTour(int numeroDuTour, Motif motifPropose, ResultatComparaisonMotifs resultat)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afficherVictoire(int numeroDuTour)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afficherDefaite(Motif motifADeviner)
	{
		// TODO Auto-generated method stub
		
	}
}

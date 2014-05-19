package fr.iutvalence.java.tp.mastermind;

import javax.swing.JFrame;

/**
 * Affiche la fenetre du mastermind 
 * @author rougen
 *
 */
public class AfficherFenetre implements Runnable , Affichage
{
	@Override
	public void run()
	{
		JFrame fenetre = new JFrame();
		fenetre.setSize(200,100);
		fenetre.setTitle("Test de Fenetre");
		
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

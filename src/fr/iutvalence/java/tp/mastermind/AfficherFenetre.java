package fr.iutvalence.java.tp.mastermind;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import javax.swing.WindowConstants;

/**
 * Affiche la fenetre du mastermind 
 * @author rougen
 *
 */
public class AfficherFenetre implements Runnable , Affichage , ActionListener
{
	/**
	 * fenetre principale du mastermind
	 */
	private JFrame fenetre;
	/**
	 * L'onglet A Propos du menu
	 */
	private JMenuItem menuItemAPropos;
	
	@Override
	public void run()
	{
		this.fenetre = new JFrame();
		this.fenetre.setSize(300,200);
		this.fenetre.setTitle("Test de Fenetre");

		this.fenetre.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		
		JSplitPane panelSimple = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
		this.fenetre.add(panelSimple);
		
		JMenuBar menuBar = new JMenuBar();
		
		JMenu menu = new JMenu("Menu");
		JMenuItem menuItemNewPartie = new JMenuItem("Nouvelle Partie");
		JMenuItem menuItemAbandonner = new JMenuItem("Abandonner(comme un lâche)");
		this.menuItemAPropos = new JMenuItem("A Propos");
		menu.add(menuItemNewPartie);
		menu.add(menuItemAbandonner);
		menu.add(this.menuItemAPropos);
		menuItemNewPartie.addActionListener(this);
		menuItemAbandonner.addActionListener(this);
		menuBar.add(menu);
		
		JMenu niveau = new JMenu("Niveau");
		JMenuItem menuItem1 = new JMenuItem("Niveau 1");
		JMenuItem menuItem2 = new JMenuItem("Niveau 2");
		niveau.add(menuItem1);
		niveau.add(menuItem2);
		menuItem1.addActionListener(this);
		menuItem2.addActionListener(this);
		menuBar.add(niveau);
	
		
		this.fenetre.setJMenuBar(menuBar);
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

	@Override
	public void actionPerformed(ActionEvent event)
	{
		JMenuItem itemChoisi = (JMenuItem) event.getSource();
		
		if (itemChoisi == this.menuItemAPropos)
		{
				JOptionPane.showMessageDialog(this.fenetre, "Jeu de mastermind creer par Sir Söpalain et Lord Klëënex","A Propos",JOptionPane.INFORMATION_MESSAGE);
				return;
		}


		// TODO Auto-generated method stub
		
	}
}

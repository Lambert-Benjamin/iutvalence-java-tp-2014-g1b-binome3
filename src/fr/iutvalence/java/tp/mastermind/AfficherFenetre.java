package fr.iutvalence.java.tp.mastermind;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
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
	private JMenuItem menuItemAbandonner;
	private JMenuItem menuItemNewPartie;
	
	@Override
	public void run()
	{
		this.fenetre = new JFrame();
		this.fenetre.setSize(500,500);
		this.fenetre.setTitle("Test de Fenetre");

		this.fenetre.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		
		GridLayout setLayout = (new GridLayout(1,4));
		
		
		JSplitPane paneSimple = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
		paneSimple.setVisible(true);
		this.fenetre.add(paneSimple);


		
		paneSimple.setLayout(setLayout);
		paneSimple.add(new JButton("Bouton 1"));
		paneSimple.add(new JButton("Bouton 2"));
		
		JMenuBar menuBar = new JMenuBar();
		
		JMenu menu = new JMenu("Menu");
		this.menuItemNewPartie = new JMenuItem("Nouvelle Partie");
		this.menuItemAbandonner = new JMenuItem("Abandonner(comme un lache)");
		this.menuItemAPropos = new JMenuItem("A Propos");
		menu.add(this.menuItemNewPartie);
		menu.add(this.menuItemAbandonner);
		menu.add(this.menuItemAPropos);
		menuItemNewPartie.addActionListener(this);
		menuItemAbandonner.addActionListener(this);
		menuItemAPropos.addActionListener(this);
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
		if (itemChoisi == this.menuItemAbandonner)
		{
	
		if (JOptionPane.showConfirmDialog(this.fenetre, "Abandonner ?", "Confirmation", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.OK_OPTION)
		this.fenetre.dispose();

		// TODO Auto-generated method stub
		}
		if(itemChoisi == this.menuItemNewPartie)
		{
			if(JOptionPane.showConfirmDialog(this.fenetre, "Nouvelle Partie ?","Confirmation",JOptionPane.OK_CANCEL_OPTION ) == JOptionPane.OK_OPTION);
			{
				JOptionPane.showMessageDialog(this.fenetre, "Non en fait tu dois continue ta partie","Bait",JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}
}

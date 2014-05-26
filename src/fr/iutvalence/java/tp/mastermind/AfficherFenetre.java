package fr.iutvalence.java.tp.mastermind;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
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
	
	/**
	 * 
	 */
	  private JMenuItem menuItemAbandonner;
	/**
	 * 
	 */
	private JMenuItem menuItemNewPartie;
	
	/**
	 * 
	 */
	private JButton boutonVerification;
	
	public JButton bouton1;
	public JButton bouton2;
	public JButton bouton3;
	public JButton bouton4;
	@Override
	public void run()
	{
		this.fenetre = new JFrame();
		this.fenetre.setSize(300,200);
		this.fenetre.setTitle("Test de Fenetre");
		Dimension motifBouton = new Dimension(30,30);
		Dimension taillePanel = new Dimension(100,100);

		this.fenetre.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setSize(taillePanel);
		this.fenetre.add(panel);
		
		JLabel information = new JLabel("Entrez votre motif \n");
		panel.add(information);
		
		JPanel panel2 = new JPanel();
		panel2.setSize(taillePanel);
		panel.add(panel2);
		
		this.bouton1 = new JButton();
		this.bouton1.setPreferredSize(motifBouton);
		this.bouton1.addActionListener(new ClicBouton());
		this.bouton2 = new JButton();
		this.bouton2.setPreferredSize(motifBouton);
		this.bouton2.addActionListener(new ClicBouton());
		this.bouton3 = new JButton();
		this.bouton3.setPreferredSize(motifBouton);
		this.bouton3.addActionListener(new ClicBouton());
		this.bouton4 = new JButton();
		this.bouton4.setPreferredSize(motifBouton);
		this.bouton4.addActionListener(new ClicBouton());
		
		this.boutonVerification = new JButton("confirmer");
		this.boutonVerification.addActionListener(new ConfirmationBouton());
		
		GridLayout setLayout = (new GridLayout(1,4));

		
		this.fenetre.setLayout(setLayout);
		panel2.add(this.bouton1);
		panel2.add(this.bouton2);
		panel2.add(this.bouton3);
		panel2.add(this.bouton4);
		
		JSplitPane verification = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
		verification.setSize(taillePanel);
		panel.add(verification);
		verification.add(this.boutonVerification);
		
		JSplitPane paneSimple = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
		paneSimple.setVisible(true);
		this.fenetre.add(paneSimple);
		

		

		/**
		 * Le menu du jeu
		 */
		JMenuBar menuBar = new JMenuBar();
		
		JMenu menu = new JMenu("Menu");
		this.menuItemNewPartie = new JMenuItem("Nouvelle Partie");
		this.menuItemAbandonner = new JMenuItem("Abandonner(comme un lache)");
		this.menuItemAPropos = new JMenuItem("A Propos");
		menu.add(this.menuItemNewPartie);
		menu.add(this.menuItemAbandonner);
		menu.add(this.menuItemAPropos);
		this.menuItemNewPartie.addActionListener(this);
		this.menuItemAbandonner.addActionListener(this);
		this.menuItemAPropos.addActionListener(this);
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
				JOptionPane.showMessageDialog(this.fenetre, "Non en fait tu dois continuer ta partie","Bait",JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}

}

package fr.iutvalence.java.tp.mastermind;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

/**
 * 
 * @author rougen
 *
 */
public class ClicBouton implements ActionListener
{
	/**
	 * COmpteur de clic pour changer la couleur du motif
	 */
	public int compteur = 0;
	/**
	 * Prend la valeur de la couleur du bouton
	 */
	public Couleur couleurMotif;
	/**
	 * 
	 */
	private final Color[] couleur = {Color.WHITE,Color.RED,Color.BLUE,Color.YELLOW, Color.GREEN,Color.PINK,Color.MAGENTA,Color.ORANGE};
	
	public void actionPerformed(ActionEvent event)
	{

		JButton clic = (JButton)(event.getSource());
		clic.setBackground(this.couleur[this.compteur]);
		clic.setText(""+Couleur.values()[this.compteur]+"");
		this.couleurMotif = Couleur.values()[this.compteur];
		if (this.compteur < 7)
		this.compteur++;
		else this.compteur=0;
		
			 
	}
}

package fr.iutvalence.java.tp.mastermind;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

/**
 * 
 * @author rougen
 *CLasse qui enregistre le motif selectionner par le joueur et le compare avec le motif à trouver
 */

public class ConfirmationBouton implements ActionListener
{
	public Couleur[] confirmationJoueur;
	public void actionPerformed(ActionEvent event)
	{
		JButton confirmer = (JButton)(event.getSource());
		this.confirmationJoueur = new Couleur[];
	}
}

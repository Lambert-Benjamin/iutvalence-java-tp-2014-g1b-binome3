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
	
	public void actionPerformed(ActionEvent event)
	{

		JButton clic = (JButton)(event.getSource());
		 switch(this.compteur)
		 {
		 case 0:
			 default:
			 clic.setBackground(Color.WHITE);
			 this.compteur++;
			 break;
		 case 1:
			 clic.setBackground(Color.RED);
			 this.compteur++;
			 break;
		 case 2:
			 clic.setBackground(Color.BLUE);
			 this.compteur++;
			 break;
		 case 3:
			 clic.setBackground(Color.YELLOW);
			 this.compteur++;
			 break;
		 case 4:
			 clic.setBackground(Color.GREEN);
			 this.compteur++;
			 break;
		 case 5:
			 clic.setBackground(Color.PINK);
			 this.compteur++;
			 break;
		 case 6:
			 clic.setBackground(Color.MAGENTA);
			 this.compteur++;
			 break;
		 case 7:
			 clic.setBackground(Color.ORANGE);
			 this.compteur = 0;
			 break;
			 
		 }

	}
}

package houseInterface_pkg;

import java.awt.Color;
import javax.swing.JFrame;

public class LaFenetre extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = -112335072284276712L;
	// Cr�ation des �l�ments de la fen�tre
	Panneau Pan = new Panneau();
	LaFenetre()
	{
		// Cr�ation de la fen�tre
		this.setTitle("Interface Maison");
		this.setSize(1366,700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Color BackColor = new Color(204,204,204); // (R,G,B)
		this.setBackground(BackColor);
		
		
		this.setContentPane(Pan);
		
		// activation de la fen�tre
		this.setVisible(true);
		
		
	}
	public void finalize()
	{
		this.Pan=null;
	}
	public static void main(String[] args) {
	
	}
}

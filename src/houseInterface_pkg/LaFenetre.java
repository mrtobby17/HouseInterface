package houseInterface_pkg;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import houseInterface_pkg.BoutonsHI;

public class LaFenetre extends JFrame{
	// Cr�ation des �l�ments de la fen�tre
	Panneau Pan = new Panneau();
	LaFenetre()
	{
		// Cr�ation de la fen�tre
		this.setTitle("Interface Maison");
		this.setSize(1366,700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
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

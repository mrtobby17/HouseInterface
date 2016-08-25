package houseInterface_pkg;

import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;

public class BoutonsHI extends JButton implements MouseListener{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = -1029300473512120559L;
	private int FontSize;
	private String Name;
	public boolean isActivated;
	
	
	//Définition des couleurs de boutons
	GradientPaint couleurBouton = new GradientPaint(0,0,Color.GRAY,0,30,Color.BLACK,true);
	//Définition de la police d'écriture
	Font Arial;
	
	
	BoutonsHI(int fontSize)
	{
		this.isActivated=false;
		this.Name = "ACTIVER";	
		this.FontSize = fontSize;
		this.Arial = new Font("Arial",Font.CENTER_BASELINE,this.FontSize);
		this.addMouseListener(this);
	}
	public void finalize()
	{
		this.couleurBouton = null;
		this.Arial = null;
	}
	@Override
	public void paintComponent (Graphics g){
		//this.setSize(this.Xsize, this.Ysize);
		Graphics2D g2d = (Graphics2D)g;
		GradientPaint gp = couleurBouton;
		g2d.setPaint(gp);
		g2d.fillRect(0, 0, this.getWidth(), this.getHeight());
		g2d.setColor(Color.WHITE);
		g2d.setFont(Arial);
		g2d.drawString(this.Name,this.getWidth()/2-(int)(this.Name.length()*this.FontSize*0.6)/2,this.getHeight()/2+5);
	}
	
	// Implementation des actions du bouton
	@Override
	public void mouseClicked(MouseEvent event) {
		
	}
	@Override
	public void mouseEntered(MouseEvent event) {
		
	}
	@Override
	public void mouseExited(MouseEvent event) {
		
	}
	@Override
	public void mousePressed(MouseEvent event) {

	}
	@Override
	public void mouseReleased(MouseEvent event) {		
		toggleButton();
			}
	public void toggleButton()
	{
		if (isActivated)
		{
			this.Name = "DÉSACTIVER";
		}
		else
		{
			this.Name = "ACTIVER";
		}
		
	}
	

}

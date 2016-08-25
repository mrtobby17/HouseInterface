package houseInterface_pkg;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import houseInterface_pkg.BoutonsHI;



public class Panneau extends JPanel implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7694114078961953199L;
	// constantes
	//private static final int XDIM = 100;
	//private static final int YDIM = 50;
	private Color couleurFenetre1;
	private Color couleurFenetre2;
	private Color couleurFenetre3;
	private Color couleurFenetre4;
	private Color couleurFenetre5;
	private Color BackColor = new Color(204,204,204);
	private Color ControlColor = new Color(0,0,102);
	
	// Création des boutons
	//BoutonsHI btn0 = new BoutonsHI(15);
	BoutonsHI btn1 = new BoutonsHI(15);
	BoutonsHI btn2 = new BoutonsHI(15);
	BoutonsHI btn3 = new BoutonsHI(15);
	BoutonsHI btn4 = new BoutonsHI(15);
	BoutonsHI btn5 = new BoutonsHI(15);
	BoutonsHI btn6 = new BoutonsHI(15);
	
	//Grosseur des lignes
	BasicStroke lineWitdth_10 = new BasicStroke(10);
	BasicStroke lineWitdth_5 = new BasicStroke(5);
	//Type de police
	Font Calibri = new Font("Calibri",Font.CENTER_BASELINE,20);
	
	
	
	Panneau()
	{
		//Désactivation du Layout automatique
		this.setLayout(null);
		//Ajout des boutons à l'interface
		//this.add(btn0);
		this.add(btn1);
		this.add(btn2);
		this.add(btn3);
		this.add(btn4);
		this.add(btn5);
		this.add(btn6);
		//Connexion des boutons à l'intercepteur d'action
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);
		btn6.addActionListener(this);
		//initialisation des variables
		this.couleurFenetre1 = Color.BLACK;
		this.couleurFenetre2 = Color.BLACK;
		this.couleurFenetre3 = Color.BLACK;
		this.couleurFenetre4 = Color.BLACK;
		this.couleurFenetre5 = Color.DARK_GRAY;
		//Paramétrage de la couleur d'arrière-plan
		
		
		//Positionnement des boutons
		this.repaint();
	}
	// destruction des objets
	public void finalize()
	{
		//this.btn0 = null;
		this.btn1 = null;
		this.btn2 = null;
		this.btn3 = null;
		this.btn4 = null;
		this.btn5 = null;
		this.btn6 = null;
		this.lineWitdth_10 = null;
		this.lineWitdth_5 = null;
		this.BackColor = null;
	}

	protected void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		int largeur = this.getWidth();
		int hauteur = this.getHeight();
		int XDIM = largeur/10;
		int YDIM = hauteur/20;
		//btn0.setBounds(largeur/2, hauteur/10, 0, 0);
		//Création des images
		int fenetreXDIM = largeur/10;
		int fenetreYDIM = hauteur/3;
		int position = largeur/6;	
		
		g2.setColor(BackColor);
		g2.fillRect(0, 0, XDIM, YDIM);
		
		//Création de la maison
		g2.setColor(Color.BLACK);
		g2.setStroke(lineWitdth_5);
		g2.drawRect(largeur/20, 13*hauteur/35, 16*largeur/20, 13*hauteur/22);
		g2.fillRect(largeur/20-10, hauteur/35, 16*largeur/20+20, 12*hauteur/35);
		
		//Création de la première fenêtre
		g2.setStroke(lineWitdth_10);
		g2.setColor(Color.BLACK);
		g2.drawLine(position-fenetreXDIM/2,hauteur/3+fenetreYDIM/2+fenetreYDIM/3 , position-fenetreXDIM/2+fenetreXDIM, hauteur/3+fenetreYDIM/2+fenetreYDIM/3);
		g2.drawLine(position-fenetreXDIM/2,hauteur/3+fenetreYDIM/2+2*fenetreYDIM/3 , position-fenetreXDIM/2+fenetreXDIM, hauteur/3+fenetreYDIM/2+2*fenetreYDIM/3);
		g2.drawLine(position,hauteur/3+fenetreYDIM/2 , position, hauteur/3+fenetreYDIM+fenetreYDIM/2);
		g2.setColor(couleurFenetre1);
		g2.drawRect(position-fenetreXDIM/2,hauteur/3+fenetreYDIM/2,fenetreXDIM,fenetreYDIM);
		btn1.setBounds(position-XDIM/2, 13*hauteur/15, XDIM, YDIM);
		btn1.setSize(XDIM, YDIM);
		//Création de la 2 fenêtre
		g2.setColor(Color.BLACK);
		g2.drawLine(2*position,hauteur/3+fenetreYDIM/2+fenetreYDIM/3 , 2*position+fenetreXDIM, hauteur/3+fenetreYDIM/2+fenetreYDIM/3);
		g2.drawLine(2*position,hauteur/3+fenetreYDIM/2+2*fenetreYDIM/3 , 2*position+fenetreXDIM, hauteur/3+fenetreYDIM/2+2*fenetreYDIM/3);
		g2.drawLine(2*position+fenetreXDIM/2,hauteur/3+fenetreYDIM/2 ,2*position+fenetreXDIM/2, hauteur/3+fenetreYDIM+fenetreYDIM/2);
		g2.setColor(couleurFenetre2);
		g2.drawRect(2*position,hauteur/3+fenetreYDIM/2,fenetreXDIM,fenetreYDIM);
		btn2.setBounds(2*position+fenetreXDIM/2-XDIM/2, 13*hauteur/15, XDIM, YDIM);
		btn2.setSize(XDIM, YDIM);
		//Création de la 3 fenêtre
		g2.setColor(Color.BLACK);
		g2.drawLine(3*position,hauteur/3+fenetreYDIM/2+fenetreYDIM/3 , 3*position+fenetreXDIM, hauteur/3+fenetreYDIM/2+fenetreYDIM/3);
		g2.drawLine(3*position,hauteur/3+fenetreYDIM/2+2*fenetreYDIM/3 , 3*position+fenetreXDIM, hauteur/3+fenetreYDIM/2+2*fenetreYDIM/3);
		g2.drawLine(3*position+fenetreXDIM/2,hauteur/3+fenetreYDIM/2 ,3*position+fenetreXDIM/2, hauteur/3+fenetreYDIM+fenetreYDIM/2);
		g2.setColor(couleurFenetre3);
		g2.drawRect(3*position,hauteur/3+fenetreYDIM/2,fenetreXDIM,fenetreYDIM);
		btn3.setBounds(3*position+fenetreXDIM/2-XDIM/2, 13*hauteur/15, XDIM, YDIM);
		btn3.setSize(XDIM, YDIM);
		//Création de la 4 fenêtre
		g2.setColor(Color.BLACK);
		g2.drawLine(4*position,hauteur/3+fenetreYDIM/2+fenetreYDIM/3 , 4*position+fenetreXDIM, hauteur/3+fenetreYDIM/2+fenetreYDIM/3);
		g2.drawLine(4*position,hauteur/3+fenetreYDIM/2+2*fenetreYDIM/3 , 4*position+fenetreXDIM, hauteur/3+fenetreYDIM/2+2*fenetreYDIM/3);
		g2.drawLine(4*position+fenetreXDIM/2,hauteur/3+fenetreYDIM/2 ,4*position+fenetreXDIM/2, hauteur/3+fenetreYDIM+fenetreYDIM/2);
		g2.setColor(couleurFenetre4);
		g2.drawRect(4*position,hauteur/3+fenetreYDIM/2,fenetreXDIM,fenetreYDIM);
		btn4.setBounds(4*position+fenetreXDIM/2-XDIM/2, 13*hauteur/15, XDIM, YDIM);
		btn4.setSize(XDIM, YDIM);
		
		// Création de la ligne des lumières du toit
		g2.setStroke(lineWitdth_10);
		g2.setColor(couleurFenetre5);
		g2.drawLine(largeur/20, 10*hauteur/30, 17*largeur/20, 10*hauteur/30);
		btn5.setBounds(largeur/2-XDIM,13*hauteur/32 , XDIM, YDIM);
		btn5.setSize(XDIM, YDIM);
		
		// Création du panneau de contrôle
		g2.setColor(Color.BLACK);
		g2.setStroke(lineWitdth_5);
		g2.drawRect(69*largeur/80, hauteur/35, 21*largeur/160, 33*hauteur/35);
			// Boutons du panneau de contrôle
			g2.setFont(Calibri);
			g2.setColor(ControlColor);
			g2.drawString("ACTIVER TOUT", 141*largeur/160, 5*hauteur/70);
			btn6.setBounds(74*largeur/80-XDIM/2, 3*hauteur/35, XDIM, YDIM);
			btn6.setSize(XDIM, YDIM);
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent evt) {
	Object source = evt.getSource();
	if (source==btn6)
	{
		btn6.isActivated=!btn6.isActivated;
		btn5.isActivated=btn6.isActivated;
		btn4.isActivated=btn6.isActivated;
		btn3.isActivated=btn6.isActivated;
		btn2.isActivated=btn6.isActivated;
		btn1.isActivated=btn6.isActivated;
		btn1.toggleButton();
		btn2.toggleButton();
		btn3.toggleButton();
		btn4.toggleButton();
		btn5.toggleButton();
	}
	if (source==btn1)
	{
		btn1.isActivated=!btn1.isActivated;
	}
	if (source==btn2)
	{
		btn2.isActivated=!btn2.isActivated;
		
	}
	if (source==btn3)
	{
		btn3.isActivated=!btn3.isActivated;
		
	}
	if (source==btn4)
	{
		btn4.isActivated=!btn4.isActivated;
		
	}
	if (source==btn5)
	{
		btn5.isActivated=!btn5.isActivated;

	}
	if (btn1.isActivated)
		this.couleurFenetre1 = Color.GREEN;
	else
		this.couleurFenetre1 = Color.BLACK;
	
	if (btn2.isActivated)
		this.couleurFenetre2 = Color.GREEN;
	else
		this.couleurFenetre2 = Color.BLACK;
	
	if (btn3.isActivated)
		this.couleurFenetre3 = Color.GREEN;
	else
		this.couleurFenetre3 = Color.BLACK;
	
	if (btn4.isActivated)
		this.couleurFenetre4 = Color.GREEN;
	else
		this.couleurFenetre4 = Color.BLACK;
	
	if (btn5.isActivated)
		this.couleurFenetre5 = Color.GREEN;
	else
		this.couleurFenetre5 = Color.DARK_GRAY;
	this.repaint();
	}
}

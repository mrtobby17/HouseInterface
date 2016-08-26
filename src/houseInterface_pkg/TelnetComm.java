package houseInterface_pkg;

import java.awt.BorderLayout;
import java.io.IOException;
import java.io.PrintStream;

import javax.swing.JFrame;
import javax.swing.JLabel;

import org.apache.commons.net.telnet.TelnetClient;

import examples.util.IOUtil;
	

	/***
	 * This is an example of a trivial use of the TelnetClient class.
	 * It connects to the weather server at the University of Michigan,
	 * um-weather.sprl.umich.edu port 3000, and allows the user to interact
	 * with the server via standard input.  You could use this example to
	 * connect to any telnet server, but it is obviously not general purpose
	 * because it reads from standard input a line at a time, making it
	 * inconvenient for use with a remote interactive shell.  The TelnetClient
	 * class used by itself is mostly intended for automating access to telnet
	 * resources rather than interactive use.
	 ***/

	// This class requires the IOUtil support class!
	public final class TelnetComm
	{
		public TelnetClient telnet;
		JFrame connection;
        JLabel label;
		
	    public boolean connectComm()
	    {
	        telnet = new TelnetClient();
	        connection = new JFrame();
	        label = new JLabel(); 
	        try
	        {	
	        	
	        	connection.setSize(300, 200);
	        	connection.setLocationRelativeTo(null);
	        	connection.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        	connection.setAlwaysOnTop(true);
	        	label.setText("Tentative de connection à 192.168.0.103 ... ");
	        	connection.add(label);
	        	connection.setVisible(true);
	            telnet.connect("192.168.0.103", 23);
	        }
	        catch (IOException e)
	        {
	            label.setText("Erreur de connection, module introuvable");
	            return false;
	        }
	        connection.setVisible(false);
	        connection = null;
	        return true;
	    }
	    
	    
	   public void startComm(PrintStream out){
	        IOUtil.readWrite(telnet.getInputStream(), telnet.getOutputStream(),
	                         System.in, out);
	   
	        try
	        {
	        	label.setText("Perte de connection");
	        	connection.setVisible(true);
	            telnet.disconnect();
	        }
	        catch (IOException e)
	        {
	            e.printStackTrace();
	            System.exit(1);
	        }
	        
	        //System.exit(0);
	    }
	   public void finalize()
		{
			telnet = null;
		}
	}




package View;

import javax.swing.JButton;

import Controleur.CalculListener;
import Model.Application;

public class OpButton extends JButton{

	public OpButton(String str,Application app){
		super(str);
		this.setName(str);
		this.addActionListener(new CalculListener(app));
	}
	
}

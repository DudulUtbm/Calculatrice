package Controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import Model.Application;

public class CalculListener implements ActionListener {

	Application app;
	
	public CalculListener(Application app){
		this.app=app;
	}
	
	
	public void actionPerformed(ActionEvent e) {
		
		JButton source=(JButton) e.getSource();
		if(source.getName()=="+"){ 
			app.add();
		}
		else if(source.getName()=="-"){
			app.sub();
		}
		else if(source.getName()=="*"){
			app.mul();
		}
		else if(source.getName()=="/"){
			app.div();
		}
	}
	
	

}

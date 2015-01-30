package Model;

import View.*;
//import Controleur.*;

public class Application {
	
	private Window win;
	private Calcul calc;
	
	
	public Application(){
		
		win = new Window(this);
		calc = new Calcul();
		
	}

	public static void main(String [] args)
	{
	Application app=new Application();
	}

	public void add(){
		calc.add();
	}
	
	public void sub(){
		calc.add();
	}
	
	public void mul(){
		calc.add();
	}
	
	public void div(){
		calc.add();
	}
}


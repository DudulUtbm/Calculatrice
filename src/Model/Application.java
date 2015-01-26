package Model;

import View.*;
//import Controleur.*;

public class Application {
	
	private Window win;
	
	
	public Application(){
		
		win = new Window();
		
	}

	public static void main(String [] args)
	{
	Application app=new Application();
	}

}
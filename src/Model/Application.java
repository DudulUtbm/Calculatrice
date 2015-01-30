package Model;

import View.*;
//import Controleur.*;

public class Application {
	
	private Window win;
	private Calcul calc;
	private String temp;
	
	public Application(){
		
		win = new Window(this);
		calc = new Calcul();
		
	}

	public static void main(String [] args)
	{
	Application app=new Application();
	}

	public void add(){
		win.getOperand().setText("  +  ");
		calc.setNum1(Double.parseDouble(win.getNumber1().getText()));
		calc.setNum2(Double.parseDouble(win.getNumber2().getText()));
		calc.add();
		temp=calc.createString(" + ");
		win.getPrint2().add(new HistoryLabel(temp));
	}
	
	public void sub(){
		win.getOperand().setText("  -  ");
		calc.setNum1(Double.parseDouble(win.getNumber1().getText()));
		calc.setNum2(Double.parseDouble(win.getNumber2().getText()));
		calc.sub();
		temp=calc.createString(" - ");
		win.getPrint2().add(new HistoryLabel(temp));
	}
	
	public void mul(){
		win.getOperand().setText("  *  ");
		calc.setNum1(Double.parseDouble(win.getNumber1().getText()));
		calc.setNum2(Double.parseDouble(win.getNumber2().getText()));
		calc.mul();
		temp=calc.createString(" * ");
		win.getPrint2().add(new HistoryLabel(temp));
	}
	
	public void div(){
		win.getOperand().setText("  /  ");
		calc.setNum1(Double.parseDouble(win.getNumber1().getText()));
		calc.setNum2(Double.parseDouble(win.getNumber2().getText()));
		calc.div();
		temp=calc.createString(" / ");
		win.getPrint2().add(new HistoryLabel(temp));
	}
}


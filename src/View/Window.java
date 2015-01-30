package View;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.text.NumberFormat;
import java.util.Vector;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Model.Application;

public class Window extends JFrame
{
	
	private JFormattedTextField number1;
	private JFormattedTextField number2;
	private JLabel operand ;
	private Box print2;
	
	public Window(Application app)
	{

	    this.setTitle("Calculator");
	    this.setSize(350, 400);
	    this.setLocationRelativeTo(null);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    BorderLayout bl = new BorderLayout();
	    this.setLayout(bl);
	    bl.setHgap(5);
	    bl.setVgap(5);
	    
	    Box print1 = Box.createHorizontalBox();
	    number1 = new JFormattedTextField(NumberFormat.getNumberInstance());
	    number2 = new JFormattedTextField(NumberFormat.getNumberInstance());
	    print1.add(number1);
	    operand = new JLabel("  operand  ");
	    print1.add(operand);
	    print1.add(number2);
	    this.getContentPane().add(print1, BorderLayout.NORTH);
	    
	    JPanel operandChoice = new JPanel();
	    GridLayout gl = new GridLayout(3,3);
	    operandChoice.setLayout(gl);
	    gl.setHgap(5);
	    gl.setVgap(5);
	    operandChoice.add(new OpButton("+",app));
	    operandChoice.add(new OpButton("-",app));
	    operandChoice.add(new OpButton("*",app));
	    operandChoice.add(new OpButton("/",app));
	    operandChoice.add(new OpButton("&",app));
	    operandChoice.add(new OpButton("&",app));
	    operandChoice.add(new OpButton("&",app));
	    operandChoice.add(new OpButton("&",app));
	    operandChoice.add(new OpButton("&",app));
	    this.getContentPane().add(operandChoice,BorderLayout.CENTER);
	    

	    print2 = Box.createVerticalBox();
	    print2.add(new JLabel("History"));
	  
	 /*   for(int i=0;i<10;i++){

		    print2.add(new HistoryLabel("  0                     "));
	    }*/
	    
	    this.getContentPane().add(print2,BorderLayout.EAST);
	    
	    this.setVisible(true);
	    
   
	}


	public Box getPrint2() {
		return print2;
	}


	public void setPrint2(Box print2) {
		this.print2 = print2;
	}


	public JFormattedTextField getNumber1() {
		return number1;
	}

	public void setNumber1(JFormattedTextField number1) {
		this.number1 = number1;
	}

	public JFormattedTextField getNumber2() {
		return number2;
	}

	public void setNumber2(JFormattedTextField number2) {
		this.number2 = number2;
	}

	public JLabel getOperand() {
		return operand;
	}
	
	public void setOperand(JLabel operand) {
		this.operand = operand;
	}


	
	
}


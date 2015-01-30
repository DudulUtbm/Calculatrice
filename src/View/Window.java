package View;
import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Model.Application;

public class Window extends JFrame
{
	
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
	    print1.add(new JTextField(" number1 "));
	    print1.add(new JLabel("  operand  "));
	    print1.add(new JTextField(" number2 "));
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
	    

	    Box print2 = Box.createVerticalBox();
	    print2.add(new HistoryLabel("History"));
	    print2.add(new HistoryLabel("  0                     "));
	    print2.add(new HistoryLabel("  0                     "));
	    print2.add(new HistoryLabel("  0                     "));
	    print2.add(new HistoryLabel("  0                     "));
	    print2.add(new HistoryLabel("  0                     "));
	    print2.add(new HistoryLabel("  0                     "));
	    print2.add(new HistoryLabel("  0                     "));
	    print2.add(new HistoryLabel("  0                     "));
	    print2.add(new HistoryLabel("  0                     "));
	    print2.add(new HistoryLabel("  0                     "));
	    this.getContentPane().add(print2,BorderLayout.EAST);
	    
	    this.setVisible(true);
	    
   
	}
}


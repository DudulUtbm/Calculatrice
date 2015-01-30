package View;

import java.awt.Color;

import javax.swing.JLabel;

public class HistoryLabel extends JLabel {
	
	public HistoryLabel(String str){
		super(str);
		this.setHorizontalAlignment(JLabel.CENTER);
		this.setForeground(Color.blue);
	}

}

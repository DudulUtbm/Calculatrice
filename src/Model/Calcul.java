package Model;

import java.text.DecimalFormat;

public class Calcul {
	
	private double num1;
	private double num2;
	private double result;
	private DecimalFormat df;
	
	public Calcul(){
		num1=num2=result=0;
		df = new DecimalFormat("0.00");
	}
	
	public void add(){
		result = num1 + num2;
	}
	
	public void sub(){
		result = num1 - num2;
	}
	
	public void mul(){
		result = num1 * num2;
	}
	
	public void div(){
		result = num1 / num2;
	}
	
	public String createString(String operand) {
		String temp=Double.toString(num1);
		temp=temp.concat(operand);
		temp=temp.concat(Double.toString(num2));
		temp=temp.concat(" = ");
		temp=temp.concat(df.format(result));
		return temp;
	}

	public double getNum1() {
		return num1;
	}

	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public double getNum2() {
		return num2;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}



	
	
}

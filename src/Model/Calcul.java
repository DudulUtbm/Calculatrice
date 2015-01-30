package Model;

public class Calcul {
	
	private float num1;
	private float num2;
	private float result;
	
	public Calcul(){
		num1=num2=result=0;
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

}

package Ejercicio15;

public class Rational {
	private int numerator;
	private int denominator;
	
	public Rational() {
		this.numerator=0;
		this.denominator=1;
	}
	
	public Rational(int numerator,int denominator) {
		this.numerator=numerator;
		this.denominator=denominator;
	}
	
	public void printRational() {
		System.out.println(this.numerator+ "/" +this.denominator);
	}
	
	public void negate() {
		if(numerator/denominator<0) {
			denominator=Math.abs(denominator);
			numerator=Math.abs(numerator);
		}
		else {
			numerator=-Math.abs(numerator);
			denominator=Math.abs(denominator);
		}
	}
	
	public void invert() {
		int aux;
		aux=numerator;
		numerator=denominator;
		denominator=aux;
	}
	
	public double toDouble() {
		return numerator/denominator;
	}
	
	public static void main(String[] args) {
		Rational ra=new Rational(5,1);
		ra.invert();
		ra.printRational();
	}
}

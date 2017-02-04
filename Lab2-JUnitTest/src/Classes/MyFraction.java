package Classes;

import Interface.MyMath;

public class MyFraction implements MyMath<MyFraction> {

	private int numerator;
	private int denominator;
	private char sign;

	// Default Constructor.
	public MyFraction() {
	}

	// Constructor to initialize the MyFraction.
	public MyFraction(int numerator, int denominator, char sign) {
		this.numerator = numerator;
		this.denominator = denominator;
		this.sign = sign;
	}

	public int getNumerator() {
		return numerator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}

	public char getSign() {
		return sign;
	}

	public void setSign(char sign) {
		this.sign = sign;
	}

	// Code for Addition.
	@Override
	public MyFraction add(MyFraction o) {
		MyFraction fraction = new MyFraction();

		if (this.sign == o.sign) {
			// If signs are equal.
			if (o.denominator == this.denominator) {
				// If denominator is same
				fraction.numerator = this.numerator + o.numerator;
				fraction.denominator = this.denominator;
				fraction.sign = this.sign;
			} else {
				// If the denominators are different.
				fraction.numerator = (this.numerator * o.denominator) + (o.numerator * this.denominator);
				fraction.denominator = this.denominator * o.denominator;
				fraction.sign = this.sign;
			}
		} else {
			// If signs are different.
			if (o.denominator == this.denominator) {
				// If denominator is same.
				fraction.numerator = this.numerator - o.numerator;
				fraction.denominator = this.denominator;
			} else {
				// If the denominators are different.
				fraction.numerator = Math.abs((this.numerator * o.denominator) - (o.numerator * this.denominator));
				fraction.denominator = this.denominator * o.denominator;
			}

			if (((this.numerator * o.denominator) - (o.numerator * this.denominator)) > 0)
				fraction.sign = this.sign;
			else
				fraction.sign = o.sign;
		}

		return fraction;
	}

	// Code for Subtraction.
	@Override
	public MyFraction subtract(MyFraction o) {
		MyFraction fraction = new MyFraction();

		if (this.sign == o.sign) {
			// If signs are equal.
			if (o.denominator == this.denominator) {
				// If denominator is same.
				fraction.numerator = this.numerator - o.numerator;
				fraction.denominator = this.denominator;
				fraction.sign = this.sign;
			} else {
				// If the denominators are different.
				fraction.numerator = (this.numerator * o.denominator) - (o.numerator * this.denominator);
				fraction.denominator = this.denominator * o.denominator;
				fraction.sign = this.sign;
			}
		} else {
			// If signs are different.
			if (o.denominator == this.denominator) {
				// If denominator is same.
				fraction.numerator = this.numerator + o.numerator;
				fraction.denominator = this.denominator;
			} else {
				// If the denominators are different.
				fraction.numerator = Math.abs((this.numerator * o.denominator) + (o.numerator * this.denominator));
				fraction.denominator = this.denominator * o.denominator;
			}

			if (((this.numerator * o.denominator) + (o.numerator * this.denominator)) > 0)
				fraction.sign = this.sign;
			else
				fraction.sign = o.sign;
		}

		return fraction;
	}

	// Code for Division.
	@Override
	public MyFraction divide(MyFraction o) {
		MyFraction fraction = new MyFraction();

		fraction.numerator = this.numerator * o.denominator;
		fraction.denominator = this.denominator * o.numerator;

		// Code to determine the sign.
		if (this.sign == o.sign ) {
			fraction.sign = '+';
		} else {
			fraction.sign = '-';
		}

		return fraction;
	}

	// Code for Multiplication.
	@Override
	public MyFraction multiply(MyFraction o) {
		MyFraction fraction = new MyFraction();

		fraction.numerator = this.numerator * o.numerator;
		fraction.denominator = this.denominator * o.denominator;

		// Code to determine the sign.
		if (this.sign == o.sign ) {
			fraction.sign = '+';
		} else {
			fraction.sign = '-';
		}

		return fraction;
	}

	// Code to print the string.
	public String toString() {
		if (sign == '-')
			return sign + numerator + "/" + denominator;
		else
			return numerator + "/" + denominator;
	}

}

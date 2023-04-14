package JavaProject;

import java.util.Scanner;

public class SSN {
	private char ssn[];
	private String data;
	
	public SSN(String number) {
		try {
			if(number.length()==11) {
				if(
				Character.isDigit(number.charAt(0))
				&&Character.isDigit(number.charAt(1))
				&&Character.isDigit(number.charAt(2))
				&&number.charAt(3)=='-'
				&&Character.isDigit(number.charAt(4))
				&&Character.isDigit(number.charAt(5))
				&&number.charAt(6)=='-'
				&&Character.isDigit(number.charAt(7))
				&&Character.isDigit(number.charAt(8))
				&&Character.isDigit(number.charAt(9))
				&&Character.isDigit(number.charAt(10))
				) {
					this.ssn = number.toCharArray();
					this.data = number;
				}
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public String getData() {
		return this.data;
	}
	
	public void printSSN() {
		System.out.println(this.ssn);
	}
}

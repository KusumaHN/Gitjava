/**
 * 
 */
package Operators;

public enum Country {
	INDIA('I'), JAPAN('J'), AMERICA('A');
	private char name;

	Country(char name) {
		this.name = name;
	}

	public char getName() {
		return name;
	}

}
 
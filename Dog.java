package main;

public class Dog implements Animal{
	String name;
	int numLegs;
	
	Dog(String n, int l){
		name = n;
		numLegs = l;
	}

	@Override
	public int getLegs() {
		return numLegs;
	}
	
	public String toString() {
		return name + "," + numLegs;
	}
}

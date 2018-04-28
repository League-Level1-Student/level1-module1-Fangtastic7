/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */

/* 
 * 1. Watch this smurf cartoon: https://www.youtube.com/watch?v=RqbpzEHuO2g
 * 2. In a Runner class, make a Handy Smurf. Use the methods below to make him eat, and print his name.
 * k
 * 5. Make a Papa Smurf and print his name, hat color and girl or boy.
 * 6. Make a Smurfette and print her name, hat color and girl or boy. 
 */

public class Smurf {

	private  String name;

	Smurf(String name) {
		this.name = name;
	}

	public String getName(String name) {
		return "My name is " + name + " Smurf.";
	}

	public void eat() {
		System.out.println(name + " Smurf is eating Smurfberries.");
	}

	/* Papa Smurf wears a red hat, all the others are white. */
	public String getHatColor(String name) {
		// 3. Fill in this method
		
		
		return "Hat Color: " + name ;
	}

	/* Smurfette is the only female Smurf. */
	public String isGirlOrBoy(String gender) {
		// 4. Fill in this method
		return "Gender: " + gender;
	}
	public static void main(String[] args) {
		Smurf Handy = new Smurf("Handy");
		Handy.eat();
		System.out.println(Handy.getName("Handy"));
		
		Smurf Papa = new Smurf("Papa");
		System.out.println(Papa.getName("Papa"));
		System.out.println(Papa.getHatColor("Blue"));
		System.out.println(Papa.isGirlOrBoy("Boy"));
		
		Smurf Smurfette = new Smurf("Smurfette");
		System.out.println(Smurfette.getName("Smurfette"));
		System.out.println(Smurfette.getHatColor("White"));
		System.out.println(Smurfette.isGirlOrBoy("Girl"));
		
	}
}




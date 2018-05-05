
public class Taco {
	private String Meat;
	private String Sauce;
	
	 String getMeat() {
		 Meat = "Beef";
		return Meat;
	}
	String getSauce() {
		Sauce = "Salsa";
		return Sauce;
	}
	void setMeat(String meat) {
		meat = Meat;
	}
	void setSauce(String sauce) {
		sauce = Sauce;
	}
}

class Person {
	
	
	private String name;
	public Person(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	public String toString(String name, String superpower) {
		return name + " has mad " + superpower + " skills.";
		
	}
}


public class Runner {
	
	
	
	//public void setbobpower( String running) {
		 
	
//	}
//	public void settompower(String flying) {
		
		
	//}
//	public void setfrankpower(String invisibility) {
//		invisibility = "invisibility";
		
	//}
	public static void main(String[] args) {
		Person bob = new Person("Bob");
		System.out.println(bob.toString("Bob", "speed"));
		Person tom = new Person("Tom");
		System.out.println(tom.toString("Tom", "flying"));
		Person frank = new Person("Frank");
		System.out.println(frank.toString("Frank", "invisibility"));
	}
}

package inheritance;

public class testinheritance {

	public static void main(String[] args) {
		
		Father father = new Father();
		father.Athletic();
		father.Height();
		
		Son son = new Son();
		son.Swimming();
		
		GrandChildren grandchild = new GrandChildren();
		grandchild.Musician();
		

	}

}

package week13c;

public class overloading {
	
	public static void sound() {
		System.out.println("Meow");
	}
	
	public static void sound(String name) {
		String cat;
		cat = name;
		System.out.println("Meow "+cat);
		
	}
	public static void main(String[]args) {
		sound();
		sound("hong");
	}
}

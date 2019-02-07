package string;

public class UseString {

	public static void main(String[] args) {
		
		String st = "We are java programmer";
		System.out.println(st.toUpperCase());
		System.out.println(st.toLowerCase());
		
		String x = "airplane";
		System.out.println(x.charAt(2));
		
		String y = "book";
		System.out.println(y.concat("author"));
		
		String t = "library";
		System.out.println(t + "card");
		
		String place = "united";
		place += "states";
		System.out.println(place );
		
		String e = "Exit";
		System.out.println(e.equalsIgnoreCase("Exit"));
		System.out.println(e.equalsIgnoreCase("tixe"));
		
		String number = "01234567";
		System.out.println(number.length());
		
		String num = "oxoxoxox";
		System.out.println(num.replace('x','X'));
		
		String a = "letter";
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		
		String s = "java is a programming language";
		System.out.println(s.contains("Tom"));
		System.out.println(s.contains("java"));
		
		String s1 = "hi";
		System.out.println(s1 + " x");
		System.out.println(s1.trim() + "x");
		
		String str = "java is fun to learn";
		String s2 = "JAVA";
		String s3 = "java";
		String s4 = "Hello java";
		
		System.out.println("char at index 2 (third position ):" + str.charAt(2));
		System.out.println("After concat:" + str.concat("Enjoy"));
		System.out.println("Checking  length: " + str.length());
		System.out.println("Replace function:" + str.replace("fun" , "easy"));
		System.out.println("Converting to lower case:" + str.toLowerCase());
		System.out.println("Converting to upper case :" + str.toUpperCase());
		System.out.println("Triming string:" + s4.trim());
		System.out.println("Searching s2 in str:" + str.contains(s2));
		System.out.println("Searching s3 in str:" + str.contains(s3));
		
		String h = "Students in class";
		System.out.println(h.toUpperCase());
		System.out.println(h.toLowerCase());
		
		
		String n = "Paper work";
		System.out.println(n.toUpperCase());
		System.out.println(n.toLowerCase());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
   
	
	
	
	}
	
	
	
	
	

}

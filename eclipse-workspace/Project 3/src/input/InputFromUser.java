package input;

import java.util.Scanner;

public class InputFromUser {

	public static void main(String[] args) {
		System.out.println("please enter a number:");
		Scanner sc = new Scanner(System.in);
		int input1 = sc.nextInt();
		int input2 = sc.nextInt();
		sc.close();
		int result = input1 +input2;
		System.out.println("total addition of two inputs: " + result );
	
		//Do-while loop and Array	
		
		int i = 0;
		do {
			System.out.println(i);
			i++;
		}
		while(i<5);
		
		String[] cars = {"volvo", " mazda"};
		for(String x : cars) {
			System.out.println(x);
		
		}
		
		String[] cars2 = {"volvo", "mazda", "toyota"};
		for(String x1 : cars2) {
			System.out.println(x1);
		}
	
	}

}

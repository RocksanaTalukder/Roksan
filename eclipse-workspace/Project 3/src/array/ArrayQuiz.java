package array;

import  java.util.Scanner;
public class ArrayQuiz {

	public static void main(String[] args) {
		
		
		System.out.println("Enter some numbers :");
		
		Scanner sc = new Scanner(System.in);
		
		for( int i = 0; i <5; i++);{
		
		 int input1 = sc.nextInt();
		
	     int input2=sc.nextInt();
	     sc.close();
	     int result = input1 +input2;
		System.out.println("addition of two input:" + result);
		}
		
    }

}

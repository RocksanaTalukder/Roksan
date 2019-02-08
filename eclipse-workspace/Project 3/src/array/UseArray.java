package array;

 import java .util.Scanner;

public class UseArray {

	public static void main(String[] args) {
		
		

        System.out.println("please enter some numbers:");
        
        Scanner sc = new Scanner(System.in);
        
        int[] numbers = new int[10];
        
        for( int i = 0; i<5 ; i++) {
        	
        	numbers[i] = sc.nextInt();
        	System.out.println(numbers[2]);
        	
       }
        sc.close();
		
    }

}

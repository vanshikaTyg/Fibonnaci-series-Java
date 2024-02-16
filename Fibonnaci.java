//VANSHIKA TYAGI
//22070126128
//AIML B3

import java.io.*;
import java.util.*;

class Fibonnaci{
	public static void main(String arg[]){
		//Command Line Args
		//int number = Integer.parseInt(arg[0]);
		//parse : Changing the datatype
		
		//Scanner
		/*System.out.println("Enter Number");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		*/
		
		//BufferedReader 
		/*BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.println("Enter number");
			int number = Integer.parseInt(reader.readLine());
			for(int i=0; i<number; i++){
				System.out.println(fibonnaci(i)+" ");
			}
		}
		catch(IOException e){
			System.out.println(e);
		}*/
		
		//System Console
		System.out.println("Enter number");
		int number = Integer.parseInt(System.console().readLine());
		for (int i=0; i<number; i++){
			System.out.println(fibonnaci(i)+" ");
		}
	}
	
	//Function for Fibonnaci series using recursion
	public static int fibonnaci(int n){
		if(n<=1){
			return n;
		}
		else{
			return fibonnaci(n-1) + fibonnaci(n-2);
		}
	}
}
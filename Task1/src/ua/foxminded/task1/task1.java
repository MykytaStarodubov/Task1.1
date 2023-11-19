package ua.foxminded.task1;

import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
		
		Scanner var = new Scanner(System.in);
		String var1 = var.next();
		System.out.println("Original string :" + (var1));
		System.out.println("Reverse string:" + (reverse(var1)));
	}
	public static String reverse(String input){
		
		StringBuilder stringBuildervar = new StringBuilder();
		 stringBuildervar.append(input);
		 stringBuildervar.reverse();
			
			return String.join("", stringBuildervar);
		
	

}
}
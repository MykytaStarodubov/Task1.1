package ua.foxminded.task1;

import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {

		Scanner var = new Scanner(System.in);
		String var1 = var.nextLine();
		System.out.println("Original string :" + (var1));
		System.out.println("Reverse string:" + (split((var1))));
	}

	public static String split(String input) {

		String split1[] = input.split(" ");

		for (int i = 0; i < split1.length; i++) {

			split1[i] = reverse(split1[i]);
		}

		return String.join(" ", split1);

	}

	public static String reverse(String oneword) {

		StringBuilder stringBuildervar = new StringBuilder();
		
		stringBuildervar.append(oneword);
		stringBuildervar.reverse();

		return stringBuildervar.toString();

	}

}
package ua.foxminded.task1;
import java.util.Stack;
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

	public static String reverse(String word) {

		char[] revers = new char[word.length()];
		word.getChars(0, word.length(), revers, 0);

		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < revers.length; i++) {
			if (Character.isDigit(revers[i]))
				continue;
			stack.push(revers[i]);
			revers[i] = '$';
		}
		for (int i = 0; i < revers.length; i++) {
			if (revers[i] == '$')
				revers[i] = stack.pop();
		}

		return new String(revers);

	}

}
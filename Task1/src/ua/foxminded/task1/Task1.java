package ua.foxminded.task1;

import java.util.Stack;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String scannerForInput = scanner.nextLine();
		System.out.println("Original string :" + (scannerForInput));
		System.out.println("Reverse string:" + (splittedWords((scannerForInput))));
	}

	private static final String SPACESEPARATOR = " ";
	private static final char DOLLAR = '$';

	private static String splittedWords(String input) {

		String split1[] = input.split(SPACESEPARATOR);

		for (int i = 0; i < split1.length; i++) {

			split1[i] = enteredWord(split1[i]);
		}

		return String.join(SPACESEPARATOR, split1);

	}

	private static String enteredWord(String word) {

		char[] revers = new char[word.length()];
		word.getChars(0, word.length(), revers, 0);

		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < revers.length; i++) {
			if (Character.isDigit(revers[i]))
				continue;
			stack.push(revers[i]);
			revers[i] = DOLLAR;
		}
		for (int i = 0; i < revers.length; i++) {
			if (revers[i] == DOLLAR)
				revers[i] = stack.pop();
		}

		return new String(revers);

	}

}
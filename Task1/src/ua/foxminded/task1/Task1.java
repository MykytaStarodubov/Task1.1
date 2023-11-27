package ua.foxminded.task1;

import java.util.Stack;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String scannerForInput = scanner.nextLine();
		System.out.println("Original string:" + (scannerForInput));
		System.out.println("Reverse string:" + (splittedWords((scannerForInput))));
	}

	private static final String SPACE_SEPARATOR = " ";
	private static final char DOLLAR = '$';

	public static String splittedWords(String input) {

		if (input == null) {
			throw new IllegalArgumentException("Input cannot be null");
		}
		
		if (input.trim().isEmpty()) {
			return input;
		}
		
		String split[] = input.split(SPACE_SEPARATOR);

		for (int i = 0; i < split.length; i++) {

			split[i] = enteredWord(split[i]);
		}

		return String.join(" ", split);

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
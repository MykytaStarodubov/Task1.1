package ua.foxminded.task1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Task1Test {
	
	@Test
	void Exception_Check_Null() {
		 try {
	            Task1.splittedWords(null);
	        } catch (IllegalArgumentException e) {
	            assertEquals("Input cannot be null", e.getMessage());
	        }
	}
		 
	@Test
	void OnlyLetters_OneWord() {
		assertEquals("olleH", Task1.splittedWords("Hello"));
	}
	@Test
	void EmptyString_Check() {
		assertEquals("", Task1.splittedWords(""));
	}
	@Test
	void SingleSpace_Check_Input() {
		assertEquals(" ", Task1.splittedWords(" "));
	}
	@Test
	void SeveralSpace_Check_Input() {
		assertEquals("   ", Task1.splittedWords("   "));
	}
	@Test
	void SingleCharacter_Check_Input() {
		assertEquals("h", Task1.splittedWords("h"));
	}
	@Test
	void MultipleLetter_CheckLetters_Same() {
		assertEquals("hhh", Task1.splittedWords("hhh"));
	}
	@Test
	void LowerAndUpperCases_CheckTheSameCharacter_MixedInTheInput() {
		assertEquals("hHhHhhH", Task1.splittedWords("HhhHhHh"));
	}
	@Test
	void  WordWithDifferentLetters_Check_DifferentLetters() {
		assertEquals("hHhHhhH", Task1.splittedWords("HhhHhHh"));
	}
	@Test
	void OnlySymbols_Check_OnlySymbols() {
		assertEquals("1!34", Task1.splittedWords("1!34"));
	}
	@Test
	void SeveralWords_check_WordsOnlyLeters() {
		assertEquals("Hello New World", Task1.splittedWords("olleH weN dlroW"));
	}

}

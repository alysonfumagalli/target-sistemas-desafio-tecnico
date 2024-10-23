package desafio2;

import java.util.Scanner;

public class LetterA {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("====== Contador de As em String ======");
		System.out.print("> Insira uma string: ");
		String string = input.nextLine();
		input.close();
		int count = countQuantityOfA(string);
		showResult(count, string);
	}
	
	private static int countQuantityOfA(String string) {
		char[] chars = string.toCharArray();
		int count = 0;
		for (char character : chars) {
			if (Character.toUpperCase(character) == 'A')
				count++;
		}
		return count;
	}
	
	private static void showResult(int count, String string) {
		if (count > 0) {
			System.out.println(String.format("> A string '%s' possui %d As.", string, count));
			return;
		}
		System.out.println(String.format("> A string '%s' não possui nenhum A.", string));
	}
}

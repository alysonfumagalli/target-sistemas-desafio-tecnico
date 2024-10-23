package desafio1;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		try {
			Scanner input = new Scanner(System.in);
			System.out.print("> Informe um número (inteiro) a ser pesquisado na Sequência de Fibonacci: ");
			Integer number = Integer.parseInt(input.nextLine());
			input.close();
			boolean result = isThisNumberInFibonacci(number);
			showResult(number, result);
		} catch (NumberFormatException e) {
			System.err.println("> Por favor, informe um valor válido...");
			main(args);
		}
	}

	private static void showResult(Integer number, boolean result) {
		if (result) {
			System.out.println(String.format("> O número %d está presente na Sequência de Fibonacci!", number));
		} else {
			System.out.println(String.format("> O número %d não está presente na Sequência de Fibonacci...", number));
		}
	}
	
	private static boolean isThisNumberInFibonacci(int givenNumber) {
		int currentNumber = 1;
		int previousNumber = 0;
		while (currentNumber <= givenNumber) {
			if (currentNumber == givenNumber) {
				return true;
			}
			
			int newNumber = currentNumber + previousNumber;
			previousNumber = currentNumber;
			currentNumber = newNumber;
		}
		return false;
	}
}
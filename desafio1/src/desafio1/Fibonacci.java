package desafio1;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.print("> Informe um número a ser pesquisado na Sequência de Fibonacci: ");
			Integer number = Integer.parseInt(input.nextLine());
			input.close();
			boolean result = isThisNumberInFibonacci(number);
			if (result) {
				System.out.println(String.format("> O número %d está presente na Sequência de Fibonacci!", number));
			} else {
				System.out.println(String.format("> O número %d não está presente na Sequência de Fibonacci...", number));
			}
	}
	
	public static boolean isThisNumberInFibonacci(int givenNumber) {
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
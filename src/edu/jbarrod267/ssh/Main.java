package edu.jbarrod267.ssh;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		//Investiga el uso de random y genera por pantalla los números de la lotería primitiva.
		Random random = new Random();

		System.out.println("Números de la Lotería Primitiva:");
		// Genera 5 números principales
		for (int i = 1; i <= 5; i++) {
			int num = random.nextInt(99) + 1;
			System.out.println("Numero " + i + ": " + num);
		}
		// Número complementario
		for (int j = 1; j <= 1; j++) {
			int num2 = random.nextInt(9) + 1;
			System.out.println("Numero complementario: " + num2);

			System.out.println("¡Buena suerte en el sorteo!");
		}
	}
}
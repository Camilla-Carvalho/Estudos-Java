// Fazer um programa para ler um n�mero inteiro, e depois dizer se este n�mero � negativo ou n�o

import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		
		Scanner typeScan = new Scanner(System.in);
		
		int value = typeScan.nextInt();
		
		if (value < 0)
			System.out.println("\nNEGATIVO ");
		
		else 
			System.out.println("\nNAO NEGATIVO ");

	}

}

// CORRE��O: https://github.com/acenelio/nivelamento-java/blob/master/src/cond01.java
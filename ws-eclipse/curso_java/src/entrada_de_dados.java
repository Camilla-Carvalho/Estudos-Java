import java.util.Locale;
import java.util.Scanner;

public class entrada_de_dados {

	public static void main(String[] args) {
		
		Scanner typeScan = new Scanner(System.in);  // Esta fun��o permite que um valor seja armazenado dentro do programa.
		
		System.out.print("Type your name: "); // Visual de intera��o para usu�rio 
		String name; // Declara��o da vari�vel
		name = typeScan.next(); // Aqui � onde o valor ser� inserido pelo usu�rio, processado e atribu�do a vari�vel.
		
		System.out.print("Type your age: "); 
		int age;
		age = typeScan.nextInt();
		Locale.setDefault(Locale.US);
		System.out.println("Type a any value: ");
		Double x;
		x = typeScan.nextDouble();
		
		Boolean verdadeiro;
		verdadeiro = typeScan.hasNext();
		
		typeScan.close(); //Utilizamos quando n�o precisamos mais do objeto typeScan
		
		
		System.out.printf("Your name is %s and you have a %d yers old! Test flat number: %.2f", name, age, x);
	
	}

}

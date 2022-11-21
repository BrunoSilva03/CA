package fibonacci;

import java.util.Scanner;

public class Fibonacci {

	public void sequenciaFibonacci(Scanner sc) {
		System.out.println("Digite quantas casas deseja ver a sequência de Fibonacci: ");
		int casas = sc.nextInt();
		
		if(casas <=2) {
			pequenaSequenciaFibonacci(casas, sc);
		} else {
			grandeSequenciaFibonacci(casas, sc);
		}
	}
	
	public void pequenaSequenciaFibonacci(int casas, Scanner sc) {
		if(casas <= 0) {
			System.out.println("Número de casas menor ou igual a zero. Nenhuma sequência  a mostrar.");
		}
		
		if (casas == 1) {
			System.out.println("SEQUÊNCIA DE FIBONACCI: ");
			System.out.println("1");
		}
		
		if(casas == 2) {
			System.out.println("SEQUÊNCIA DE FIBONACCI: ");
			System.out.println("1, 1");
		}
	}
	
	public void grandeSequenciaFibonacci(int casas, Scanner sc) {
		int atual=1, anterior=1, antAnterior=1;
		
		System.out.println("SEQUÊNCIA DE FIBONACCI: ");
		System.out.print(1 + ", ");
		System.out.print(1 + ", ");
		for(int i = 2; i < casas; i++) {
			atual = anterior + antAnterior;
			antAnterior = anterior;
			anterior = atual;
			System.out.print(atual + ", ");
			
		}
	}
}

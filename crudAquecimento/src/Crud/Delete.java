package Crud;

import java.util.ArrayList;
import java.util.Scanner;

public class Delete {
	public void excluir(ArrayList<String> lista, Scanner sc) {
		if(lista.isEmpty()) {
			System.out.println("A lista encontra-se vazia no momento.");
		} else {
			String item;
			System.out.println("Digite o item que deseja excluir da lista: ");
			item = sc.next();
			
			if(lista.contains(item)) {
				lista.remove(item);
			} else {
				seListaNaoContemItem(lista, item, sc);
			}
		}
	}
	
	
	
	public void seListaNaoContemItem(ArrayList<String> lista, String item, Scanner sc) {
		int opc;
		System.out.printf("%s não está presente na lista, Digite outro item ou retorne ao menu inicial\n", item);
		System.out.println("1 - Digitar outro item");
		System.out.println("2 - Retornar ao menu inicial");
		opc = sc.nextInt();
		
		switch(opc) {
		
		case 1: {
			
			excluir(lista, sc);
			
		}break;
		
		
		case 2: {
			
			System.out.println("Retornando ao menu inicial");
			
			
		}break;
		
		
		default: {
			
			System.out.println("Opção Inválida. Tente novamente.");
			seListaNaoContemItem(lista, item, sc);
			
		}break;
		
		}
		
		
	}

}

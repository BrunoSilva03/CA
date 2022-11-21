package Crud;

import java.util.ArrayList;
import java.util.Scanner;

public class Create {

	public void inserir(ArrayList<String> lista, Scanner sc) {
		String item;
		System.out.println("Digite o item que deseja inserir na lista: ");
		item = sc.next();
		
		if(lista.contains(item)) {
			seItemJaExisteNaLista(lista, item, sc);
		} else {
			lista.add(item);
			System.out.printf("%s adicionado a lista Com Sucesso!!!", item);
		}
	}
	
	public void seItemJaExisteNaLista(ArrayList<String> lista, String item, Scanner sc) {
		int opc;
		System.out.printf("%s já está presente na lista, Digite outro item ou retorne ao menu inicial\n", item);
		System.out.println("1 - Digite Outro Item");
		System.out.println("2 - Retornar ao menu inicial");
		opc = sc.nextInt();
		
		switch(opc) {
		
		case 1: {
			
			inserir(lista, sc);
			
		}break;
		
		
		case 2: {
			
			System.out.println("Retornando ao menu inicial...");
			
		}break;
		
		
		default: {
			
			System.out.println("Opção Inválida. Tente novamente");
			seItemJaExisteNaLista(lista, item, sc);
			
		}break;
		
		
		}
	}
}

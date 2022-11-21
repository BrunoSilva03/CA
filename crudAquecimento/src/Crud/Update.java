package Crud;

import java.util.ArrayList;
import java.util.Scanner;

public class Update {

	public void alterar(ArrayList<String> lista, Scanner sc) {
		if(lista.isEmpty()) {
			System.out.println("A lista encontra-se vazia no momento.");
		} else {
			
			String item;
			System.out.println("Digite o item que deseja alterar na lista: ");
			item = sc.next();
			
			if(lista.contains(item)) {
				seListaContemItem(lista, item, sc);
			} else {
				seListaNaoContemItem(lista, item, sc);
			}
		}
		
	}
	
	
	public void seListaContemItem(ArrayList<String> lista, String item, Scanner sc) {
		String newItem;
		System.out.printf("Digite o item quer que substitua %s na lista:\n", item);
		newItem = sc.next();
		
		if(lista.contains(newItem)) {
			contemNewItem(lista, item, newItem, sc);
		} else {	
			naoContemNewItem(lista, item, newItem, sc);
		}
	}
	
	public void seListaNaoContemItem(ArrayList<String> lista, String item, Scanner sc) {
		int opc;
		System.out.printf("%s não está presente na lista. Digite outro item ou retorne ao menu inicial\n", item);
		System.out.println("1 - Digite outro item");
		System.out.println("2 - Retornar ao menu inicial");
		opc = sc.nextInt();
		
		switch(opc) {
		
		case 1: {
			
			alterar(lista, sc);
			
		}break;
		
		
		case 2: {
			
			System.out.println("Retornando ao menu inicial");
			
		}break;
		
		
		default: {
			
			System.out.println("Opção Inválida. Tente novamente");
			seListaNaoContemItem(lista, item, sc);
			
		}break;
		
		}
	}
	
	
	public void contemNewItem(ArrayList<String> lista, String item, String newItem, Scanner sc) {
		int opc;
		System.out.printf("%s já está presente na lista. Digite outro ou Retorne ao menu inicial\n", newItem);
		System.out.println("1 - Digite outro número");
		System.out.println("2 - Retornar ao menu inicial");
		opc = sc.nextInt();
		
		switch(opc) {
		
		case 1: {
			
			seListaContemItem(lista, item, sc);
			
		}break;
		
		
		case 2: {
			
			System.out.println("Retornando ao menu inicial");
			
		}break;
		
		
		default: {
			
			System.out.println("Opção Inválida. Tente novamente.");
			contemNewItem(lista, item, newItem, sc);
			
		}break;
		
		
		}
	}
	
	public void naoContemNewItem(ArrayList<String> lista, String item, String newItem, Scanner sc) {
		for(int i = 0; i < lista.size(); i++) {
			if(lista.get(i).equals(item)) {
				lista.set(i, newItem);
			}
		}
		System.out.printf("%s substituído na lista por %s Com Sucesso!!!\n", item, newItem);
	}
	
}

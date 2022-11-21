package Crud;

import java.util.ArrayList;
import java.util.Scanner;

public class Read {

	public void exibir(ArrayList<String> lista, Scanner sc) {
		if(lista.isEmpty()) {
			System.out.println("A lista encontra-se vazia no momento");
		} else {
			for(int i = 0; i < lista.size(); i++) {
				System.out.println(lista.get(i));
			}
		}
	}
}

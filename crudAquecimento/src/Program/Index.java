package Program;

import java.util.ArrayList;
import java.util.Scanner;

import Crud.Create;
import Crud.Delete;
import Crud.Read;
import Crud.Update;
import fibonacci.Fibonacci;

public class Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> lista = new ArrayList();
		Scanner sc = new Scanner(System.in);
		int opc = 1;

		Create c = new Create();
		Read r = new Read();
		Update u = new Update();
		Delete d = new Delete();
		Fibonacci f = new Fibonacci();
		System.out.println("SEJA MUITO BEM-VINDO(A)");
		do {

			System.out.println("Escolha uma opção: ");
			System.out.println("1 - listar");
			System.out.println("2 - inserir");
			System.out.println("3 - excluir");
			System.out.println("4 - alterar");
			System.out.println("5 - Fibonacci");
			System.out.println("0 - Sair do Programa");
			opc = sc.nextInt();

			switch (opc) {
			
			case 0: {
				System.out.println("Fechando/Saindo do programa. Obrigado por usar");
				System.out.println(".");
				System.out.println(".");
				System.out.println(".");
				
			}break;
			

			case 1: {

				r.exibir(lista, sc);
			}
				break;

			case 2: {

				c.inserir(lista, sc);
			}
				break;

			case 3: {

				d.excluir(lista, sc);
			}
				break;

			case 4: {

				u.alterar(lista, sc);
			}
				break;

			case 5: {

				f.sequenciaFibonacci(sc);
			}
				break;

			default: {
				System.out.println("Opção Inválida. Tente novamente.");

			}
				break;

			}

		} while (opc != 0);
	}

}

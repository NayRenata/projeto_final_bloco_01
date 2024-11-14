package projeto_final_bloco_01;

import java.io.IOException;
import java.lang.StackWalker.Option;
import java.util.Scanner;



//import conta.util.Cores;

public class Menu {

	//Variaveis
	int option;
	static int menu;

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("*****************************************");
        System.out.println("       Bem-vindos ao iFome, somos a      ");
        System.out.println("    maior rede de delivery do Brasil,    ");
        System.out.println("   sempre prontos a atender o nosso      ");
        System.out.println("  cliente com rapidez e tranquilidade!  ");
        
        System.out.println();
        
        //Laço de repetição while
		
		while(true) {
			
			System.out.println("*****************************************");
			System.out.println("                                         ");
			System.out.println("                IFome Menu               ");
			System.out.println("                                         ");
			System.out.println("*****************************************");
			System.out.println("                                         ");
			System.out.println("     1- Saiba sobre nós!                 ");
			System.out.println("     2- Cadastre - se aqui!              ");
			System.out.println("     3- Listar todos os produtos.        ");
			System.out.println("     4- Finalizar compra !               ");
			System.out.println("     5- Sair.                            ");
			System.out.println("                                         ");
			System.out.println("*****************************************");
			System.out.println("Entre com a opção desejada:              ");
			System.out.println("                                         ");
			int	option = leia.nextInt();
			leia.nextLine();
			
	//Laço condicional		
		if(option == 5) {
			System.out.println("");
				System.out.println("IFome agradece a sua visita, até breve!");
				//sobre();
				leia.close();
				System.exit(option);
			}else {}
}
	}
}
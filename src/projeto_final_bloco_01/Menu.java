package projeto_final_bloco_01;

import java.io.IOException;
import java.util.Scanner;

import projeto_final_bloco_01.model.Compra;
import projeto_final_bloco_01.model.CompraFinalizada;
import projeto_final_bloco_01.util.Cores;

public class Menu {

    // Variáveis
    static String nome, tel, email;
    static int menu;
    static float valorProduto;
    
    int option;

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("*****************************************");
        System.out.println("       Bem-vindos ao iFome, somos a      ");
        System.out.println("    maior rede de delivery do Brasil,    ");
        System.out.println("   sempre prontos a atender o nosso      ");
        System.out.println("  cliente com rapidez e tranquilidade!  ");
        
        System.out.println();
        
        // Laço de repetição while
        while (true) {

            System.out.println("*****************************************");
            System.out.println("                                         ");
            System.out.println("                IFome Menu               ");
            System.out.println("                                         ");
            System.out.println("*****************************************");
            System.out.println("                                         ");
            System.out.println("     1- Saiba sobre nós.                 ");
            System.out.println("     2- Cadastre-se aqui!                ");
            System.out.println("     3- Listar todos os produtos.        ");
            System.out.println("     4- Finalizar compra.                ");
            System.out.println("     5- Sair.                            ");
            System.out.println("                                         ");
            System.out.println("*****************************************");
            System.out.println("Entre com a opção desejada:              ");
            System.out.println("                                         ");
            int option = leia.nextInt();
            leia.nextLine();
            
            // Laço condicional
            if (option == 5) {
                System.out.println("");
                System.out.println("IFome agradece a sua visita, até breve!");
                sobre();
                leia.close();
                System.exit(option);
            }

            switch (option) {

                case 1:
                    System.out.println("\nSaiba mais sobre o nosso iFome:");
                    System.out.println("*****************************************");
                    System.out.println("A IFome nasceu com a missão de transformar a");
                    System.out.println("maneira como você compra alimentos e produtos");
                    System.out.println("essenciais para o dia a dia. Sabemos que a");
                    System.out.println("correria da vida moderna muitas vezes dificulta");
                    System.out.println("encontrar tempo para escolher com calma o que");
                    System.out.println("consumir ou até para comprar itens básicos.");
                    System.out.println();
                    System.out.println("Pensando nisso, criamos uma plataforma prática");
                    System.out.println("e intuitiva, que traz uma ampla seleção de");
                    System.out.println("alimentos frescos, snacks, bebidas, produtos");
                    System.out.println("gourmet e itens para sua casa, tudo a um clique");
                    System.out.println("de distância.");
                    System.out.println();
                    System.out.println("Nosso objetivo é oferecer qualidade, conveniência");
                    System.out.println("e preço justo. Trabalhamos com os melhores fornecedores");
                    System.out.println("e garantimos que cada produto em nossa loja online");
                    System.out.println("atenda aos mais altos padrões de qualidade.");
                    System.out.println();
                    System.out.println("Com o iFome, você pode comprar o que precisa para o");
                    System.out.println("seu dia a dia sem sair de casa, com a certeza de que");
                    System.out.println("sua experiência será rápida, segura e satisfatória.");
                    System.out.println();
                    System.out.println("Aqui, comer bem e ter o que você precisa nunca foi");
                    System.out.println("tão fácil. iFome é a solução para quem busca");
                    System.out.println("praticidade e qualidade em cada refeição e em cada");
                    System.out.println("compra.");
                    System.out.println("*****************************************");

                    keyPress();
                    break;

                // Entrada de dados do usuario
                case 2:
                    System.out.println("Digite o seu nome completo:");
                    nome = leia.nextLine();
                    
                    System.out.println("Informe o seu WhatsApp(somente números):");
                    tel = leia.nextLine();
                    
                    System.out.println("Informe o seu email:");
                    email = leia.nextLine();
                    
                    keyPress();
                    break;

                case 3:
                    // Segundo switch, dentro do switch principal
                    System.out.println("\n      Aqui estão os nossos produtos:    ");
                    System.out.println("*****************************************");
                    System.out.println("\n Selecione o número desejado para verificar o detalhe do menu proposto para hoje!");
                    
                    System.out.println("\n 1- Café da manhã");
                    System.out.println("\n 2- Almoço");
                    System.out.println("\n 3- Janta");
                    System.out.println("\n 4- Sobremesa");
                    menu = leia.nextInt();
                    
                    System.out.println("*****************************************");
                    System.out.println("");
                    
                    switch (menu) {
                        case 1:
                            System.out.println("1-Café da manhã: pão de queijo recheado e suco de laranja.");
                            valorProduto = 25.0f;
                            keyPress();
                            break;
                        case 2:
                            System.out.println("2-Virada a paulista e suco de goiaba.");
                            valorProduto = 35.0f;
                            keyPress();
                            break;
                        case 3:
                            System.out.println("3-Caldo de cana, suco de maracujá e chá de camomila.");
                            valorProduto = 35.0f;
                            keyPress();
                            break;
                        case 4:
                            System.out.println("4-Bolo de chocolate com uma bola de creme.");
                            valorProduto = 15.0f;
                            keyPress();
                            break;
                        default:
                            System.out.println("Opção inválida para o menu.");
                            keyPress();
                            break;
                    }
                    break;

                case 4:
                    if (nome != null && tel != null && email != null) {
                        System.out.println("Estamos felizes por comprar com a gente!");
                        System.out.println("Segue abaixo os seus dados de cadastro e as suas compras:");
                        
                        // Criando a instância da classe CompraFinalizada e informando as variáveis
                        String titular = nome;
                        int cod = 1; 
                        double valor = valorProduto;
                        
                        CompraFinalizada compraFinalizada = new CompraFinalizada(cod++, titular, email, tel, valor, nome);
                        compraFinalizada.visualizar();
                    } else {
                        System.out.println("Cadastre-se corretamente primeiro antes de encerrar a compra");    
                    }
                    break;

                default:
                    System.out.println("\nOpção Inválida!\n");
                    keyPress();
                    break;
            }
        }
    }

    private static void keyPress() {
        try {
            System.out.println("\n\nPressione Enter para Continuar...");
            System.in.read();
        } catch (IOException e) {
            System.out.println("Você pressionou uma tecla diferente de enter!");
        }
    }

    public static void sobre() {
        System.out.println("\n*********************************************************");
        System.out.println("Projeto Final Desenvolvido por: Nayara Renata Costa ");
        System.out.println("Generation Brasil - NayaraP@genstudents.org");
        System.out.println("https://github.com/NayRenata");
        System.out.println("*********************************************************");
    }
}

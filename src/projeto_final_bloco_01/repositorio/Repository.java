package projeto_final_bloco_01.repositorio;

import projeto_final_bloco_01.Menu;

public interface Repository {

	// (Criar, Ler, Atualizar, Deletar) CRUD 
		
		public void listarProdutos();
		public void cadastrar();
		
		
		// Métodos do Delivery
		public void comprar(int numero, float valor);
		
}
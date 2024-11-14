package projeto_final_bloco_01.model;

import projeto_final_bloco_01.model.Compra;

public class CompraFinalizada extends Compra{

	private String produto;

	public CompraFinalizada(int cod, String titular, String email, String tel, double valor, String produto) {
		super(cod, titular, email, tel, valor);
		this.produto = produto;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public void visualizar() {
		super.visualizar();
		System.out.println("Produto desejado: " + this.produto);
	}
}
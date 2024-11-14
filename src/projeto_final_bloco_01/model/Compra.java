package projeto_final_bloco_01.model;

import java.text.DecimalFormat;

public abstract class Compra {
	
	private int cod;
	private String titular;
	private String email;
	private String tel;
	private double valor;
	
	
	
	public Compra(int cod, String titular, String email, String tel, double valor) {
		this.cod = cod;
		this.titular = titular;
		this.email = email;
		this.tel = tel;
		this.valor = valor;
	}



	public int getCod() {
		return cod;
	}



	public void setCod(int cod) {
		this.cod = cod;
	}



	public String getTitular() {
		return titular;
	}



	public void setTitular(String titular) {
		this.titular = titular;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getTel() {
		return tel;
	}



	public void setTel(String tel) {
		this.tel = tel;
	}



	public double getValor() {
		return valor;
	}



	public void setValor(double valor) {
		this.valor = valor ;
	}
	
	public void visualizar() {
		DecimalFormat df = new DecimalFormat("#,###.00");
		
		
		System.out.println("\n\n*********************************************************************");
		System.out.println("Detalhamento da compra:");
		System.out.println("*********************************************************************");
		System.out.println("Numero da Compra: " + this.cod);
		System.out.println("Titular da compra: " + this.titular);
		System.out.println("email: " + this.email);
		System.out.println("WhatsApp: " + this.tel);
		System.out.println("valor da compra: " + df.format(this.valor));

	}
	
	
}

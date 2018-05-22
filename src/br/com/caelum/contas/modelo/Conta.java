package br.com.caelum.contas.modelo;

/**
 * Classe responsável por moldar as Contas do Banco
 * @author aller
 *
 */
public class Conta {
	private int numero;
	private double saldo;
	private double limite;
	private String titular;	
	private String agencia;

	/**
	 * Metodo que incrementa o saldo.
	 * @param valor
	 */
	public void deposita(double valor) {
		this.saldo += valor;
	}

	public boolean saca(double valor) {
		if(this.saldo < valor) {
			return false;
		}
		else {
			this.saldo -= valor;
			return true;
		}
	}

	public double getSaldo() {
		return this.saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public boolean transfere(Conta destino, double valor) {
		boolean retirou = this.saca(valor);
		if (retirou == false) {
			return false;
		}
		else {
			destino.deposita(valor);
			return true;
		}
	}

}

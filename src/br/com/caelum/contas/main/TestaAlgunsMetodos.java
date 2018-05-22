package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;

public class TestaAlgunsMetodos {
	public static void main(String[] args) {
		Conta minhaConta;
		minhaConta = new Conta();
		
		minhaConta.setTitular("Duke");
		minhaConta.deposita(1000);
		
		minhaConta.saca(200);
		
		minhaConta.deposita(500);
		System.out.println(minhaConta.getSaldo());
	}
}

package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;

public class TestaDuasContas {
	public static void main(String[] args) {
		Conta minhaConta;
		minhaConta = new Conta();
		minhaConta.deposita(1000);
		
		Conta meuSonho;
		meuSonho = new Conta();
		meuSonho.deposita(1500000);
		System.out.println(minhaConta.getSaldo());
		System.out.println(meuSonho.getSaldo());
	}
}

package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;

public class Programa {
	public static void main(String[] args) {
		Conta minhaConta;
		minhaConta = new Conta();
		minhaConta.setTitular("Duke");
		minhaConta.deposita(1000.0);
		System.out.println("Saldo atual: " + minhaConta.getSaldo());
	}
}

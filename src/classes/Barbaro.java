package classes;

import dados.D12;

public class Barbaro {
	
	private int vida;
	private int vidaLvl = 12;
	private String nome = "Barbaro";
	
	public Barbaro() {
		D12 dado = new D12();
		
		this.vida = dado.getD12();
	}

	public int getVidaLvl() {
		return vidaLvl;
	}
	
	public int getVida() {
		return vida;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String toString() {
		return "Classe: "
				+ getNome()
				+ "%nHP: 1D12%n";
	}

}

package classes;

import dados.D8;

public class Druida {

	private int vida;
	private int vidaLvl = 8;
	private String nome = "Druida";

	public Druida() {
		D8 dado = new D8();
		
		this.vida = dado.getD8();
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
				+ "%nHP: 1D8%n";
	}
}

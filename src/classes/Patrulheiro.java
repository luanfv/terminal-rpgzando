package classes;

import dados.D10;

public class Patrulheiro {
	
	private int vida;
	private int vidaLvl = 10;
	private String nome = "Patrulheiro";
	
	public Patrulheiro() {
		D10 dado = new D10();
		
		this.vida = dado.getD10();
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
				+ "%nHP: 1D10%n";
	}
	

}

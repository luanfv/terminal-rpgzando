package classes;

import dados.D6;

public class Mago {

	private int vida;
	private int vidaLvl = 6;
	private String nome = "Mago";
	
	public Mago() {
		D6 dado = new D6();
		
		this.vida = dado.getD6();
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
				+ "%nHP: 1D6%n";
	}
}

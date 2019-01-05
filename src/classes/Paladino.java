package classes;

import java.util.Random;

public class Paladino {
	
	private int vida;
	private int vidaLvl = 10;
	private String nome = "Paladino";
	
	public Paladino() {
		Random aleatorio = new Random();
		int hp;
		hp = aleatorio.nextInt(11);
		
		while(hp < 1) 
			hp = aleatorio.nextInt(11);

		this.vida = hp;
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

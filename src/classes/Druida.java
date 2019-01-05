package classes;

import java.util.Random;

public class Druida {

	private int vida;
	private int vidaLvl = 8;
	private String nome = "Druida";

	public Druida() {
		Random aleatorio = new Random();
		int hp;
		hp = aleatorio.nextInt(9);
		
		while(hp < 1) 
			hp = aleatorio.nextInt(9);

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
				+ "%nHP: 1D8%n";
	}
}

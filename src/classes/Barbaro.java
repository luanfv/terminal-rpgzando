package classes;

import java.util.Random;

public class Barbaro {
	
	private int vida;
	private String nome = "Barbaro";
	
	public Barbaro() {
		Random aleatorio = new Random();
		int hp;
		hp = aleatorio.nextInt(13);
		
		while(hp < 1) 
			hp = aleatorio.nextInt(13);

		this.vida = hp;
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

package classes;

import java.util.Random;

import informações.Modificador;

public class Barbaro {
	
	Modificador mod = new Modificador();
	private int vida;
	
	public Barbaro() {
		Random aleatorio = new Random();
		int hp;
		hp = aleatorio.nextInt(12);
		
		while(hp == 0) 
			hp = aleatorio.nextInt(12);

		this.vida = hp + mod.getConstituicao();
	}

	public int getVida() {
		return vida;
	}
	
	

}

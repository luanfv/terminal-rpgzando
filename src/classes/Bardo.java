package classes;

import java.util.Random;

import informações.Modificador;

public class Bardo {
	
	Modificador mod = new Modificador();
	private int vida;
	
	public Bardo() {
		Random aleatorio = new Random();
		int hp;
		hp = aleatorio.nextInt(8);
		
		while(hp == 0) 
			hp = aleatorio.nextInt(8);

		this.vida = hp + mod.getConstituicao();
	}

	public int getVida() {
		return vida;
	}

}

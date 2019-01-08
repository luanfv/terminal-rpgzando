package classes;


public class Guerreiro {
	

	private int vida;
	private int vidaLvl = 10;
	private String nome = "Guerreiro";

	public Guerreiro() {
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

	public String toString() {
		return "Classe: "
				+ getNome()
				+ "%nHP: 1D10%n";
	}
}

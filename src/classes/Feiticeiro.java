package classes;


public class Feiticeiro {

	private int vida;
	private int vidaLvl = 6;
	private String nome = "Feiticeiro";

	public Feiticeiro() {
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
				+ "%nHP: 1D6%n";
	}
	
}

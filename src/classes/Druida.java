package classes;


public class Druida {

	private int vida;
	private int vidaLvl = 8;
	private String nome = "Druida";

	public Druida() {
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
				+ "%nHP: 1D8%n";
	}
}

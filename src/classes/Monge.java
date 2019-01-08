package classes;

public class Monge {

	private int vida;
	private int vidaLvl = 8;
	private String nome = "Monge";

	public Monge() {
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

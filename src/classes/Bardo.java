package classes;


public class Bardo {
	
	private int vida;
	private int vidaLvl = 8;
	private String nome = "Bardo";
	
	public Bardo() {
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

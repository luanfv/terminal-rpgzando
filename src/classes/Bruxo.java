package classes;


public class Bruxo {
	
	private int vida;
	private int vidaLvl = 8;
	private String nome = "Bruxo";

	public Bruxo() {
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

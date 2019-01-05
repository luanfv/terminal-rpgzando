package raça;

public class Draconato {
	
	private int forca, destreza, inteligencia, sabedoria, constituicao, carisma;
	private String nome = "Draconato";
	
	public Draconato() {
	
		this.forca = 2;
		this.destreza = 0;
		this.inteligencia = 0;
		this.sabedoria = 0;
		this.constituicao = 0;
		this.carisma = 1;
	}

	public String getNome(){
		return nome;
	}

	public int getForca() {
		return forca;
	}

	public int getDestreza() {
		return destreza;
	}

	public int getInteligencia() {
		return inteligencia;
	}

	public int getSabedoria() {
		return sabedoria;
	}

	public int getConstituicao() {
		return constituicao;
	}

	public int getCarisma() {
		return carisma;
	}
	
	public String toString() {
		return "Draconato%nFOR: +" + getForca() + "%nCAR: +" + getCarisma();
	}

}

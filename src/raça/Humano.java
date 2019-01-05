package raça;

public class Humano {

		
	private int forca, destreza, inteligencia, sabedoria, constituicao, carisma;
	private String nome = "Humano";
	
		
	public Humano() {

		this.forca = 1;
		this.destreza = 1;
		this.inteligencia = 1;
		this.sabedoria = 1;
		this.constituicao = 1;
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
		return "Humano%nFOR: +" + getForca() + "%nDES: +" + getDestreza() + "%nCON: +" + getConstituicao() + "%nINT: +" + getInteligencia() + "%nSAB: +" + getSabedoria() + "%nCAR: +" + getCarisma();
	}

}

	


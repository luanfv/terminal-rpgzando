package raça;

public class Halfling {

private int forca, destreza, inteligencia, sabedoria, constituicao, carisma;

	
	
	public Halfling() {

		this.forca = 0;
		this.destreza = 2;
		this.inteligencia = 0;
		this.sabedoria = 0;
		this.constituicao = 0;
		this.carisma = 0;
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
		return "Halfling%nDES: +" + getDestreza();
	}
	
}

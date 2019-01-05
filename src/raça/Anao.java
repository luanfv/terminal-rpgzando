package raça;

public class Anao {
	
	private int forca, destreza, inteligencia, sabedoria, constituicao, carisma;
	String nome;
	
	public Anao() {
		
		this.forca = 0;
		this.destreza = 0;
		this.inteligencia = 0;
		this.sabedoria = 0;
		this.constituicao = 2;
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
		return "Anão%nCON: +" + getConstituicao();
	}

}

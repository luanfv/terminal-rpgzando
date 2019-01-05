package raça;

public class ElfoNegro {
	
	Elfo elfo = new Elfo();
	private int forca, destreza, inteligencia, sabedoria, constituicao, carisma;
	private String nome = "Elfo Negro";
	
	public ElfoNegro() {

		this.forca = 0 + elfo.getForca();
		this.destreza = 0 + elfo.getDestreza();
		this.inteligencia = 0 + elfo.getInteligencia();
		this.sabedoria = 0 + elfo.getSabedoria();
		this.constituicao = 0 + elfo.getConstituicao();
		this.carisma = 1 + elfo.getCarisma();
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
		return "%nElfo Negro%nCAR: +" + getCarisma();
	}

}

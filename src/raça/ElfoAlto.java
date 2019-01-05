package raça;

public class ElfoAlto {
	
	Elfo elfo = new Elfo();
	private int forca, destreza, inteligencia, sabedoria, constituicao, carisma;
	private String nome = "Elfo Alto";
	
	public ElfoAlto() {

		this.forca = 0 + elfo.getForca();
		this.destreza = 0 + elfo.getDestreza();
		this.inteligencia = 1 + elfo.getInteligencia();
		this.sabedoria = 0 + elfo.getSabedoria();
		this.constituicao = 0 + elfo.getConstituicao();
		this.carisma = 0 + elfo.getCarisma();
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
		return "%nElfo Alto%nINT: +" + getInteligencia();
	}

}

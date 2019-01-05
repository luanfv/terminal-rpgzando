package raça;

public class GnomoPedra {
	
	private int forca, destreza, inteligencia, sabedoria, constituicao, carisma;
	private String nome = "Gnomo da Pedra";
	Gnomo gnomo = new Gnomo();
	
	public GnomoPedra() {
	
		this.forca += 0 + gnomo.getForca();
		this.destreza += 0 + gnomo.getDestreza();
		this.inteligencia += 0 + gnomo.getInteligencia();
		this.sabedoria += 0 + gnomo.getSabedoria();
		this.constituicao += 1 + gnomo.getConstituicao();
		this.carisma += 0 + gnomo.getCarisma();
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
		return "%nGnomo da Pedra%nCON: +" + getConstituicao();
	}

}

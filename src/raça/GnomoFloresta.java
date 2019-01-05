package raça;

public class GnomoFloresta {

	private int forca, destreza, inteligencia, sabedoria, constituicao, carisma;
	private String nome = "Gnomo da Floresta";
	Gnomo gnomo = new Gnomo();
	
	
	public GnomoFloresta() {
	
		this.forca += 0 + gnomo.getForca();
		this.destreza += 1 + gnomo.getDestreza();
		this.inteligencia += 0 + gnomo.getInteligencia();
		this.sabedoria += 0 + gnomo.getSabedoria();
		this.constituicao += 0 + gnomo.getConstituicao();
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
		return "%nGnomo da Floresta%nDES: +" + getDestreza();
	}
	
}

package raça;

public class HalflingLeve {
	
	Halfling halfling = new Halfling();
	private int forca, destreza, inteligencia, sabedoria, constituicao, carisma;
	private String nome = "Halfling Pés Leves";
	
	public HalflingLeve() {

		this.forca = 0 + halfling.getForca();
		this.destreza = 0 + halfling.getDestreza();
		this.inteligencia = 0 + halfling.getInteligencia();
		this.sabedoria = 0 + halfling.getSabedoria();
		this.constituicao = 0 + halfling.getConstituicao();
		this.carisma = 1 + halfling.getCarisma();
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
		return "%nHalfling Pés Leves%nCAR: +" + getCarisma();
	}
}

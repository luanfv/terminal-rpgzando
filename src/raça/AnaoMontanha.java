package raça;

public class AnaoMontanha {
	
	private int forca, destreza, inteligencia, sabedoria, constituicao, carisma;
	private String nome = "Anão da Montanha";
	Anao anao = new Anao();
	
	public AnaoMontanha() {

		this.forca += 2 + anao.getForca();
		this.destreza += 0 + anao.getDestreza();
		this.inteligencia += 0 + anao.getInteligencia();
		this.sabedoria += 0 + anao.getSabedoria();
		this.constituicao += 0 + anao.getConstituicao();
		this.carisma += 0 + anao.getCarisma();
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
		return "%nAnão da Montanha%nFOR: +" + getForca();
	}
	
}

package raça;

public class HalflingRobusto {
	
	Halfling halfling = new Halfling();
	private int hp, forca, destreza, inteligencia, sabedoria, constituicao, carisma;
	private String nome = "Halfling Robusto";
	
	
	public HalflingRobusto() {

		this.forca = 0 + halfling.getForca();
		this.destreza = 0 + halfling.getDestreza();
		this.inteligencia = 0 + halfling.getInteligencia();
		this.sabedoria = 0 + halfling.getSabedoria();
		this.constituicao = 1 + halfling.getConstituicao();
		this.carisma = 0 + halfling.getCarisma();
	}

	public String getNome(){
		return nome;
	}
	
	public int getHp() {
		return hp;
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
		return "%nHalfling Robusto%nCON: +" + getConstituicao();
	}


}

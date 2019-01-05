package informações;

public class RacaPersonagem {
	
	private int forca, destreza, inteligencia, sabedoria, constituicao, carisma;
	String nome;
	
	public RacaPersonagem(String nome, int forca, int destreza, int inteligencia, int sabedoria, int constituicao, int carisma) {

		this.forca = forca;
		this.destreza = destreza;
		this.inteligencia = inteligencia;
		this.sabedoria = sabedoria;
		this.constituicao = constituicao;
		this.carisma = carisma;
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public RacaPersonagem() {
		
	}
	
	public int getForca() {
		return forca;
	}

	public void setForca(int forca) {
		this.forca = forca;
	}

	public int getDestreza() {
		return destreza;
	}

	public void setDestreza(int destreza) {
		this.destreza = destreza;
	}

	public int getInteligencia() {
		return inteligencia;
	}

	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}

	public int getSabedoria() {
		return sabedoria;
	}

	public void setSabedoria(int sabedoria) {
		this.sabedoria = sabedoria;
	}

	public int getConstituicao() {
		return constituicao;
	}

	public void setConstituicao(int constituicao) {
		this.constituicao = constituicao;
	}

	public int getCarisma() {
		return carisma;
	}

	public void setCarisma(int carisma) {
		this.carisma = carisma;
	}

	@Override
	public String toString() {
		return "RacaPersonagem [forca=" + forca + ", destreza=" + destreza + ", inteligencia=" + inteligencia
				+ ", sabedoria=" + sabedoria + ", constituicao=" + constituicao + ", carisma=" + carisma + "]";
	}
	
	

}

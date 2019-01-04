package raça;

public class Humano {

		
	private int hp, forca, destreza, inteligencia, sabedoria, constituicao, carisma;
	
	
		
	public Humano() {

		this.hp = 1;
		this.forca = 1;
		this.destreza = 1;
		this.inteligencia = 1;
		this.sabedoria = 1;
		this.constituicao = 1;
		this.carisma = 1;
	}

	public int getHp() {
		return hp;
	}

	private void setHp(int hp) {
		this.hp = hp;
	}

	public int getForca() {
		return forca;
	}

	private void setForca(int forca) {
		this.forca = forca;
	}

	public int getDestreza() {
		return destreza;
	}

	private void setDestreza(int destreza) {
		this.destreza = destreza;
	}

	public int getInteligencia() {
		return inteligencia;
	}

	private void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}

	public int getSabedoria() {
		return sabedoria;
	}

	private void setSabedoria(int sabedoria) {
		this.sabedoria = sabedoria;
	}

	public int getConstituicao() {
		return constituicao;
	}

	private void setConstituicao(int constituicao) {
		this.constituicao = constituicao;
	}

	public int getCarisma() {
		return carisma;
	}

	private void setCarisma(int carisma) {
		this.carisma = carisma;
	}
		
	public String toString() {
		return "Humano%nFOR: +" + getForca() + "%nDES: +" + getDestreza() + "%nCON: +" + getConstituicao() + "%nINT: +" + getInteligencia() + "%nSAB: +" + getSabedoria() + "%nCAR: +" + getCarisma();
	}
		


}

	


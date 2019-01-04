package raça;

public class AnaoMontanha {
	
	private int hp, forca, destreza, inteligencia, sabedoria, constituicao, carisma;
	Anao anao = new Anao();
	
	public AnaoMontanha() {

		this.hp += 0 + anao.getHp();
		this.forca += 2 + anao.getForca();
		this.destreza += 0 + anao.getDestreza();
		this.inteligencia += 0 + anao.getInteligencia();
		this.sabedoria += 0 + anao.getSabedoria();
		this.constituicao += 0 + anao.getConstituicao();
		this.carisma += 0 + anao.getCarisma();
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
		return "%nAnão da Montanha%nFOR: +" + getForca();
	}
	
}

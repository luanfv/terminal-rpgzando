package raça;

public class GnomoPedra {
	
	private int hp, forca, destreza, inteligencia, sabedoria, constituicao, carisma;
	private String nome = "Gnomo da Pedra";
	Gnomo gnomo = new Gnomo();
	
	public GnomoPedra() {
	
		this.hp += 0 + gnomo.getHp();
		this.forca += 0 + gnomo.getForca();
		this.destreza += 0 + gnomo.getDestreza();
		this.inteligencia += 0 + gnomo.getInteligencia();
		this.sabedoria += 0 + gnomo.getSabedoria();
		this.constituicao += 1 + gnomo.getConstituicao();
		this.carisma += 0 + gnomo.getCarisma();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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
		return "%nGnomo da Pedra%nCON: +" + getConstituicao();
	}

}

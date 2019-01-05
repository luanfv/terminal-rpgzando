package informações;


public class Personagem {
	
	private int hp, forca, destreza, inteligencia, sabedoria, constituicao, carisma;
	private String nome;
	private Modificador mod;
	private ClassePersonagem classe;
	private RacaPersonagem raca;

	public Personagem() {
		
	}
	
	public Personagem(int forca, int destreza, int inteligencia, int sabedoria, int constituicao, int carisma) {
		
		setForca(forca);
		setDestreza(destreza);
		setConstituicao(constituicao);
		setInteligencia(inteligencia);
		setSabedoria(sabedoria);
		setCarisma(carisma);
		setHp(0);
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
	
	public void setHp(int hp) {
		this.hp += hp;
	}
	
	public int getForca() {
		return forca;
	}
	
	public void setForca(int forca) {
		this.forca += forca;
	}
	
	public int getDestreza() {
		return destreza;
	}
	
	public void setDestreza(int destreza) {
		this.destreza += destreza;
	}
	
	public int getInteligencia() {
		return inteligencia;
	}
	
	public void setInteligencia(int inteligencia) {
		this.inteligencia += inteligencia;
	}
	
	public int getSabedoria() {
		return sabedoria;
	}
	
	public void setSabedoria(int sabedoria) {
		this.sabedoria += sabedoria;
	}
	
	public int getConstituicao() {
		return constituicao;
	}
	
	public void setConstituicao(int constituicao) {
		this.constituicao += constituicao;
	}
	
	public int getCarisma() {
		return carisma;
	}
	
	public void setCarisma(int carisma) {
		this.carisma += carisma;
	}
	
	public void hpManual(int hp) {
		setHp(getHp() + hp + mod.getConstituicao());
		System.out.printf("TOTAL: " + getHp() + "%nDado: " + hp + "%nModificador: " + mod.getConstituicao() + "%n");
	}
	
	public void hpAleatorio(int vida) {
		setHp(getHp() + vida + mod.getConstituicao());
		System.out.printf("TOTAL: " + getHp() + "%nDado: " + vida + "%nModificador: " + mod.getConstituicao() + "%n");
	}

	public void modificador(Modificador mod) {
		this.mod = mod;
	}
	
	public void raca(RacaPersonagem raca) {
		this.raca = raca;
	}
	
	public void classe(ClassePersonagem classe) {
		this.classe = classe;
	}

	public String toString() {
		return "Nome: "
				+ getNome()
				+ "%nRaça: "
				+ raca.getNome()
				+ "%nClasse: "
				+ classe.getNome()
				+ "%nHP: "
				+ getHp()
				+ "%nForça: "
				+ getForca()
				+ " +"
				+ mod.getForca()
				+ "%nDestreza: "
				+ getDestreza()
				+ " +"
				+ mod.getDestreza()
				+ "%nConstituição: "
				+ getConstituicao()
				+ " +"
				+ mod.getConstituicao()
				+ "%nInteligencia: "
				+ getInteligencia()
				+ " +"
				+ mod.getInteligencia()
				+ "%nSabedoria: "
				+ getSabedoria()
				+ " +"
				+ mod.getSabedoria()
				+ "%nCarisma: "
				+ getCarisma()
				+ " +"
				+ mod.getCarisma();
	}

}

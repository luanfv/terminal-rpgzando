package informações;

import raça.RacaPersonagem;

public class Personagem {
	
	private int hp, forca, destreza, inteligencia, sabedoria, constituicao, carisma;
	private String nome, classe;
	private Modificador mod;
	private String nomeRaca;

	public Personagem() {
		
	}
	
	public Personagem(String nomeRaca,int forca, int destreza, int inteligencia, int sabedoria, int constituicao, int carisma) {
		
		setNomeRaca(nomeRaca);
		setForca(forca);
		setDestreza(destreza);
		setConstituicao(constituicao);
		setInteligencia(inteligencia);
		setSabedoria(sabedoria);
		setCarisma(carisma);
	}
	
	
	
	public String getNomeRaca() {
		return nomeRaca;
	}

	public void setNomeRaca(String nomeRaca) {
		this.nomeRaca = nomeRaca;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public String getNome() {
		return nome;
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
		this.hp = hp;
	}
	
	public void hpAleatorio(int vida, int vidaModificador) {
		this.hp = getHp() + vida + vidaModificador;
		System.out.printf("TOTAL: " + getHp() + "%nDado: " + vida + "%nModificador: " + vidaModificador + "%n");
	}

	public void modificador(Modificador mod) {
		this.mod = mod;
	}

	public String toString() {
		return "Nome: "
				+ getNome()
				+ "%nRaça: "
				+ getNomeRaca()
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
				+ mod.getCarisma()
				+ "%nClasse: "
				+ getClasse();
	}

}

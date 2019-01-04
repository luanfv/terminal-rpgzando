package informações;

import classes.ClassePersonagem;

public class Personagem {
	
	private int hp, forca, destreza, inteligencia, sabedoria, constituicao, carisma;
	private String nome;

	public Personagem() {
		
	}
	
	public Personagem(int forca, int destreza, int inteligencia, int sabedoria, int constituicao, int carisma,
			String nome) {
		
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
	
	public void hpAleatorio() {
		ClassePersonagem classe = new ClassePersonagem();
		this.hp = classe.getVida();
	}

	

}

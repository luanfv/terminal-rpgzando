package informações;

public class ClassePersonagem extends RacaPersonagem {
	
	private int hp = 0, vidaLvl;
	private String classeNome;
	
	public void addClasse(String nome, int vidaLvl) {
		this.classeNome = nome;
		this.vidaLvl = vidaLvl;
	}


	public int getHp() {
		return hp;
	}


	public void setHp(int hp) {
		this.hp += hp;
	}


	public int getVidaLvl() {
		return vidaLvl;
	}


	public void setVidaLvl(int vidaLvl) {
		this.vidaLvl = vidaLvl;
	}


	public String getClasseNome() {
		return classeNome;
	}


	public void setClasseNome(String classeNome) {
		this.classeNome = classeNome;
	}


	@Override
	public String toString() {
		return "ClassePersonagem [hp=" + hp + ", vidaLvl=" + vidaLvl + ", classeNome=" + classeNome + "]";
	}
	
	
	
}
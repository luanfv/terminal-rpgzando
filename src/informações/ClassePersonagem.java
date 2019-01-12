package informações;

public class ClassePersonagem extends RacaPersonagem {
	
	private int hp = 0, vidaLvl;
	private String classeNome, pericia1, pericia2, pericia3;
	
	public void addClasse(String nome, int vidaLvl) {
		this.classeNome = nome;
		this.vidaLvl = vidaLvl;
	}
	
	public void addClasse(String nome, int vidaLvl, String op1, String op2) {
		this.classeNome = nome;
		this.vidaLvl = vidaLvl;
		this.pericia1 = op1;
		this.pericia2 = op2;
	}
	
	public void addClasse(String nome, int vidaLvl, String op1, String op2, String op3) {
		this.classeNome = nome;
		this.vidaLvl = vidaLvl;
		this.pericia1 = op1;
		this.pericia2 = op2;
		this.pericia3 = op3;
	}

	public String getPericia1() {
		return pericia1;
	}

	public void setPericia1(String pericia1) {
		this.pericia1 = pericia1;
	}

	public String getPericia2() {
		return pericia2;
	}

	public void setPericia2(String pericia2) {
		this.pericia2 = pericia2;
	}

	protected String getPericia3() {
		return pericia3;
	}

	protected void setPericia3(String pericia3) {
		this.pericia3 = pericia3;
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
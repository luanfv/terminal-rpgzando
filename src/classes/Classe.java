package classes;

public abstract class Classe {
	
	protected int vida;
	protected int vidaLvl;
	protected String nome, pericia1, pericia2, pericia3;

	public String getPericia1() {
		return pericia1;
	}

	protected void setPericia1(String pericia1) {
		this.pericia1 = pericia1;
	}

	public String getPericia2() {
		return pericia2;
	}

	protected void setPericia2(String pericia2) {
		this.pericia2 = pericia2;
	}

	public String getPericia3() {
		return pericia3;
	}

	protected void setPericia3(String pericia3) {
		this.pericia3 = pericia3;
	}

	public int getVida() {
		return vida;
	}

	protected void setVida(int vida) {
		this.vida = vida;
	}

	public int getVidaLvl() {
		return vidaLvl;
	}

	protected void setVidaLvl(int vidaLvl) {
		this.vidaLvl = vidaLvl;
	}

	public String getNome() {
		return nome;
	}

	protected void setNome(String nome) {
		this.nome = nome;
	}

	public String toString() {
		return "Classe: "
				+ getNome()
				+ "%nHP: 1D"
				+ getVidaLvl()
				+ "%n";
	}

}

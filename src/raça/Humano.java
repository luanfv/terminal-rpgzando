package raça;

public class Humano extends Raca {

	private String nome = "Humano";
	
	public String getNome() {
		return this.nome;
	}

	public void addHumano() {
		setForca(getForca() + 1);
		setDestreza(getDestreza() + 1);
		setConstituicao(getConstituicao() + 1);
		setInteligencia(getInteligencia() + 1);
		setSabedoria(getSabedoria() + 1);
		setCarisma(getCarisma() + 1);
	}
	
	public String toString() {
		return "Humano%nFOR: +" + (getForca() + 1) + "%nDES: +" + (getDestreza() + 1) + "%nCON: +"
				+ (getConstituicao() + 1) + "%nINT: +" + (getInteligencia() + 1) + "%nSAB: +" + (getSabedoria() + 1)
				+ "%nCAR: +" + (getCarisma() + 1);
	}

}

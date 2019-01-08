package raça;

public class Draconato extends Raca {

	private String nome = "Draconato";
	
	public void addDraconato() {
		setForca(getForca() + 2);
		setCarisma(getCarisma() + 1);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String toString() {
		return getNome() + "%nFOR: +" + (getForca() + 2) + "%nCAR: +" + (getCarisma() + 1);
	}

}

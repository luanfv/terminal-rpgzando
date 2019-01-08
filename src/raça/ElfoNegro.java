package raça;

public class ElfoNegro extends Elfo {
	
	private String nome = "Elfo Negro";
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void addElfoNegro() {
		addElfo();
		setCarisma(getCarisma() + 1);
	}
	
	public String toString() {
		return getNome() + "Negro%nCAR: +" + (getCarisma() + 1);
	}

}

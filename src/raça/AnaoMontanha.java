package raça;

public class AnaoMontanha extends Anao {
	
	private String nome = "Anão da Montanha";
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void addAnaoMontanha() {
		addAnao();
		setForca(getForca() + 2);
	}

	public String toString() {
		return getNome() + "%nFOR: +" + (getForca() + 2);
	}
	
}

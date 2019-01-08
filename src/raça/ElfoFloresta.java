package raça;

public class ElfoFloresta extends Elfo {
	
	private String nome = "Elfo da Floresta";
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void addElfoFloresta() {
		addElfo();
		setSabedoria(getSabedoria() + 1);
	}
	
	public String toString() {
		return getNome() + "%nSAB: +" + (getSabedoria() + 1);
	}

}

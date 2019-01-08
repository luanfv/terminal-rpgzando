package raça;

public class GnomoFloresta extends Gnomo {

	private String nome = "Gnomo da Floresta";
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void addGnomoFloresta() {
		addGnomo();
		setDestreza(getDestreza() + 1);
	}
	
	public String toString() {
		return getNome() + "%nDES: +" + (getDestreza() + 1);
	}
	
}

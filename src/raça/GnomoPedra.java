package raça;

public class GnomoPedra extends Gnomo {
	
	private String nome = "Gnomo da Pedra";
	
	public String getNome() {
		return nome;
	}

	public void addGnomoPedra() {
		addGnomo();
		setConstituicao(getConstituicao() + 1);
	}
	
	public String toString() {
		return getNome() + "%nCON: +" + (getConstituicao() + 1);
	}

}

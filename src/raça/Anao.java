package raça;

public class Anao extends Raca{
	
	public void addAnao() {
		setConstituicao(getConstituicao() + 2);
	}
	
	public String toString() {
		return "Anão%nCON: +" + (getConstituicao() + 2);
	}

}

package raça;

public class Elfo extends Raca {
	
	public void addElfo() {
		setDestreza(getDestreza() + 2);
	}

	
	public String toString() {
		return "Elfo%nDES: +" + (getDestreza() + 2);
	}

}

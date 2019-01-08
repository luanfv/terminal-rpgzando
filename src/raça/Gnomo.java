package raça;

public class Gnomo extends Raca {
	
	public void addGnomo() {
		setInteligencia(getInteligencia() + 2);
	}
	
	public String toString() {
		return "Gnomo%nINT: +" + (getInteligencia() + 2);
	}
}

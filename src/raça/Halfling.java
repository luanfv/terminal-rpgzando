package raça;

public class Halfling extends Raca{

	public void addHalfling() {
		setDestreza(getDestreza() + 2);
	}
	
	public String toString() {
		return "Halfling%nDES: +" + (getDestreza() + 2);
	}
	
}

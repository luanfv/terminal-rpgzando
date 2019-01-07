package dados;

import java.util.Random;

public class D10 {

	private int dado;
	
	public D10() {
		Random numero = new Random();
		dado = numero.nextInt(11);
		while(dado == 0)
			dado = numero.nextInt(11);
	}
	
	public int getD10() {
		return this.dado;
	}
}
package dados;

import java.util.Random;

public class D30 {
	
	private int dado;
	
	public D30() {
		Random numero = new Random();
		dado = numero.nextInt(31);
		while(dado == 0)
			dado = numero.nextInt(31);
	}
	
	public int getD30() {
		return this.dado;
	}
}

package dados;

import java.util.Random;

public class D16 {
	
	private int dado;
	
	public D16() {
		Random numero = new Random();
		dado = numero.nextInt(17);
		while(dado == 0)
			dado = numero.nextInt(17);
	}
	
	public int getD16() {
		return this.dado;
	}
}

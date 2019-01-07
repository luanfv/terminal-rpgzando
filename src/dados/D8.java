package dados;

import java.util.Random;

public class D8 {
	
	private int dado;
	
	public D8() {	
	Random numero = new Random();
	dado = numero.nextInt(9);
	while(dado == 0)
		dado = numero.nextInt(9);
	}
	
	public int getD8() {
		return this.dado;
	}
}

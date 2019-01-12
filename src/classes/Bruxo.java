package classes;


public class Bruxo extends Pericias {
	
	public Bruxo() {
		setVidaLvl(8);
		setNome("Bruxo");
	}
	
	public void addBruxo(int op1 ,int op2) {
		addPericias(op1, op2);
		System.out.println(getPericia1());
		System.out.println(getPericia2());
	}
	
	public void addPericias(int op1, int op2) {
		if(op1 == 1)
			setPericia1(lista.get(1));
		else if(op1 == 2)
			setPericia1(lista.get(4));
		else if(op1 == 3)
			setPericia1(lista.get(6));
		else if(op1 == 4)
			setPericia1(lista.get(7));
		else if(op1 == 5)
			setPericia1(lista.get(9));
		else if(op1 == 6)
			setPericia1(lista.get(12));
		else if(op1 == 7)
			setPericia1(lista.get(16));
			
		
		
		if(op2 == 1)
			setPericia2(lista.get(1));
		else if(op2 == 2)
			setPericia2(lista.get(4));
		else if(op2 == 3)
			setPericia2(lista.get(6));
		else if(op2 == 4)
			setPericia2(lista.get(7));
		else if(op2 == 5)
			setPericia2(lista.get(9));
		else if(op2 == 6)
			setPericia2(lista.get(12));
		else if(op2 == 7)
			setPericia2(lista.get(16));
	}
	
	public void listaPericias() {

			System.out.println("1-" + lista.get(1));
			System.out.println("2-" + lista.get(4));
			System.out.println("3-" + lista.get(6));
			System.out.println("4-" + lista.get(7));
			System.out.println("5-" + lista.get(9));
			System.out.println("6-" + lista.get(12));
			System.out.println("7-" + lista.get(16));
			
	}
}

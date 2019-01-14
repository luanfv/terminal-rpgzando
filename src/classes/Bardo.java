package classes;

public class Bardo extends Pericias {
	
	public Bardo() {
		setVidaLvl(8);
		setNome("Bardo");
	}
	
	public void pericia(int op1 ,int op2 ,int op3) {
		addPericias(op1, op2, op3);
		System.out.println(getPericia1());
		System.out.println(getPericia2());
		System.out.println(getPericia3());
	}
	
	public void addPericias(int op1, int op2, int op3) {
		if(op1 == 1)
			setPericia1(lista.get(0));
		else if(op1 == 2)
			setPericia1(lista.get(1));
		else if(op1 == 3)
			setPericia1(lista.get(2));
		else if(op1 == 4)
			setPericia1(lista.get(3));
		else if(op1 == 5)
			setPericia1(lista.get(4));
		else if(op1 == 6)
			setPericia1(lista.get(5));
		else if(op1 == 7)
			setPericia1(lista.get(6));
		else if(op1 == 8)
			setPericia1(lista.get(7));
		else if(op1 == 9)
			setPericia1(lista.get(8));
		else if(op1 == 10)
			setPericia1(lista.get(9));
		else if(op1 == 11)
			setPericia1(lista.get(10));
		else if(op1 == 12)
			setPericia1(lista.get(11));
		else if(op1 == 13)
			setPericia1(lista.get(12));
		else if(op1 == 14)
			setPericia1(lista.get(13));
		else if(op1 == 15)
			setPericia1(lista.get(14));
		else if(op1 == 16)
			setPericia1(lista.get(15));
		else if(op1 == 17)
			setPericia1(lista.get(16));
		else if(op1 == 18)
			setPericia1(lista.get(17));


		if(op2 == 1)
			setPericia2(lista.get(0));
		else if(op2 == 2)
			setPericia2(lista.get(1));
		else if(op2 == 3)
			setPericia2(lista.get(2));
		else if(op2 == 4)
			setPericia2(lista.get(3));
		else if(op2 == 5)
			setPericia2(lista.get(4));
		else if(op2 == 6)
			setPericia2(lista.get(5));
		else if(op2 == 7)
			setPericia2(lista.get(6));
		else if(op2 == 8)
			setPericia2(lista.get(7));
		else if(op2 == 9)
			setPericia2(lista.get(8));
		else if(op2 == 10)
			setPericia2(lista.get(9));
		else if(op2 == 11)
			setPericia2(lista.get(10));
		else if(op2 == 12)
			setPericia2(lista.get(11));
		else if(op2 == 13)
			setPericia2(lista.get(12));
		else if(op2 == 14)
			setPericia2(lista.get(13));
		else if(op2 == 15)
			setPericia2(lista.get(14));
		else if(op2 == 16)
			setPericia2(lista.get(15));
		else if(op2 == 17)
			setPericia2(lista.get(16));
		else if(op2 == 18)
			setPericia2(lista.get(17));
		
		
		if(op3 == 1)
			setPericia3(lista.get(0));
		else if(op3 == 2)
			setPericia3(lista.get(1));
		else if(op3 == 3)
			setPericia3(lista.get(2));
		else if(op3 == 4)
			setPericia3(lista.get(3));
		else if(op3 == 5)
			setPericia3(lista.get(4));
		else if(op3 == 6)
			setPericia3(lista.get(5));
		else if(op3 == 7)
			setPericia3(lista.get(6));
		else if(op3 == 8)
			setPericia3(lista.get(7));
		else if(op3 == 9)
			setPericia3(lista.get(8));
		else if(op3 == 10)
			setPericia3(lista.get(9));
		else if(op3 == 11)
			setPericia3(lista.get(10));
		else if(op3 == 12)
			setPericia3(lista.get(11));
		else if(op3 == 13)
			setPericia3(lista.get(12));
		else if(op3 == 14)
			setPericia3(lista.get(13));
		else if(op3 == 15)
			setPericia3(lista.get(14));
		else if(op3 == 16)
			setPericia3(lista.get(15));
		else if(op3 == 17)
			setPericia3(lista.get(16));
		else if(op3 == 18)
			setPericia3(lista.get(17));
	}
}

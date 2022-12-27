
public class Onibus extends Veiculo {
	private int assento;
	
public Onibus (String placa, int ano, int assento) {
	super(placa, ano);
	this.assento = assento;
}

public int getAssento(int assento) {
	return assento;
}

public void setAssento() {
	assento = assento;
}

public void exibeDados() {
	super.exibeDados();
	System.out.println("Numero de assentos: "+assento);
}

	
}

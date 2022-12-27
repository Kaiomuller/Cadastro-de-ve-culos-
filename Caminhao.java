
public class Caminhao extends Veiculo{
 private int eixos;
 
public Caminhao(String placa, int ano, int eixos) {
	super(placa, ano);
	this. eixos = eixos;
}

public int getEixos(int eixos) {
	return eixos;
}

public void setEixos() {
	eixos = eixos;
}

public void exibeDados(){
	super.exibeDados();
	System.out.print("Quantidades de eixos: "+eixos);
}
 
 
 
 
 
 
}

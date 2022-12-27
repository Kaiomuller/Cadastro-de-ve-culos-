
public class Veiculo {
	String placa;
	int ano;

public Veiculo(String placa, int ano) {
	this.placa = placa;
	this.ano = ano;
}

public  String getPlaca(String placa) {
	return placa;
}

public int getAno(int ano) {
	return ano;
}

public void setPlaca() {
	this.placa = placa;
}

public void setAno() {
	this.ano = ano;
}

public void exibeDados() {
	System.out.println("Placa do veiculo: " +placa);
	System.out.println("Ano do veiculo: "+ano);
}

}

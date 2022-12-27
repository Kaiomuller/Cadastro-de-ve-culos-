import java.util.Scanner;
public class Teste
{

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Para criar um Onibus digite 1 e Caminhao 2:");
		Veiculo objeto = null;
		
		int opcao;
		opcao = leia.nextInt();

		
		String placa;
		int ano, assentos, eixos;
		
		
		if(opcao == 1) {
			leia.nextLine();
			System.out.println("Digite o placa do onibus: ");
			placa = leia.nextLine();
			System.out.println("Digite a ano do onibus: ");
			ano = leia.nextInt();
			System.out.println("Digite a quantidade de assentos do onibus: ");
			assentos = leia.nextInt();
						
			objeto = new Onibus (placa, ano, assentos);
			System.out.println("");
			System.out.println("-- Dados do onibus --");
			System.out.println("");
			objeto.exibeDados();
		
		} else if (opcao == 2) {
			leia.nextLine();
			System.out.println("Digite o placa do caminhao: ");
			placa = leia.nextLine();
			System.out.println("Digite o ano do caminhao: ");
			ano = leia.nextInt();
			System.out.println("Digite a quantidade de eixos do caminhao: ");
			eixos = leia.nextInt();
			
			objeto = new Caminhao(placa, ano, eixos);
			System.out.println("");
			System.out.println("-- Dados do caminhao --");
			System.out.println("");
			objeto.exibeDados();

		} else {
			System.out.println("Opcao invalida!");
		}
			

	}

}

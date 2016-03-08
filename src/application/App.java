package application;
import pato.*;

public class App {

	//Poder de mudar os objetos em tempo de execucao
	
	public static void main(String[] args) {

		//pato de borracha
		System.out.println("\npato Borracha\n");
		
		Pato patoBorracha = new PatoBorracha();
		patoBorracha.grasnar();
		System.out.println("\n");
		patoBorracha.voar();
		System.out.println("\n--------------\n");
		
		
		//pato real
		
		System.out.println("\n Pato Real\n");
		Pato patoReal = new PatoReal();
		patoReal.grasnar();
		System.out.println("\n");
		patoReal.voar();
		System.out.println("\n--------------\n");
		
		//pato decoracao
		System.out.println("\nPato Decoracao\n");
		Pato patoDecoracao = new PatoDecoracao();
		patoDecoracao.grasnar();
		System.out.println("\n");
		patoDecoracao.voar();
		System.out.println("\n--------------\n");
		
		//pato cabeca vermelha
		System.out.println("\nPato de Cabeca Vermelha\n");
		Pato patoCabecaVermelha = new PatoCabecaVermelha();
		patoCabecaVermelha.grasnar();
		System.out.println("\n");
		patoCabecaVermelha.voar();
		System.out.println("\n--------------\n");
		
	}

}

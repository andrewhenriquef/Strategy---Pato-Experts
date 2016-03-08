package pato;
import interfaces.*;
//implementa as interfaces 
public abstract class Pato implements ComportamentoVoar, ComportamentoGrasnar {
	
	//cria os objetos do tipo interface
	private ComportamentoVoar comportamentoVoar;
	private ComportamentoGrasnar comportamentoGrasnar;
	

	//faz o som
	public void grasnar() {
		
		comportamentoGrasnar.grasnar();
		
	}

	//faz o tipo de voo
	public void voar() {
		comportamentoVoar.voar();
		
	}
	
	
	//seta o comportamento de voo do pato
	public void setComportamentoVoar (ComportamentoVoar cv) {

		comportamentoVoar = cv;
	
	}
	
	//seta o grasnar do pato
	public void setComportamentoGrasnar(ComportamentoGrasnar gv){
		
		comportamentoGrasnar = gv;
		
	}
}

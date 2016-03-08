package pato;
//import interfaces.*;
import comportamentosgrasnar.*;
import comportamentosvoar.NaoVoar;

public class PatoBorracha extends Pato{

	public PatoBorracha(){
		setComportamentoGrasnar(new Ruido());
		setComportamentoVoar(new NaoVoar());
	
	}
		
}

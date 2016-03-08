package pato;

import comportamentosgrasnar.Ruido;
import comportamentosvoar.VoarComAsas;

public class PatoCabecaVermelha extends Pato {
	
	public PatoCabecaVermelha(){
		setComportamentoVoar(new VoarComAsas());
		setComportamentoGrasnar(new Ruido());
		
	}
	
}

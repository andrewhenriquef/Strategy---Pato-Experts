package pato;

import comportamentosgrasnar.Grasnar;
import comportamentosvoar.VoarComAsas;

public class PatoReal extends Pato {
	
	public PatoReal(){
		setComportamentoGrasnar(new Grasnar());
		setComportamentoVoar(new VoarComAsas());
	}

}

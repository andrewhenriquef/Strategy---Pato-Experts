package pato;

import comportamentosgrasnar.GrasnarMudo;
import comportamentosvoar.NaoVoar;

public class PatoDecoracao extends Pato {
	
	public PatoDecoracao(){
		
		setComportamentoVoar(new NaoVoar());
		setComportamentoGrasnar(new GrasnarMudo());
		
		
	}

}

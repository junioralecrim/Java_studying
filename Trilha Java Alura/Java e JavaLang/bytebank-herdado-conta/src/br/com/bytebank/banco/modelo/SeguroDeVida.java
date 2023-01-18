package br.com.bytebank.banco.modelo;

import br.com.bytebank.banco.Tributavel;

public class SeguroDeVida implements Tributavel {

	@Override
	public double getValorImposto() {
		return 42;
	}

}

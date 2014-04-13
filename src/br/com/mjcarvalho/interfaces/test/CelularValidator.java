package br.com.mjcarvalho.interfaces.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class CelularValidator {

	@Test
	public void validaNonoDigitoParaEstadoDeSaoPaulo(){
		MyOwnValidator<String> validaNonoDigitoParaSp = celular -> {return (celular.length() == 9);};
		String numComNonoDigito = "982219181";
		String numSemNonoDigito = "82231123";
		assertTrue(validaNonoDigitoParaSp.isValid(numComNonoDigito));
		assertFalse(validaNonoDigitoParaSp.isValid(numSemNonoDigito));
	}
	 
}

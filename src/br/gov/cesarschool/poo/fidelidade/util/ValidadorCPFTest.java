package br.gov.cesarschool.poo.fidelidade.util;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ValidadorCPFTest {

	@Test
	public void testNull() {
		assertFalse(ValidadorCPF.isCpfValido(null));
	}
	
//	@Test
//	public void testConstrutor() {
//		assertEquals(null,new ValidadorCPF());
//	}
	
	@Test
	public void testStringVazio() {
		assertFalse(ValidadorCPF.isCpfValido(""));
	}
	
	@Test
	public void testQuantidadeDigitos() {
		assertFalse(ValidadorCPF.isCpfValido("1010101010"));
		assertFalse(ValidadorCPF.isCpfValido("121212121212"));
	}

	@Test
	public void testApenasNumeros() {
		assertFalse(ValidadorCPF.isCpfValido(" 234567891 "));
	}
	
	@Test
	public void testPrimeiroDigito() {
		assertFalse(ValidadorCPF.isCpfValido("11144477725"));
	}

	@Test
	public void testSegundoDigito() {
		assertFalse(ValidadorCPF.isCpfValido("11144477734"));
	}
	
	@Test
	public void testDigitosRepetidos() {
		assertFalse(ValidadorCPF.isCpfValido("11111111111"));
	}
}

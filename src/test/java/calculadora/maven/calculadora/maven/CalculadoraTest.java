package calculadora.maven.calculadora.maven;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.TextField;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

	Calculadora calculadora;
	Calculadora testcalc;
	

	@BeforeEach
	public void beforeEach() {
		calculadora = new Calculadora();
	}

	@Test
	void testCalculadora() {
		testcalc = new Calculadora();
	}

	@Test
	void testSuma() {
		int resultado = calculadora.suma(1, 2);
		int expected = 3;
		assertEquals(resultado, expected);
	}

	@Test
	void testResta() {
		int resultado = calculadora.resta(5, 3);
		int expected = 2;
		assertEquals(resultado, expected);
	}

	@Test
	void testMultiplicacion() {
		int resultado = calculadora.multiplicacion(4, 5);
		int expected = 20;
		assertEquals(resultado, expected);
	}

	@Test
	void testDivision() {
		int resultado = calculadora.division(50, 10);
		int expected = 5;
		assertEquals(resultado, expected);
	}
	
	

	
	
	@Test
	void testPruebaSuma() {
		calculadora.button1.doClick();
		calculadora.button2.doClick();
		calculadora.button3.doClick();
		calculadora.button4.doClick();
		calculadora.button5.doClick();
		calculadora.buttonSuma.doClick();
		calculadora.button6.doClick();
		calculadora.button7.doClick();
		calculadora.button8.doClick();
		calculadora.button9.doClick();
		calculadora.button0.doClick();
		calculadora.btnIgual.doClick();
		calculadora.btnCe.doClick();
	}
	
	@Test
	void testPruebaResta() {
		calculadora.button6.doClick();
		calculadora.button7.doClick();
		calculadora.button8.doClick();
		calculadora.button9.doClick();
		calculadora.button0.doClick();
		calculadora.buttonResta.doClick();
		calculadora.button1.doClick();
		calculadora.button2.doClick();
		calculadora.button3.doClick();
		calculadora.button4.doClick();
		calculadora.button5.doClick();
		calculadora.btnIgual.doClick();
	}
	
	@Test
	void testPruebaMultiplicacion() {
		calculadora.button6.doClick();
		calculadora.button7.doClick();
		calculadora.buttonMultiplicacion.doClick();
		calculadora.button1.doClick();
		calculadora.button2.doClick();
		calculadora.btnIgual.doClick();
	}
	
	@Test
	void testPruebaDivision() {
		calculadora.button1.doClick();
		calculadora.button0.doClick();
		calculadora.buttonDivision.doClick();
		calculadora.button2.doClick();
		calculadora.btnIgual.doClick();
	}
	

}

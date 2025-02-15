import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {
	@Test
	public void deveSomarUmMaisUm(){
	int resultado =	Calculadora.somar(1,1);
	assertEquals(2, resultado);
	}

	@Test
	public void deveSomarDoisMaisDois(){
	int resultado =	Calculadora.somar(2,2);
	assertEquals(4, resultado);
	
}

	@Test
	public void deveMutiplicarTressVezesTres(){
	int resultado =	Calculadora.multiplicar(3,3);
	assertEquals(9, resultado);
	
}
	@Test
	public void deveDividirQuatroDivididoQuatro(){
	int resultado =	Calculadora.dividir(4,4);
	assertEquals(1, resultado);
	
}
	@Test
	public void deveDividirDoisDivididoZero(){
	int resultado =	Calculadora.dividir(2,0);
	
	assertEquals(0, resultado);
	
}
	}
	
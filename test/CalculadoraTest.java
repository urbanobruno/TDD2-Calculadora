package test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.lang.Math;

import main.Calculadora;

public class CalculadoraTest {
    
    @Test
    public void testAdicao() {
        Calculadora calculadora = new Calculadora();

        int resultado = calculadora.adicao(5, 3);

        assertEquals(8, resultado);
    }

    @Test
    public void testSubtracao(){
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.subtracao(12,7);
        assertEquals(5, resultado);
    }

    @Test
    public void testDivisao(){
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.divisao(10, 2);
        assertEquals(5, resultado);
    }
    
    @Test
    public void testMultiplicacao(){
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.multiplicacao(2, 3);
        assertEquals(6, resultado);
    }

    @Test
    public void testSeno(){
        Calculadora calculadora = new Calculadora();
        Double resultado = calculadora.seno(30.0);
        assertEquals(Double.valueOf(-0.9880316240928618),resultado);
        
    }

    @Test
    public void testTangente() {
        Calculadora calc = new Calculadora();
        assertEquals(1.0, calc.tangente(45), 0.001);
    }
}
    



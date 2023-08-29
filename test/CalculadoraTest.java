package test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

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
    
}


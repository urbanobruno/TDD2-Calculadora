
package main;

import java.lang.Math;

public class Calculadora {
    
    public int adicao(int num1, int num2) {
        return num1 + num2;
    }
    
    public int subtracao(int num1, int num2) {
    	return num1 - num2;
    	
    }

    public int divisao(int num1, int num2){
        return num1 / num2;
    }

    public int multiplicacao(int num1, int num2) {
        return num1 * num2;
   }

   public Double seno(Double num){
        return Math.sin(num);
   }
}


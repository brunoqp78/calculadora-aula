package com.example.calculadoraaula;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    @Test
    void testSomarDoisInteirosCorretoLimiteSuperior() throws Exception {
        Calculadora calc = new Calculadora();
        // Arrange
        int numero1 = 100;
        int numero2 = 20;
        int resultadoEsperado = 120;

        // Act
        int resultadoObtido = calc.somar(numero1, numero2);

        // Assert
        Assertions.assertEquals(resultadoEsperado, resultadoObtido);
    }

    @Test
    void testSomarDoisInteirosCorretoLimiteInferior() throws Exception {
        Calculadora calc = new Calculadora();
        // Arrange
        int numero1 = 0;
        int numero2 = 20;
        int resultadoEsperado = 20;

        // Act
        int resultadoObtido = calc.somar(numero1, numero2);

        // Assert
        Assertions.assertEquals(resultadoEsperado, resultadoObtido);
    }

/*     @Test
    void testFalhaSomarComNumero1AcimaDoLimiteSuperior() {
        Calculadora calc = new Calculadora();
        // Arrange
        int numero1 = 101;
        int numero2 = 20;

        // Act e Assert
        Assertions.assertThrows(Exception.class, () -> {
            calc.somar(numero1, numero2);
        });
    }

    @Test
    void testFalhaSomarComNumero1AbaixoDoLimiteInferior() throws Exception {
        Calculadora calc = new Calculadora();
        // Arrange
        int numero1 = -1;
        int numero2 = 20;

        // Act e Assert
        Assertions.assertThrows(Exception.class, () -> {
            calc.somar(numero1, numero2);
        });
    } */
}

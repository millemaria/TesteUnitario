import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraSalarioTest {

    CalculadoraSalario calc = new CalculadoraSalario();
    @Test
    @DisplayName("")
    void calcularINSS() {

        double salarioAtual = calc.calcularINSS(1300);
        double salarioAtual2 = calc.calcularINSS(1500);
        double salarioAtual3 = calc.calcularINSS(3000);
        double salarioAtual4 = calc.calcularINSS(6000);

        //verificação

        Assertions.assertEquals(97.50, salarioAtual, 0.01);
        Assertions.assertEquals(115.20,salarioAtual2, 0.01);
        Assertions.assertEquals(263.06,salarioAtual3, 0.01);
        Assertions.assertEquals(665.92,salarioAtual4, 0.01);



    }
}
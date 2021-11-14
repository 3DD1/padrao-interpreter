import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {
    @Test
    void deveCalcularExpressaoComFormula() {
        Funcionario funcionario = new Funcionario();
        funcionario.setSalario(2345.76);
        funcionario.setHorasExtras(5.0);

        assertEquals(2384.51, funcionario.calcularSalario());
    }
}
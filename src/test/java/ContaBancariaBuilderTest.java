import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaBancariaBuilderTest {
    @Test
    void deveRetornarExececaoContaSemN_conta() {
        try {
            ContaBancariaBuilder contaBancariaBuilder = new ContaBancariaBuilder();
            ContaBancaria contaBancaria = contaBancariaBuilder
                    .setAgencia(1)
                    .setBanco(1)
                    .setNome("Yan")
                    .setCpf("188")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Conta invalida", e.getMessage());
        }
    }
    @Test
    void deveRetornarExececaoContaSemNome() {
        try {
            ContaBancariaBuilder contaBancariaBuilder = new ContaBancariaBuilder();
            ContaBancaria contaBancaria = contaBancariaBuilder
                    .setN_conta(12)
                    .setAgencia(1)
                    .setBanco(1)
                    .setCpf("188")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome invalido", e.getMessage());
        }
    }
    @Test
    void deveRetornarExececaoContaSemAgencia() {
        try {
            ContaBancariaBuilder contaBancariaBuilder = new ContaBancariaBuilder();
            ContaBancaria contaBancaria = contaBancariaBuilder
                    .setN_conta(12)
                    .setBanco(1)
                    .setNome("yan")
                    .setCpf("188")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Agencia invalida", e.getMessage());
        }
    }
    @Test
    void deveRetornarExececaoContaSemBanco() {
        try {
            ContaBancariaBuilder contaBancariaBuilder = new ContaBancariaBuilder();
            ContaBancaria contaBancaria = contaBancariaBuilder
                    .setN_conta(12)
                    .setAgencia(1)
                    .setNome("yan")
                    .setCpf("188")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Banco invalido", e.getMessage());
        }
    }
    @Test
    void deveRetornarExececaoContaSemCPF() {
        try {
            ContaBancariaBuilder contaBancariaBuilder = new ContaBancariaBuilder();
            ContaBancaria contaBancaria = contaBancariaBuilder
                    .setN_conta(12)
                    .setAgencia(1)
                    .setNome("yan")
                    .setBanco(1)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("CPF invalido", e.getMessage());
        }
    }
    @Test
    void deveRetornarConta() {

        ContaBancariaBuilder contaBancariaBuilder = new ContaBancariaBuilder();
        ContaBancaria contaBancaria = contaBancariaBuilder
                .setN_conta(12)
                .setAgencia(1)
                .setNome("yan")
                .setBanco(1)
                .setCpf("188")
                .build();
        assertNotNull(contaBancaria);
    }
}

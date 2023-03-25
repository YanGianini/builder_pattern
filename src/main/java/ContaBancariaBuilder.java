import java.util.Date;

public class ContaBancariaBuilder {
    private ContaBancaria contaBancaria;

    public ContaBancariaBuilder() {
        contaBancaria = new ContaBancaria();
    }

    public ContaBancaria build() {
        if (contaBancaria.getN_conta() == 0){
            throw new IllegalArgumentException("Conta invalida");
        }
        if (contaBancaria.getAgencia() == 0){
            throw new IllegalArgumentException("Agencia invalida");
        }
        if (contaBancaria.getBanco() == 0){
            throw new IllegalArgumentException("Banco invalido");
        }
        if (contaBancaria.getNome().equals("")){
            throw new IllegalArgumentException("Nome invalido");
        }
        if (contaBancaria.getCpf().equals("")){
            throw new IllegalArgumentException("CPF invalido");
        }
        return contaBancaria;
    }

    public ContaBancariaBuilder setN_conta(int n_conta) {
        contaBancaria.setN_conta(n_conta);
        return this;
    }

    public ContaBancariaBuilder setAgencia(int agencia) {
        contaBancaria.setAgencia(agencia);
        return this;
    }

    public ContaBancariaBuilder setDataNascimento(Date dataNascimento) {
        contaBancaria.setDataNascimento(dataNascimento);
        return this;
    }

    public ContaBancariaBuilder setNome(String nome) {
        contaBancaria.setNome(nome);
        return this;
    }

    public ContaBancariaBuilder setCpf(String cpf) {
        contaBancaria.setCpf(cpf);
        return this;
    }

    public ContaBancariaBuilder setRg(String rg) {
        contaBancaria.setRg(rg);
        return this;
    }

    public ContaBancariaBuilder setN_certidao_nascimento(String certidao_nascimento) {
        contaBancaria.setN_certidao_nascimento(certidao_nascimento);
        return this;
    }

    public ContaBancariaBuilder setLogradouro(String logradouro) {
        contaBancaria.setLogradouro(logradouro);
        return this;
    }

    public ContaBancariaBuilder setCep(String cep) {
        contaBancaria.setCep(cep);
        return this;
    }

    public ContaBancariaBuilder setEmail(String email) {
        contaBancaria.setEmail(email);
        return this;
    }

    public ContaBancariaBuilder setCelular(String celular) {
        contaBancaria.setCelular(celular);
        return this;
    }

    public ContaBancariaBuilder setBanco(int banco) {
        contaBancaria.setBanco(banco);
        return this;
    }
}

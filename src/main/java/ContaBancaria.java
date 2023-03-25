import java.util.Date;

public class ContaBancaria {
    private int n_conta;
    private String nome;
    private Date dataNascimento;
    private String cpf;
    private String rg;
    private String n_certidao_nascimento;
    private String logradouro;
    private String cep;
    private String email;
    private String celular;
    private int agencia;
    private int banco;


    public ContaBancaria() {
        this.n_conta = 0;
        this.agencia = 0;
        this.banco = 0;
        this.cpf ="";
        this.nome = "";
    }

    public int getN_conta() {
        return n_conta;
    }

    public void setN_conta(int n_conta) {
        this.n_conta = n_conta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getN_certidao_nascimento() {
        return n_certidao_nascimento;
    }

    public void setN_certidao_nascimento(String n_certidao_nascimento) {
        this.n_certidao_nascimento = n_certidao_nascimento;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getBanco() {
        return banco;
    }

    public void setBanco(int banco) {
        this.banco = banco;
    }

}


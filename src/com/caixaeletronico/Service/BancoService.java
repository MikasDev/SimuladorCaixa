package com.caixaeletronico.Service;
import com.caixaeletronico.model.Banco;
import com.caixaeletronico.model.Conta;

public class BancoService {
    private Banco banco;

    public BancoService(Banco banco){
        this.banco = banco;
    }

    //conta foda omaga
    public void criarConta(String cpf, Double saldo){
        Conta novaConta = new Conta(cpf,0.0);
        banco.cadastrarConta(novaConta);
    }

    public Conta buscarContaPorCpf(String cpf){
        for (int i = 0; i < banco.getContas().size(); i++) {
            if(banco.getContas().get(i).getCpf().equals(cpf)){
                return banco.getContas().get(i);
            }
        }

        throw new IllegalArgumentException("Conta não encontrada");
    }

    // sssss
    public void selecionarBanco(String nomeBanco){
        banco.verificarBanco(nomeBanco);
    }

    //deposito e saque nas contas
    public void depositarValor(String cpf, Double valor){
        Conta conta = buscarContaPorCpf(cpf);
        conta.depositar(valor);
        System.out.println("Deposito de "+ valor + "realizado com sucesso ");
    }

    public void sacarValor(String cpf, Double valor){
        Conta conta = buscarContaPorCpf(cpf);
        conta.sacar(valor);
        System.out.println("Saque de "+valor+"realizado com sucesso");
    }
}

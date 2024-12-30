package com.caixaeletronico.Service;
import com.caixaeletronico.model.Banco;
import com.caixaeletronico.model.Conta;

public class BancoService {
    private Banco banco;

    public BancoService(Banco banco){
        this.banco = banco;
    }

    public void selecionarBanco(String nomeBanco){
        banco.verificarBanco(nomeBanco);
    }

    public void criarConta(String cpf, String senha, Double saldo){
        Conta novaConta = new Conta(cpf, senha, 0.0);
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

}

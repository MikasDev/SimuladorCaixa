package com.caixaeletronico.model;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<String> nomesBancos;
    private List<Conta> contas;
    private String bancoSelecionado;

    public Banco (String bancoSelecionado){
        this.nomesBancos = new ArrayList<>(List.of(
                "Banco do Brasil",
                "Caixa Econômica",
                "Itaú",
                "Bradesco",
                "Santander"
        ));
        this.contas = new ArrayList<>();
        this.bancoSelecionado = bancoSelecionado;
    }

    //get set
    public String getBancoSelecionado(){
        return bancoSelecionado;
    }

    public void setBancoSelecionado(String bancoSelecionado){
        this.bancoSelecionado = bancoSelecionado;
    }

    public List<Conta> getContas(){
        return contas;
    }

    //metodos
    public void verificarBanco(String nome){
        for (int i = 0; i < nomesBancos.size() ; i++) {
            if(nomesBancos.get(i).equalsIgnoreCase(nome)){
                this.bancoSelecionado = nome;
            }
            else{
                throw new IllegalArgumentException("Banco Invalido");
            }
        }
    }

    public void cadastrarConta(Conta conta){
        contas.add(conta);
    }


}

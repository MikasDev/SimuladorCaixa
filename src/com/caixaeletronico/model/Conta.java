package com.caixaeletronico.model;

public class Conta {
    private String cpf;
    private String senha;
    private Double saldo;

    public Conta(String cpf, String senha, Double saldo){
        this.cpf = cpf;
        this.senha = senha;
        this.saldo = saldo;
    }

    public String getCpf(){
        return cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getSenha(){
        return senha;
    }

    public void setSenha(String senha){
        this.senha = senha;
    }

    public Double getSaldo(){
        return saldo;
    }

    public void setSenha(Double saldo){
        this.saldo = saldo;
    }
}

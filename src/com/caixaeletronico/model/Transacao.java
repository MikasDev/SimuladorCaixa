package com.caixaeletronico.model;

public class Transacao {
    private Conta conta;
    private Double valor;
    private String tipo;

    public Transacao (Conta conta, Double valor, String tipo){
        this.conta = conta;
        this.valor = valor;
        this.tipo = tipo;
    }

    public Conta getConta(){
        return conta;
    }

    public void setConta(Conta conta){
        this.conta = conta;
    }

    public Double getValor(){
        return valor;
    }

    public void setValor(Double valor){
        if(valor > 0){
            this.valor = valor;
        }
        else{
            throw new IllegalArgumentException("O valor da transação deve ser positivo");
        }
    }

    public String getTipo(){
        return tipo;
    }

    public void setTipo(String tipo){
        if(tipo.equals("deposito") || tipo.equals("saque")){
            this.tipo = tipo;
        }
        else{
            throw new IllegalArgumentException("Tipo de transação invalido");
        }
    }
}

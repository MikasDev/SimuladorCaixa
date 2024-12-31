    package com.caixaeletronico.model;

    public class Conta {
        private String cpf;
        private Double saldo;

        public Conta(String cpf,Double saldo){
            this.cpf = cpf;
            this.saldo = 0.0;
        }

        public String getCpf(){
            return cpf;
        }

        public void setCpf(String cpf){
            this.cpf = cpf;
        }

        public Double getSaldo(){
            return saldo;
        }

        //metodos
        public void depositar(Double valor){
            if(valor > 0){
                this.saldo += valor;
            }
            else{
                throw new IllegalArgumentException("O valor depositado deve ser maior que 0");
            }
        }

        public void sacar(Double valor){
            if(valor > 0){
                if(this.saldo < valor){
                    throw new IllegalArgumentException("Saldo insuficiente para realizar o saque");
                }

                this.saldo -= valor;
            }
            else{
                throw new IllegalArgumentException("O valor depositado deve ser maior que 0");
            }
        }
    }

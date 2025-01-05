package com.caixaeletronico.controller;

import com.caixaeletronico.Service.BancoService;

public class BancoController {

    private BancoService bancoService;

    public BancoController(BancoService bancoService){
        this.bancoService = bancoService;
    }

    //metodos
    public void depositarController(String cpf, Double valor){
        try{
            bancoService.depositarValor(cpf,valor);
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    public void sacarController(String cpf, Double valor){
        try{
            bancoService.sacarValor(cpf,valor);
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    public void selecionarBancoController(String nomeBanco){
        try{
            bancoService.selecionarBanco(nomeBanco);
            System.out.println(nomeBanco + "  foi selecionado");
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    public void criarContaController(String cpf, double saldo){
        try{
            bancoService.criarConta(cpf,0.0);
            System.out.println(cpf + "logado");
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }
}

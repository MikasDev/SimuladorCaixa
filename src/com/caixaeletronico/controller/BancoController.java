package com.caixaeletronico.controller;

import com.caixaeletronico.Service.BancoService;

public class BancoController {

    private BancoService bancoService;

    public BancoController(BancoService bancoService){
        this.bancoService = bancoService;
    }

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
}

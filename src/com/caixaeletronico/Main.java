package com.caixaeletronico;

import com.caixaeletronico.Service.BancoService;
import com.caixaeletronico.controller.BancoController;
import com.caixaeletronico.model.Banco;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Banco banco = new Banco(null);
        BancoService bs = new BancoService(banco);
        BancoController bc = new BancoController(bs);
        Scanner sc = new Scanner(System.in);


        System.out.println("**** Simulador ATM **** \n");
        banco.printBancos();

        System.out.println("Selecione um banco: ");
        String userBanco = sc.next();

        bc.selecionarBancoController(userBanco);
    }
}
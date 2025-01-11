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

        System.out.println("Digite seu cpf para criar sua conta");
        String cpfConta = sc.nextLine();
        bc.criarContaController(cpfConta,0.0);

        boolean sair = false;

        while(!sair){
            System.out.println("\n**** Menu ****");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Exibir saldo");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = sc.nextInt();
            sc.nextLine(); // Consumir a nova linha após o nextInt()

            switch (opcao){
                case 1:
                    System.out.println("\n Digite o valor para deposito: ");
                    double valorDeposito = sc.nextDouble();
                    sc.nextLine();
                    bc.depositarController(cpfConta,valorDeposito);

                    break;

                case 2:
                    System.out.println("\n Digite o valor para saque: ");
                    double valorSaque = sc.nextDouble();
                    sc.nextLine();
                    bc.sacarController(cpfConta,valorSaque);

                    break;

                case 3:
                    try{
                        double saldo = bs.buscarContaPorCpf(cpfConta).getSaldo();
                        System.out.println("\n Saldo atual: R$ " + saldo);
                    }
                    catch (IllegalArgumentException e){
                        System.out.println(e.getMessage());
                    }

                    break;

                case 4:
                    System.out.println("\n Encerrando programa ...");
                    sair = true;


                    break;

                default:
                    System.out.println("n Opção invalida. Tente novamente");

                    break;
            }

        }


    }
}
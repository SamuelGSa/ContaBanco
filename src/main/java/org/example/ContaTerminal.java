package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.Scanner;

public class ContaTerminal {


    public static void main(String[] args) {
        int numero;
        String agencia;
        String nomeCliente;
        float saldo;


        System.out.print("Por favor, digite o número da Agência: ");
        numero = scanner().nextInt();

        System.out.print("Por favor, digite a Agência: ");
        agencia = scanner().next();

        System.out.print("Por favor, digite o nome do CLiente: ");
        nomeCliente = scanner().next();

        System.out.print("Por favor, digite seu saldo: ");
        saldo = scanner().nextFloat();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

    }




    public static Scanner scanner(){
        return new Scanner(System.in);
    }
}

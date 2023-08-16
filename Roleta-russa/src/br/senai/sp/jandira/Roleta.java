package br.senai.sp.jandira;

import java.util.Random;
import java.util.Scanner;

public class Roleta {

    public void roleta() {
        Scanner digitar = new Scanner(System.in);
        Random aleatorio = new Random();
        System.out.println();
        System.out.println("Roleta russa!!\n" +
                "Escolha um número entre 0 e 50 para ser sorteado");
        int resposta = digitar.nextInt();

        int random = aleatorio.nextInt(51);
        System.out.println("Número gerado: " + random);

        if (random == resposta) {
            System.out.println("Parabéns!! Você acertou!!");
        } else {
            System.out.println("Que pena!! Você errou!");
        }

        System.out.println();
        System.out.println("Deseja sortear de novo? [1-sim 2-não]:");
        int sortear = digitar.nextInt();
        if (sortear == 1) {
            roleta();
        }
    }
}

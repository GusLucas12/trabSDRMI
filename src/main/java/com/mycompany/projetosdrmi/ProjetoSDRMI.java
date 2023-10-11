/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.projetosdrmi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.Naming;
import java.util.Scanner;

/**
 *
 * @author backu
 */
public class ProjetoSDRMI {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            JogoPPT game = (JogoPPT) Naming.lookup("rmi://localhost/JogoPPT");
            System.out.println("Faça sua jogada ");
            // Faça a jogada do jogador aqui
            String playerChoice = playerMovement(in); // Substitua pela escolha do jogador

            String result = game.play(playerChoice);
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String playerMovement(Scanner in) {
        String move = "oi";

        while (true) {
            System.out.println("Digite um movimento válido");
            move = in.next().toUpperCase();

            if (validandoMovimentos(move)) {
                return move;

            }
        }

    }

    private static boolean validandoMovimentos(String move) {
        String[] movimentosValidos = {"PEDRA", "PAPEL", "TESOURA"};
        for (String item : movimentosValidos) {
            if (item.equals(move)) {
                return true;
            }
        }
        return false;
    }
}

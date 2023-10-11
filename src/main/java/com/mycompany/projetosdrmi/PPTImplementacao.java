/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetosdrmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Random;

/**
 *
 * @author backu
 */
public class PPTImplementacao extends UnicastRemoteObject implements JogoPPT {

    public PPTImplementacao() throws RemoteException {
        super();
    }

    @Override
    public String play(String jogada) throws RemoteException {
        String move1 = jogada;
        String move2 = botMovement();
        
        String result = calculateResult(move1, move2);
        
        String resultFinal = ( "Jogo: "+ move1 + " X " + move2 + " \n ------------------------  \n  Final: "+result);
        return resultFinal;
    }

    private static String botMovement() {
        String move;
        String[] movimentosValidos = {"PEDRA", "PAPEL", "TESOURA"};
        Random random = new Random();
        int randomize = random.nextInt(3);

        move = movimentosValidos[randomize];
        return move;
    }

    private String calculateResult(String move1, String move2) {
        if ((move1.equals("PEDRA") && move2.equals("TESOURA"))
                || (move1.equals("TESOURA") && move2.equals("PAPEL"))
                || (move1.equals("PAPEL") && move2.equals("PEDRA"))) {

            return "PLAYER1 WINS";

        } else if ((move2.equals("PEDRA") && move1.equals("TESOURA"))
                || (move2.equals("TESOURA") && move1.equals("PAPEL"))
                || (move2.equals("PAPEL") && move1.equals("PEDRA"))) {
            return "PLAYER2 WINS";

        } else {
            return "DRAWN";
        }
    }

}

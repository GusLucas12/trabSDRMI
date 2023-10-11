/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetosdrmi;
import java.rmi.Remote;
import java.rmi.RemoteException;
/**
 *
 * @author backu
 */
public interface JogoPPT extends Remote{
    public String play(String jogada) throws RemoteException;
}

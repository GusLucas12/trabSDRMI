/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetosdrmi;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
/**
 *
 * @author backu
 */
public class ServidorRMI {
    ServidorRMI(){
        try{
        
            LocateRegistry.createRegistry(1099);
            JogoPPT p = new PPTImplementacao();
            Naming.bind("rmi://localhost/JogoPPT", p);
            System.out.println("Servidor Pronto");
        }catch( Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new ServidorRMI();
    }
}

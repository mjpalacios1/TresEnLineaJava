/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import java.net.MalformedURLException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import CapaNegocio.GestorTresEnLinea;

/**
 *
 * @author Mela
 */
public class Servidor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws RemoteException, MalformedURLException{
       
        Registry reg = LocateRegistry.createRegistry(1098);
        reg.rebind("Server", new GestorTresEnLinea());
        System.out.println("Servidor ON");
           System.out.println("Atendiendo las peticiones...");
           System.out.println("Pulse Enter para salir...");
           
    }
    
}

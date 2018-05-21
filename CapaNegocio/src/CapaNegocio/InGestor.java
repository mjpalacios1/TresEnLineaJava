/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocio;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Mela
 */
public interface InGestor extends Remote{
    void suscribir(InTresEnLinea obsTresL) throws RemoteException;
     public int jugar(int x, int y) throws RemoteException;
     public int getNumsuscritos()  throws RemoteException;
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaConsola;

import java.beans.*;
import java.io.Serializable;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import CapaNegocio.*;
import java.util.Scanner;
/**
 *
 * @author Mela
 */
public class TresEnLineaMain implements Serializable,InTresEnLinea {

    
   GestorTresEnLinea gesTresEnLinea ;
   @Override
    public void Actualiza()
        {

           iniTresLinea thLeft = new iniTresLinea();
            thLeft.start();

        }
     
        public TresEnLineaMain()
        {
            try{
            Registry registry = LocateRegistry.getRegistry();
            gesTresEnLinea = (GestorTresEnLinea) registry.lookup("Server");    
            gesTresEnLinea.suscribir(this);
            int  j;
            System.out.println("Sucrito: " + gesTresEnLinea.getNumsuscritos());
            j = gesTresEnLinea.jugar(-1, -1);
            }catch(Exception e){
                
            }
    
        }

     
   public static void main(String[]args){
       
       
       new TresEnLineaMain();
                        
        }
   

       
   }
    


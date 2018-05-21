/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaWindows;

import CapaNegocio.GestorTresEnLinea;
import java.rmi.activation.Activator;
import CapaNegocio.*;
import java.awt.Color;
import java.util.ResourceBundle.Control;
/**
 *
 * @author Labs-DECC
 */
public class iniTresLinea extends Thread{
    GestorTresEnLinea gesTresEnLinea;
    frmTresEnLinea obj=new frmTresEnLinea();
    @Override 
    public void run(){
        gesTresEnLinea = (CapaNegocio.GestorTresEnLinea)Activator.GetObject(typeof(CapaNegocio.GestorTresEnLinea), "tcp://localhost:9946/GRServer");

            dibujaMatriz(gesTresEnLinea.getMatrizTresEnLinea());

            int j;

            j = gesTresEnLinea.esTresEnLinea();
            if (j == 0)
            {
                obj.lblMensaje.setForeground(Color.red);
                obj.lblMensaje.setText("Gana 0");
            }
            else if (j == 1)
            {
                  obj.lblMensaje.setForeground(Color.red);
                obj.lblMensaje.setText("Gana X");
            }
            else if (j == -1)
            {
                if (gesTresEnLinea.getJugador() == 1)
                {
                   
                    obj.lblMensaje.setText("Juegan las 0");
                }
                else
                {
                    obj.lblMensaje.setText("Juegan las X");
                   
                }
            }
    }
    private void dibujaMatriz(int[][] matriz)
        {
            //Control.CheckForIllegalCrossThreadCalls = false;
            int cont = 0;
            for (int i = 0; i < 3; i++)
            {
                for (int j = 0; j < 3; j++)
                {
                    if (matriz[i][j] == -1)
                       obj.panel1.Controls[cont].Text = " ";
                    else if (matriz[i][j] == 0)
                       obj.panel1.Controls[cont].Text = "0";
                    else if (matriz[i][j] == 1)
                        obj.panel1.Controls[cont].Text = "X"; ;
                    cont++;
                }

            }


        }

}

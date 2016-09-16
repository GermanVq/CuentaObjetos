/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clases;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author gvega2
 */
public class Helper {
    public static void mensaje(Component ventana,String mensaje,int tipo){
       switch(tipo){
           case 1:
               JOptionPane.showConfirmDialog(ventana, mensaje,"Informacion", JOptionPane.INFORMATION_MESSAGE);
           case 2:
               JOptionPane.showConfirmDialog(ventana, mensaje,"Advertencia", JOptionPane.WARNING_MESSAGE);
           case 3:
               JOptionPane.showConfirmDialog(ventana, mensaje,"Error", JOptionPane.ERROR_MESSAGE);
               
       } 
        
    }
}

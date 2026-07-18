/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pratica;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Pratica {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Leer = new Scanner (System.in);
        int numero;
        
        numero =Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        
       if(numero < 0)
           JOptionPane.showMessageDialog(null,"[Este numero es negativo ]"+numero);
       else
          JOptionPane.showMessageDialog(null," [Este numero es positivo]"+numero);
       
            
            
    }
    
}

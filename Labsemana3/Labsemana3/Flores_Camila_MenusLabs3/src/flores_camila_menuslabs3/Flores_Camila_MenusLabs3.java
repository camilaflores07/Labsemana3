/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package flores_camila_menuslabs3;

import javax.swing.JOptionPane;

/**
 *
 * @author 50494
 */
public class Flores_Camila_MenusLabs3 {

    
    public static void main(String[] args) {
     
        
        int opcion;
        
       JOptionPane.showMessageDialog(null, "*****Menu******");
       opcion = Integer.parseInt(JOptionPane.showInputDialog("Favor seleccione una opción:\n"
        +"1. Cadena\n"
        +"2. Notas\n"
        +"3. Clases\n"
        +"4. Salir\n"));    
 
       
        int opcion;
        String caracter, cadena, ejemplos, resultado;
       
    
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Favor seleccione una opción:\n"
        +"1. Cadena\n"
        +"2. Ejemplos\n"
        +"3. Salir"));    
    switch(opcion){
        case 1: 
            cadena = JOptionPane.showInputDialog("Ingrese una cadena de caracteres; pueden ser palabras numeros, etc. ");
            JOptionPane.showMessageDialog(null,"El caracter mas repetido es:"  );
            
            break;
        case 2: 
            JOptionPane.showMessageDialog(null," Ejemplo de una cadena es: 'Piscina' ");
            JOptionPane.showMessageDialog(null," Ejemplo de una cadena es: 'Azul' ");
            JOptionPane.showMessageDialog(null," Ejemplo de una cadena es: '120553' ");
            JOptionPane.showMessageDialog(null," Ejemplo de una cadena es: 'Madrid' ");
            
           
            
            
        case 3: 
            JOptionPane.showMessageDialog(null,"Muchas gracias, saliendo del programa.... ");
            break;
            
           
    
    
    }

       
    }
    
}

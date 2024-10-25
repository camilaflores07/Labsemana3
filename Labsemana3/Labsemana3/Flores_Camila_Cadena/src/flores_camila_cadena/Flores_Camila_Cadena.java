/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package flores_camila_cadena;


import javax.swing.JOptionPane;


public class Flores_Camila_Cadena {

   
    public static void main(String[] args) {
        
        
        int opcion;
        String caracter, cadena, ejemplos, resultado, clases;
        double promedio;
        
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Favor seleccione una opción:\n"
        +"1. cadena\n"
        +"2. notas\n"
        +"3. clases"));    
       
    switch(opcion){
        case 1:
                cadena = JOptionPane.showInputDialog("Ingrese una cadena de caracteres; pueden ser palabras numeros, etc. ");
                JOptionPane.showMessageDialog(null,"El caracter mas repetido es:"  );
            break;
            
            case 2: 
                String nota1, nota2, nota3, nota4;
                nota1 = JOptionPane.showInputDialog("Ingrese su primera nota: ");
                nota1 = JOptionPane.showInputDialog("Ingrese su segunda  nota: ");
                nota1 = JOptionPane.showInputDialog("Ingrese su tercera nota: ");
                nota1 = JOptionPane.showInputDialog("Ingrese su cuarta nota: ");
                
                promedio = (nota1 + nota2 + nota3 + nota4)/4;
                
             
                
                

                    
                
                
            case 3: 
               
        }
    
    
    }
       
    
            
           
            
            
        
           
            
  
                
                
                
                

        
        
        }
        
        
        
        
        
    }
    
}

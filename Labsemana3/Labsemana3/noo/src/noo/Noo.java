/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package noo;
import javax.swing.JOptionPane;
import javax.swing.JOptionPane;

/**
 *
 * @author 50494
 */
public class Noo {


    public class MenuEjercicios {
     public static void main(String[] args) {
        int opcion;

        do {
            // Menú de opciones
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Favor seleccione una opción:\n"
                    + "1. Cadena\n"
                    + "2. Notas\n"
                    + "3. Clases\n"
                    + "4. Salir"));

            switch (opcion) {
                case 1:
                    ejercicioCadena();
                    break;
                case 2:
                    ejercicioNotas();
                    break;
                case 3:
                    // Aquí puedes agregar la lógica para el ejercicio de Clases
                    JOptionPane.showMessageDialog(null, "Ejercicio de Clases no implementado aún.");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 4);
    }

    // Ejercicio de Cadena
    private static void ejercicioCadena() {
        String cadena = JOptionPane.showInputDialog("Ingrese una cadena de caracteres: ");
        char caracterMasRepetido = '\0';
        int maxRepeticiones = 0;

        // Verificar que la cadena no sea nula o vacía
        if (cadena != null && !cadena.isEmpty()) {
            for (char c : cadena.toCharArray()) {
                int repeticiones = 0;
                for (char d : cadena.toCharArray()) {
                    if (c == d) {
                        repeticiones++;
                    }
                }
                if (repeticiones > maxRepeticiones) {
                    maxRepeticiones = repeticiones;
                    caracterMasRepetido = c;
                }
            }
            JOptionPane.showMessageDialog(null, "El carácter más repetido es: '" + caracterMasRepetido + "' con " + maxRepeticiones + " repeticiones.");
        } else {
            JOptionPane.showMessageDialog(null, "Cadena vacía. No se puede determinar el carácter más repetido.");
        }
    }

    // Ejercicio de Notas
    private static void ejercicioNotas() {
        int cantidadNotas;
        double[] notas;
        double suma = 0, notaMayor = Double.MIN_VALUE, notaMenor = Double.MAX_VALUE;

        // Solicitar cantidad de notas
        while (true) {
            cantidadNotas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de notas: "));
            if (cantidadNotas > 0) {
                break; // Salir del bucle si la cantidad es positiva
            }
            JOptionPane.showMessageDialog(null, "La cantidad de notas debe ser un valor positivo.");
        }

        notas = new double[cantidadNotas];

        for (int i = 0; i < cantidadNotas; i++) {
            while (true) {
                double nota;
                String entrada = JOptionPane.showInputDialog("Nota # " + (i + 1) + ": ");

                // Verifica si el usuario canceló el diálogo
                if (entrada == null) {
                    System.exit(0); // Salir si el usuario presiona Cancelar
                }

                try {
                    nota = Double.parseDouble(entrada); // Convierte la entrada a un double
                    if (nota >= 0 && nota <= 100) {
                        notas[i] = nota;
                        suma += nota;

                        // Actualiza nota mayor y menor
                        if (nota > notaMayor) {
                            notaMayor = nota;
                        }
                        if (nota < notaMenor) {
                            notaMenor = nota;
                        }
                        break; // Salir del bucle si la nota es válida
                    } else {
                        JOptionPane.showMessageDialog(null, "Solo acepta notas dentro del rango 0 a 100.");
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido.");
                }
            }
        }

        // Calcular el promedio
        double promedio = suma / cantidadNotas;

        // Mostrar resultados
        JOptionPane.showMessageDialog(null, String.format("Promedio: %.2f\nNota mayor: %.2f\nNota menor: %.2f", promedio, notaMayor, notaMenor));
    }
}
}


 
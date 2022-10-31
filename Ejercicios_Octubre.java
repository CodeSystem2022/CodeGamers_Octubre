/*
 Autor: Ariel Pereira
 
Ejercicio 12: Pedir un numero y calcular su factorial.
Hacerlo con los dos clases, Scanner y JOptionPane.
*/
//----------------------------------------------------
// Version con Scanner
//----------------------------------------------------

package ciclos12;

import javax.swing.JOptionPane;


public class Ejercicio12 {
    public static void main(String[] args) {
         long factorial = 1;
        
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        
        for(int i=1; i<=numero; i++) {
            factorial *=i;
        }
        JOptionPane.showMessageDialog(null, "\nEl factorial del numero ingresado es: "+factorial);
    }
}

//---------------------------------------------------------------------
// Version con JOptionPane
//----------------------------------------------------------------------
  package ciclos12;

import javax.swing.JOptionPane;


public class Ejercicio12 {
    public static void main(String[] args) {
         long factorial = 1;
        
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        
        for(int i=1; i<=numero; i++) {
            factorial *=i;
        }
        JOptionPane.showMessageDialog(null, "\nEl factorial del numero ingresado es: "+factorial);
    }
}

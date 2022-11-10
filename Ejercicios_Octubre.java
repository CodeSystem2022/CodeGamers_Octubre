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






/*
Nathalie Di Stefano

Ejercicio 11: Diseñar un programa que muestre el producto
de los 10 primeros números impares
Hacerlo con JOptionPane
*/

package ciclos11;

import javax.swing.JOptionPane;

public class Ciclos11 {
    public static void main(String[] args) {
        long producto = 1;
        for(int i = 1; i<=20;i+=2){
            producto *= i;
        }
    JOptionPane.showMessageDialog(null, "El producto de los números impares es: "+producto);
    }
}


/*
Gastón Exequiel Garay

 Ejercicio 12: Pedir un número y calcular su factorial
Hacerlo con las dos clases, Scanner y JOptionPane
 */
package ciclos12;

//import java.util.Scanner;
import javax.swing.JOptionPane;


public class Ciclos12 {
    public static void main(String[] args) {
        //Scanner entrada = new Scanner(System.in);
        long factorial = 1;
        //System.out.println("Digite un número");
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        for(int i=1; i<=numero; i++){
            factorial *= i;
        }
        //System.out.println("\nEl factorial del número ingresado es: "+factorial);
        JOptionPane.showMessageDialog(null, "el factorial del número ingresado es: "+factorial);
    }
}

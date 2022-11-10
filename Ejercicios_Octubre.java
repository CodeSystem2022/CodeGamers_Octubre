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

/*
Gastón Exequiel Garay
Encapsulamiento 
package dominio
Class Persona
*/
package dominio;

public class Persona {
    //Atributos
    private String nombre;
    private double sueldo;
    private boolean eliminado;
    
    //Constructor
    public Persona(String nombre, double sueldo, boolean eliminado){
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.eliminado = eliminado;
     }
//get&set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public boolean isEliminado() {
        return eliminado;
    }

    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }
    
    public String toString(){ //Convierte en una cadena cada atributo
        return "Persona [nombre: "+this.nombre+
                ", sueldo: "+this.sueldo+
                ", eliminado: "+this.eliminado+"]";
    }
}


/*
Gastón Exequiel Garay
Encapsulamiento 
packege test
Class PersonaPrueba
*/
package test;

import dominio.Persona;

public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Osvaldo", 57.000, false);
        System.out.println("persona1 = " + persona1);
        System.out.println("persona1 su nombre es: "+persona1.getNombre());
        //Modificamos a travé s de los métodos
        persona1.setNombre("Juan Ignacio");
        //persona1.nombre ="Juan Ignacio"; //Ya no se puede utilizar
        //System.out.println("Nombre es: "+persona1.nombre); //Error
        System.out.println("persona1 con su nombre modificado: "+persona1.getNombre());
        System.out.println("persona1 el resultado para el sueldo: "+persona1.getSueldo());
        System.out.println("persona1 para obtener el booleano: "+persona1.isEliminado());
        //Tarea: Crear otro objeto de tipo Persona, asignar valores de manera inicial
        //e imprimir, luego modificar sus valores y volver a imprimir.
        
        //System.out.println("persona1: "+persona1.toString()); No hace falta llamar al toString
        System.out.println("persona1 = " + persona1);
    }
}

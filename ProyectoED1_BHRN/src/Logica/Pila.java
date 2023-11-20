package Logica;

import Ventanas.VPrincipal;
import javax.swing.JOptionPane;
import java.awt.*;

public class Pila {
    //Atributos de la clase
    private final int[] pila;
    private int tope;
    private final int max;

    // Constructor de la pila
    public Pila(int max) {
        this.max = max; //El valor de MAX será proporcionado por el usuario
        pila = new int[max];
        tope = -1;
    }

    public void Push(int elemento) 
    {   
        if (tope == (max - 1)) {    //Primero, verificamos si la PILA está llena
            JOptionPane.showMessageDialog(null, "Desbordamiento: La pila esta llena, no se puede insertar mas elementos.");
        }
        else { //Si no lo está, TOPE aumenta en uno y se añade un elemento a la PILA
            tope++;
            pila[tope] = elemento;
            JOptionPane.showMessageDialog(null, "Elemento insertado correctamente");
        }
    }

    public void Pop()
    {
        if (tope == -1) {   //Primero, se verifica si la PILA está vacía
            JOptionPane.showMessageDialog(null, "Subdesbordamiento. La pila esta vacia, no se puede eliminar ningun elemento.");
        }
        else {  //Si no lo está, TOPE disminuye en uno y se muestra el elemento eliminado de la PILA
            int datoPop = pila[tope];
            tope--;
            JOptionPane.showMessageDialog(null, "Se realizo la eliminacion con exito. \nElemento eliminado: " + datoPop);
        }
    }

    public void Mostrar()
    {
        if (tope >= 0) {    //Para empezar, se verifica que la PILA contenga valores
            StringBuilder contenidoPila = new StringBuilder("Contenido de la pila: [ ");
            //Se recorre la pila y se añaden los valores contenidos a una variable
            for (int i = 0; i <= tope; i++) {
                contenidoPila.append(pila[i]);
                if (i < tope) {
                    contenidoPila.append(", ");
                }
            }
            contenidoPila.append("] \nTope: ").append(tope);
            JOptionPane.showMessageDialog(null, contenidoPila.toString());
        }
        else {  //Si no contiene valores, se enviará un mensaje informándolo
            JOptionPane.showMessageDialog(null, "La pila esta vacia.");
        }
    }
    
}

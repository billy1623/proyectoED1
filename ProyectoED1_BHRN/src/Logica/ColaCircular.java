package Logica;

import Ventanas.VPrincipal;
import javax.swing.JOptionPane;

 public class ColaCircular {
    //Atributos de la clase
    private final int[] cola;
    private int frente;
    private int fin;
    private final int capacidad;

    //Constructor de la cola circular
    public ColaCircular(int capacidad) {
        this.capacidad = capacidad; //Permitiremos al usuario decidir el tamaño de la cola
        this.cola = new int[capacidad];
        this.frente = -1;
        this.fin = -1;
    }

    public void agregarElemento(int elemento)
    {   //Verificamos si la cola está llena, enviando un mensaje en caso de estarlo
        if (((fin == (capacidad - 1)) && (frente == 0)) || ((fin + 1) == frente)) {
            JOptionPane.showMessageDialog(null,
                    "La cola esta llena, no se puede agregar mas elementos.",
                    "Desbordamiento!", JOptionPane.WARNING_MESSAGE);
        }

        else {  //En caso de no estar llena, se continúa con el proceso
            if (fin == (capacidad - 1)) {   //Determinamos si final apunta a la última posición del arreglo
                fin = 0;
            }
            else {  //De no ser así, final simplemente aumentará en 1
                fin++;
            }

            cola[fin] = elemento; //Se le asigna el valor deseado al elemento de la cola

            if (frente == -1) { //Determinamos si la cola estaba previamente vacía, aumentando frente en 1 de ser así
                frente = 0;
            }

            JOptionPane.showMessageDialog(null, "Se agrego un elemento exitosamente a la cola.");
        }
    }

    public void eliminarElemento()
    {
        if (frente == -1)
        {   //Verificamos si la cola está vacía, enviando un mensaje en caso de estarlo
            JOptionPane.showMessageDialog(null,
                    "La cola esta vacia, no se puede eliminar elementos.",
                    "Subdesbordamiento!", JOptionPane.WARNING_MESSAGE);
        }

        else {  //En caso de no estar vacía, se continúa con el proceso
            int elementoEliminado = cola[frente]; //Esta variable contendrá el valor del elemento eliminado
            cola[frente] = 0; //Eliminamos del arreglo (reemplazandolo con 0) el elemento al cual apuntaba frente

            if (frente == fin) { //Determinamos si la cola contenía un solo elemento, modificando frente y final de ser así
                frente = -1;
                fin = -1;
            }
            else {  //De no ser así, realiza los siguientes procesos
                if (frente == (capacidad - 1)) {    //Determinamos si frente apunta a la última posición del arreglo
                    frente = 0;
                }
                else {  //De no ser así, frente simplemente aumentará en 1
                    frente++;
                }
            }

            //Mostramos un mensaje con el elemento elminado
            JOptionPane.showMessageDialog(null, "Se elimino un elemento exitosamente de la cola. \nElemento eliminado: " + elementoEliminado);
        }
    }

    public void mostrarCola()
    {   //Primero, determinamos el estado de la cola circular
        if (frente == -1)
        {   //Si la cola está vacía, lo informará con un mensaje
            JOptionPane.showMessageDialog(null,
                    "Oh! Parece que la cola esta vacia.",
                    "Cola Circular - Estado", JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            String contenidoCola = "Cola: [ "; //Creamos una variable String que contendrá los valores de la cola

            //Recorrerá la cola y añadirá sus valores a la variable contenidoCola
            for (int i = 0; i<capacidad; i++) {
                contenidoCola += cola[i];

                if(i < (capacidad - 1)) {
                    contenidoCola += ", ";
                }
            }
            contenidoCola += "]";

            //Impresión de la cola, el frente y el final
            JOptionPane.showMessageDialog(null,
                    contenidoCola + "\nFrente: " + frente + "\nFinal: " + fin,
                    "Cola Circular - Contenido", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
}

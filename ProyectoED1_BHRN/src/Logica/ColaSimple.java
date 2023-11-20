package Logica;

import javax.swing.JOptionPane;

 
//En el siguiente paso se procede a crear la clase que decidi nombrarla Cola.
public class ColaSimple { 
//Atributos de la clase 
  private final int [] arreglo;
  private int front;
  private int end;
  private final int capacity;
  
  public ColaSimple(int capacidad) {
  	capacity = capacidad; //Es el valor maximo del arreglo
  	arreglo = new int [capacity];
  	front = -1;
  	end = -1;
  }
 

   public void insertElement (int element) {
   	//Como su nombre lo indica esta parte esta disenada para poder insertar un elemento a la cola.
		
		//Asi se incializa la cola, dandole el valor de -1 para que se entienda de que esta vacia. 
		if (front == -1) {
   		front = 0;
		}
		
		if (end<capacity - 1){
			//Incrementador
			end++;
			arreglo[end] = element;
			
			JOptionPane.showMessageDialog(null, "Elemento ha sido insertado en la cola.");
		}
   		
   		else {
   			//Error que dara si la cola esta llena
   			JOptionPane.showMessageDialog(null, "Error de desbordamiento");
   		}
        
    }
    
    public void deleteElement () {
    	
    	if (front == -1) {
    		//El mensaje que dara si la cola ya esta vacia 
    		JOptionPane.showMessageDialog(null, "La cola esta vacia. Error de subdesbordamiento.");
    	}
    	
    	else {
    		int deleteElement = arreglo[front]; //Esto guardara el elemento a eliminar
    		
    		if (front == end){
    			//Esto permitira que si solo hay un valor en la cola se reinicien los indices
    			front = -1;
    			end = -1;
    		}
    		
    		else {
    			//Con esto permite mover el indice del frente al siguiente elemento
    			front = front + 1;
    		}
			JOptionPane.showMessageDialog(null, "Se eliminó: " + deleteElement);
    		JOptionPane.showMessageDialog(null, "El elemento ha sido eliminado de la cola.");
    	}
    }
    
   public void showElement() {
        StringBuilder elementosCola = new StringBuilder("Frente: " + front + ", Final: " + end + "\n");
        elementosCola.append("Los elementos de la cola son: [");
        
        for (int i = front; i <= end; i++) {
            elementosCola.append(arreglo[i]);
            if (i != end) {
                elementosCola.append(", ");
            }
        }
        
        elementosCola.append("]");
        JOptionPane.showMessageDialog(null, elementosCola.toString());
    }
  
}


package Ventanas;

import Logica.ColaSimple;
import Logica.ColaCircular;
import Logica.Pila;
import javax.swing.JOptionPane;

public class VPrincipal1 extends javax.swing.JFrame {

    public VPrincipal1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonOpPila = new javax.swing.JButton();
        botonOpColaSimple = new javax.swing.JButton();
        botonOpColaCircular = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        botonHojaPresentacion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botonOpPila.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        botonOpPila.setText("Operaciones con pila");
        botonOpPila.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonOpPilaMouseClicked(evt);
            }
        });
        botonOpPila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOpPilaActionPerformed(evt);
            }
        });

        botonOpColaSimple.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        botonOpColaSimple.setText("Operaciones con cola simple");
        botonOpColaSimple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOpColaSimpleActionPerformed(evt);
            }
        });

        botonOpColaCircular.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        botonOpColaCircular.setText("Operaciones con cola circular");
        botonOpColaCircular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOpColaCircularActionPerformed(evt);
            }
        });

        botonSalir.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        botonSalir.setText("Salir del programa");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/utp Logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        botonHojaPresentacion.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        botonHojaPresentacion.setText("Hoja de presentacion");
        botonHojaPresentacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonHojaPresentacionActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Menu Principal");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Operaraciones con estructura de datos lineales");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fiscLogo.png"))); // NOI18N
        jLabel4.setMaximumSize(new java.awt.Dimension(128, 128));
        jLabel4.setMinimumSize(new java.awt.Dimension(128, 128));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(181, 181, 181)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(botonHojaPresentacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonOpPila, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonOpColaSimple, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonOpColaCircular, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)))
                        .addGap(66, 66, 66)
                        .addComponent(botonHojaPresentacion)
                        .addGap(39, 39, 39)
                        .addComponent(botonOpPila)
                        .addGap(39, 39, 39)
                        .addComponent(botonOpColaSimple))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(botonOpColaCircular)
                .addGap(39, 39, 39)
                .addComponent(botonSalir)
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonHojaPresentacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonHojaPresentacionActionPerformed
        HojaPresentacion nuevaVentana = new HojaPresentacion();
        
        nuevaVentana.setVisible(true);
        
        this.dispose();
        
    }//GEN-LAST:event_botonHojaPresentacionActionPerformed

    private void botonOpColaSimpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOpColaSimpleActionPerformed
        int opcion = 0;
        int capacidad;
        boolean ventana = true; 

        while (true) {
            capacidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la capacidad deseada de la cola:"));
            if (capacidad > 0) {
                break;
            } else {
                JOptionPane.showMessageDialog(null, "El valor ingresado es invalido. Ingrese un numero entero mayor a cero.");
            }
        }

        //Aqui se inicializa el constructor.
        ColaSimple obj_cola = new ColaSimple (capacidad);
        
        do {
        	try {
        	
        	 Object[] options = {"Insertar", "Eliminar", "Mostrar", "Salir"};
                
                opcion = JOptionPane.showOptionDialog(
                    null,
                    "Elige una opcion:",
                    "Menu",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options,
                    options[0]
                );
            
         	switch (opcion) {
         		
            case 0:
              		 int elementoInsertar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el elemento:"));
    				 obj_cola.insertElement(elementoInsertar); 
               		 break;
            
            case 1:
              		 obj_cola.deleteElement();
              		 break;
              		 
            case 2:
               		obj_cola.showElement();
               		break;
               		
            case 3:
               		ventana = false;
                        break;
               		
            default:
               		JOptionPane.showMessageDialog(null,"Opcion no valida, por favor ingrese una opcion valida");
              		 break;
         	} 
         } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error");
         	}
         	
      } while (ventana); 
    }//GEN-LAST:event_botonOpColaSimpleActionPerformed

    private void botonOpColaCircularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOpColaCircularActionPerformed
        int capacidadCola = 0;
        int elementoAgregar = 0;
        boolean valido = true;
        String opcion;
        boolean ventana = true;

        

        while (valido) {
            capacidadCola = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Para empezar, ingrese la capacidad deseada de la cola:",
                    "Cola Circular - Inicio", JOptionPane.QUESTION_MESSAGE));
            if (capacidadCola > 0) {
                valido = false;
            } else {
                JOptionPane.showMessageDialog(null,
                        "Error: Valor invalido, debe ingresar un nuumero entero mayor a cero. \n Por favor, intentelo nuevamente.",
                        "Ups!", JOptionPane.ERROR_MESSAGE);
            }
        }

        ColaCircular cola = new ColaCircular(capacidadCola);

        while (ventana) {
            opcion = JOptionPane.showInputDialog(null,
                    "Entendido. Que operacion desea realizar? Seleccione una opcion:\n1. Agregar elemento\n2. Eliminar elemento\n3. Mostrar cola\n4. Salir",
                    "Cola Circular - Menu de operaciones", JOptionPane.QUESTION_MESSAGE);

            switch (opcion) {
                case "1":
                    valido = true;
                    while (valido) {
                        try {
                            elementoAgregar = Integer.parseInt(JOptionPane.showInputDialog(null,
                                    "Perfecto! Ahora, ingrese el elemento a agregar a la cola. Solo aceptamos valores enteros:",
                                    "Cola Circular - Agregar elemento", JOptionPane.INFORMATION_MESSAGE));
                            valido = false;
                        } catch (NumberFormatException ex) {
                            JOptionPane.showMessageDialog(null,
                                    "Error: Valor invalido, debe ingresar un numero entero. Por favor, intentelo nuevamente.",
                                    "Ups!", JOptionPane.ERROR_MESSAGE);
                            valido = true;
                        }
                    }
                    cola.agregarElemento(elementoAgregar);
                    break;

                case "2":
                    cola.eliminarElemento();
                    break;

                case "3":
                    cola.mostrarCola();
                    break;

                case "4":
                ventana = false;
                    break;



                default:
                    JOptionPane.showMessageDialog(null,
                            "Error: Opcion no valida. Por favor, seleccione una de las opciones indicadas.",
                            "Ups!", JOptionPane.ERROR_MESSAGE);
            }
            
        }
    }//GEN-LAST:event_botonOpColaCircularActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_botonSalirActionPerformed

    private void botonOpPilaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonOpPilaMouseClicked
        
    }//GEN-LAST:event_botonOpPilaMouseClicked

    private void botonOpPilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOpPilaActionPerformed
        boolean ventana = true;
        int max = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamano maximo de la pila:"));
        Pila pila = new Pila(max);

        int opcion;

        do {
            String menu =   """
                            Menu de operaciones - Pilas
                            1. Insertar elementos a la Pila
                            2. Eliminar elementos a la Pila
                            3. Mostrar la Pila (incluye el valor de Tope)
                            4. Salir""";

            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));


            switch (opcion) {
                case 1 -> {
                    int elemento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el elemento a insertar:"));
                    pila.Push(elemento);
                }
                case 2 -> pila.Pop();
                case 3 -> pila.Mostrar();
                case 4 -> ventana = false;
                default -> JOptionPane.showMessageDialog(null, "Opcion no valida. Intentelo de nuevo.");
            }

        } while (ventana);
    }//GEN-LAST:event_botonOpPilaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonHojaPresentacion;
    private javax.swing.JButton botonOpColaCircular;
    private javax.swing.JButton botonOpColaSimple;
    private javax.swing.JButton botonOpPila;
    private javax.swing.JButton botonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class JFrameMecanico extends javax.swing.JFrame {
DefaultTableModel modelo;
   
    public JFrameMecanico() {
 initComponents();
modelo = new DefaultTableModel();
modelo.addColumn("NOMBRE");
modelo.addColumn("APELLIDO");
modelo.addColumn("CIUDAD");
modelo.addColumn("EDAD");
modelo.addColumn("SEXO");
modelo.addColumn("CARGO");

this.tabla.setModel(modelo);
}


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox2 = new javax.swing.JComboBox<>();
        botones = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        NOMBRE = new javax.swing.JTextField();
        APELLIDO = new javax.swing.JTextField();
        EDAD = new javax.swing.JTextField();
        SEXO = new javax.swing.JComboBox<>();
        GUARDAR = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        eliminartodo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        CARGO = new javax.swing.JTextField();
        CIUDAD = new javax.swing.JTextField();
        MOSTRAR = new javax.swing.JButton();

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        botones.setText("jRadioButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setFont(new java.awt.Font("Palatino Linotype", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MECANICOS");
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 3, 14)); // NOI18N
        jLabel2.setText("NOMBRE");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 3, 14)); // NOI18N
        jLabel3.setText("EDAD");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Emoji", 3, 14)); // NOI18N
        jLabel5.setText("SEXO");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 60, 20));

        jLabel6.setFont(new java.awt.Font("Segoe UI Emoji", 3, 14)); // NOI18N
        jLabel6.setText("CIUDAD");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));
        jPanel1.add(NOMBRE, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 190, -1));

        APELLIDO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                APELLIDOActionPerformed(evt);
            }
        });
        jPanel1.add(APELLIDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 190, -1));
        jPanel1.add(EDAD, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 190, -1));

        SEXO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "H", "M" }));
        SEXO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SEXOActionPerformed(evt);
            }
        });
        jPanel1.add(SEXO, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, 190, -1));

        GUARDAR.setBackground(new java.awt.Color(0, 255, 255));
        GUARDAR.setFont(new java.awt.Font("Segoe UI Black", 3, 12)); // NOI18N
        GUARDAR.setForeground(new java.awt.Color(0, 0, 102));
        GUARDAR.setText("GUARDAR");
        GUARDAR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GUARDAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GUARDARActionPerformed(evt);
            }
        });
        jPanel1.add(GUARDAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 80, 110, 40));

        eliminar.setBackground(new java.awt.Color(255, 153, 0));
        eliminar.setFont(new java.awt.Font("Segoe UI Black", 3, 12)); // NOI18N
        eliminar.setForeground(new java.awt.Color(0, 0, 102));
        eliminar.setText("ELIMINAR");
        eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        jPanel1.add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 220, 140, -1));

        eliminartodo.setBackground(new java.awt.Color(255, 51, 51));
        eliminartodo.setFont(new java.awt.Font("Segoe UI Black", 3, 12)); // NOI18N
        eliminartodo.setForeground(new java.awt.Color(0, 0, 102));
        eliminartodo.setText("ELIMINAR TODO");
        eliminartodo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminartodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminartodoActionPerformed(evt);
            }
        });
        jPanel1.add(eliminartodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 220, -1, -1));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOMBRE", "APELLIDO", "CIUDAD", "EDAD", "SEXO", "CARGO"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 1020, 570));

        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 3, 14)); // NOI18N
        jLabel4.setText("APELLIDO");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI Emoji", 3, 14)); // NOI18N
        jLabel8.setText("CARGO");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, -1, -1));
        jPanel1.add(CARGO, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 190, -1));

        CIUDAD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CIUDADActionPerformed(evt);
            }
        });
        jPanel1.add(CIUDAD, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 190, -1));

        MOSTRAR.setBackground(new java.awt.Color(0, 255, 255));
        MOSTRAR.setFont(new java.awt.Font("Segoe UI Black", 3, 12)); // NOI18N
        MOSTRAR.setForeground(new java.awt.Color(0, 0, 102));
        MOSTRAR.setText("MOSTRAR");
        MOSTRAR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MOSTRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MOSTRARActionPerformed(evt);
            }
        });
        jPanel1.add(MOSTRAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 140, 110, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eliminartodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminartodoActionPerformed
        int fila=tabla.getRowCount();
        for(int i=fila-1; i>=0; i--){
            modelo.removeRow(i);
        }
    }//GEN-LAST:event_eliminartodoActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        int fila=tabla.getSelectedRow();
        if(fila>=0){
            modelo.removeRow(fila);
        }
        else{
            JOptionPane.showMessageDialog(null,"seleccione la fila para eliminar");
        }
    }//GEN-LAST:event_eliminarActionPerformed

    private void GUARDARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GUARDARActionPerformed
        
        String nombre = NOMBRE.getText();
        String apellido = APELLIDO.getText();
        String ciudad = CIUDAD.getText();
        String edad = EDAD.getText();
        String sexo = SEXO.getSelectedItem().toString();
        String cargo = CARGO.getText();

        if (nombre.isEmpty() || apellido.isEmpty() || ciudad.isEmpty() || cargo.isEmpty()) {
            // Mostrar un mensaje de error si algún campo está vacío
            JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios.", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Salir del método sin guardar los datos
        }
        if (!edad.matches("\\d+")) {
            // Mostrar un mensaje de error si la edad no es un número válido
            JOptionPane.showMessageDialog(this, "La edad debe ser un número.", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Salir del método sin guardar los datos
        }

        int edadNumero = Integer.parseInt(edad);

        if (edadNumero < 18 || edadNumero > 100) {
            // Mostrar un mensaje de error si la edad es menor a 18
            JOptionPane.showMessageDialog(this, "La edad debe ser mayor o igual a 18.", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Salir del método sin guardar los datos
        }
        
        // Crear una cadena con los datos a guardar
        String datos = nombre + "," + apellido + "," + ciudad + "," + edad + "," + sexo +","+cargo;

        // Ruta del archivo donde se guardará la información
        String archivo = "mecanicos.txt";

        try {
            // Crear un BufferedWriter para escribir en el archivo
            BufferedWriter writer = new BufferedWriter(new FileWriter(archivo, true));

            // Escribir los datos en el archivo
            writer.write(datos);
            writer.newLine();

            // Cerrar el BufferedWriter
            writer.close();

            // Limpiar los campos de texto y restablecer los valores por defecto
            NOMBRE.setText("");
            APELLIDO.setText("");
            EDAD.setText("");
            SEXO.setSelectedIndex(0);
            CIUDAD.setText("");
            CARGO.setText("");
            
            // Mostrar un mensaje de éxito
            System.out.println("La información se ha guardado correctamente en el archivo.");
        } catch (IOException e) {
            // Mostrar un mensaje de error en caso de excepción
            System.out.println("Error al guardar la información en el archivo: " + e.getMessage());
        }
       

    }//GEN-LAST:event_GUARDARActionPerformed

    private void SEXOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SEXOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SEXOActionPerformed

    private void APELLIDOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_APELLIDOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_APELLIDOActionPerformed

    private void CIUDADActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CIUDADActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CIUDADActionPerformed

    private void MOSTRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MOSTRARActionPerformed
        // TODO add your handling code here:
         // Limpiar la tabla antes de mostrar los datos
    modelo.setRowCount(0);

    // Ruta del archivo donde se encuentra la información
    String rutaArchivo = "mecanicos.txt";

    try {
        // Leer el archivo y mostrar los datos en la tabla
        java.nio.file.Path path = java.nio.file.Paths.get(rutaArchivo);
        java.util.List<String> lines = java.nio.file.Files.readAllLines(path);

        for (String line : lines) {
            String[] datos = line.split(",");

            if (datos.length == 6) {
                modelo.addRow(datos);
            }
        }

        // Mostrar un mensaje de éxito
        System.out.println("Datos cargados correctamente desde el archivo.");
    } catch (IOException e) {
        // Mostrar un mensaje de error en caso de excepción
        System.out.println("Error al cargar los datos desde el archivo: " + e.getMessage());
    }
    }//GEN-LAST:event_MOSTRARActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrameMecanico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameMecanico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameMecanico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameMecanico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameMecanico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField APELLIDO;
    private javax.swing.JTextField CARGO;
    private javax.swing.JTextField CIUDAD;
    private javax.swing.JTextField EDAD;
    private javax.swing.JButton GUARDAR;
    private javax.swing.JButton MOSTRAR;
    private javax.swing.JTextField NOMBRE;
    private javax.swing.JComboBox<String> SEXO;
    private javax.swing.JRadioButton botones;
    private javax.swing.JButton eliminar;
    private javax.swing.JButton eliminartodo;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables




}
    
        

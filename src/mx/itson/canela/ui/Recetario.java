/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mx.itson.canela.ui;

import mx.itson.canela.entidades.Ingrediente;
import mx.itson.canela.entidades.Paso;
import mx.itson.canela.entidades.Receta;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

/**
 * Interfaz gráfica de usuario para cargar y mostrar recetas.
 *
 * @author Diego Castro Arce
 */
public class Recetario extends javax.swing.JFrame {

    /**
     * Crea una nueva instancia de la interfaz gráfica de usuario.
     */
    public Recetario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblDifLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblTiemLabel = new javax.swing.JLabel();
        lblDificultad = new javax.swing.JLabel();
        lblPorciones = new javax.swing.JLabel();
        lblTiempo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblIngredientes = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPasos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Recetas Nestle");
        setMinimumSize(new java.awt.Dimension(1200, 620));
        setResizable(false);

        lblTitulo.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        lblTitulo.setText("Titulo");

        lblDifLabel.setText("Dificultad");

        jLabel4.setText("Porciones");

        lblTiemLabel.setText("Tiempo");

        lblDificultad.setText("dificultad");

        lblPorciones.setText("porciones");

        lblTiempo.setText("tiempo");

        tblIngredientes.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                        {null},
                        {null},
                        {null},
                        {null}
                },
                new String[]{
                        "Ingredientes"
                }
        ));
        jScrollPane1.setViewportView(tblIngredientes);

        tblPasos.setAutoCreateRowSorter(true);
        tblPasos.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                        {null, null},
                        {null, null},
                        {null, null},
                        {null, null}
                },
                new String[]{
                        "Orden", "Descripcion"
                }
        ) {
            boolean[] canEdit = new boolean[]{
                    false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        tblPasos.setEnabled(false);
        tblPasos.setFocusable(false);
        tblPasos.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tblPasos);
        if (tblPasos.getColumnModel().getColumnCount() > 0) {
            tblPasos.getColumnModel().getColumn(0).setMinWidth(40);
            tblPasos.getColumnModel().getColumn(0).setPreferredWidth(60);
            tblPasos.getColumnModel().getColumn(0).setMaxWidth(60);
        }

        jLabel1.setText("Seleccione un archivo para cargar la receta");

        btnBuscar.setText("Buscar...");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel2.setText("¡A cocinar!");

        lblDescripcion.setText("Descripcion");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(191, 191, 191)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lblDifLabel)
                                                        .addComponent(lblDificultad))
                                                .addGap(313, 313, 313)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel4)
                                                        .addComponent(lblPorciones, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 278, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lblTiempo)
                                                        .addComponent(lblTiemLabel))
                                                .addGap(237, 237, 237))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblTitulo)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jScrollPane1)
                                                        .addComponent(lblDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(btnBuscar)
                                                                        .addComponent(jLabel1)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGap(560, 560, 560)
                                                                                .addComponent(jLabel2)))
                                                                .addGap(0, 0, Short.MAX_VALUE)))
                                                .addContainerGap())))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                .addComponent(lblTitulo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblDifLabel)
                                        .addComponent(jLabel4)
                                        .addComponent(lblTiemLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblDificultad)
                                        .addComponent(lblPorciones)
                                        .addComponent(lblTiempo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addGap(12, 12, 12)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // Abrimos el selector de archivos
        try {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new java.io.File(System.getProperty("user.home")));
            if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
                //Leemos el archivo seleccionado
                File archivo = fileChooser.getSelectedFile();
                byte archivoBytes[] = Files.readAllBytes(archivo.toPath());
                String contenido = new String(archivoBytes, StandardCharsets.UTF_8);

                //Convertimos el JSON a un objeto de la clase Receta
                Receta receta = new Receta().deserealizar(contenido);

                //Pasamos los atributos del objeto a los labels correspondientes
                lblTitulo.setText(receta.getNombre());
                lblDescripcion.setText(receta.getDescripcion());
                lblDifLabel.setHorizontalAlignment(SwingConstants.CENTER);
                lblDificultad.setText(receta.getDificultad().toString());
                lblPorciones.setText(String.valueOf(receta.getNumeroPorciones()));
                lblTiempo.setText(String.valueOf(receta.getTiempo()) + " MINUTOS");

                //Pasamos la lista de ingredientes a la tabla
                DefaultTableModel modeloIngredientes = (DefaultTableModel) tblIngredientes.getModel();
                modeloIngredientes.setRowCount(0);

                for (Ingrediente i : receta.getIngredientes()) {
                    modeloIngredientes.addRow(new Object[]{i.getNombre()});
                }

                //Pasamos la lista de pasos a la tabla
                DefaultTableModel modeloPasos = (DefaultTableModel) tblPasos.getModel();
                modeloPasos.setRowCount(0);

                for (Paso p : receta.getPasos()) {
                    modeloPasos.addRow(new Object[]{p.getOrden(), p.getDescripcion()});
                }

            } else {
                //No se seleccionó ningún archivo
                System.out.println("No seleccionó ningún archivo");
            }

        } catch (Exception e) {
            //Error al leer el archivo
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    /**
     * Método principal
     *
     * @param args Los argumentos de la línea de comandos
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
            java.util.logging.Logger.getLogger(Recetario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Recetario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Recetario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Recetario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Recetario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblDifLabel;
    private javax.swing.JLabel lblDificultad;
    private javax.swing.JLabel lblPorciones;
    private javax.swing.JLabel lblTiemLabel;
    private javax.swing.JLabel lblTiempo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tblIngredientes;
    private javax.swing.JTable tblPasos;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mx.itson.canela.ui;

import mx.itson.canela.entidades.Ingrediente;
import mx.itson.canela.entidades.Paso;
import mx.itson.canela.entidades.Receta;

import javax.swing.table.DefaultTableModel;

/**
 * Interfaz gráfica de usuario para cargar y mostrar recetas.
 *
 * @author Diego Castro Arce
 */
public class Recetario extends javax.swing.JDialog {

    private final String contenido;

    /**
     * Crea una nueva instancia de la interfaz gráfica de usuario.
     *
     * @param parent    El padre de la interfaz gráfica de usuario.
     * @param modal     Si la interfaz gráfica de usuario es modal.
     * @param contenido El contenido del archivo.
     */
    public Recetario(java.awt.Frame parent, boolean modal, String contenido) {
        super(parent, modal);
        this.contenido = contenido;
        initComponents();
        cargarReceta();

    }

    /**
     * Deserealiza el contenido del archivo y lo muestra en la interfaz gráfica de usuario.
     */
    public void cargarReceta() {
        try {
            //Convertimos el JSON a un objeto de tipo Receta
            Receta receta = new Receta().deserealizar(contenido);

            //Pasamos los atributos del objeto a los labels correspondientes
            lblAutor.setText(receta.getUsuario().getNombre());
            lblTitulo.setText(receta.getNombre());
            lblDescripcion.setText(receta.getDescripcion());
            lblDificultad.setText(receta.getDificultad().toString());
            lblPorciones.setText(String.valueOf(receta.getNumeroPorciones()));
            lblTiempo.setText(receta.getTiempo() + " MINUTOS");

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
        } catch (Exception e) {
            System.out.println("Error en Recetario: " + e);

        }
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
        jLabel2 = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblAutor = new javax.swing.JLabel();

        setTitle("Recetas Nestle");
        setMinimumSize(new java.awt.Dimension(1200, 620));
        setResizable(false);

        lblTitulo.setFont(new java.awt.Font("Manjari", 1, 24)); // NOI18N
        lblTitulo.setText("Titulo");

        lblDifLabel.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        lblDifLabel.setText("Dificultad");

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel4.setText("Porciones");

        lblTiemLabel.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        lblTiemLabel.setText("Tiempo");

        lblDificultad.setText("dificultad");

        lblPorciones.setText("porciones");

        lblTiempo.setText("tiempo");

        tblIngredientes.setAutoCreateRowSorter(true);
        tblIngredientes.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{

                },
                new String[]{
                        "Ingredientes"
                }
        ));
        tblIngredientes.setEnabled(false);
        tblIngredientes.setMinimumSize(null);
        tblIngredientes.setPreferredSize(null);
        tblIngredientes.setRowSelectionAllowed(false);
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
        tblPasos.setMinimumSize(null);
        tblPasos.setName(""); // NOI18N
        tblPasos.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tblPasos);
        if (tblPasos.getColumnModel().getColumnCount() > 0) {
            tblPasos.getColumnModel().getColumn(0).setMinWidth(40);
            tblPasos.getColumnModel().getColumn(0).setPreferredWidth(60);
            tblPasos.getColumnModel().getColumn(0).setMaxWidth(60);
        }

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel2.setText("¡A cocinar!");

        lblDescripcion.setFont(new java.awt.Font("Manjari", 0, 14)); // NOI18N
        lblDescripcion.setText("Descripcion");

        jLabel1.setText("Autor: ");

        lblAutor.setText("autor");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(245, 245, 245)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lblDificultad)
                                                        .addComponent(lblDifLabel))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 226, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lblPorciones, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel4))
                                                .addGap(245, 245, 245)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lblTiemLabel)
                                                        .addComponent(lblTiempo))
                                                .addGap(272, 272, 272))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jScrollPane1)
                                                        .addComponent(lblDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                                                .addGap(20, 20, 20))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel1)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(lblAutor))
                                                        .addComponent(lblTitulo))
                                                .addGap(0, 0, Short.MAX_VALUE))))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(562, 562, 562)
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblAutor)
                                        .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                                .addComponent(lblTitulo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblDescripcion)
                                .addGap(20, 20, 20)
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
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
                Recetario dialog = new Recetario(new javax.swing.JFrame(), true, null);
                dialog.addWindowListener(
                        new java.awt.event.WindowAdapter() {
                            @Override
                            public void windowClosing(java.awt.event.WindowEvent e) {
                                System.exit(0);
                            }
                        });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAutor;
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

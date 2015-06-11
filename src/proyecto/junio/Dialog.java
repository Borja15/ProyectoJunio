/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.junio;
import Clases.Categoria;
import Clases.GestionLibros;
import Clases.longitudText;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/**
 *
 * @author Borja Andrades
 */
public class Dialog extends javax.swing.JDialog {
    //Variable Libro
        Categoria libro = new Categoria();
    //Fuente para el jTextArea
        Font fuente = new Font("Verdana", Font.BOLD, 15);
    //Variables con las imagenes del proyecto
        ImageIcon imagenup = new ImageIcon(getClass().getResource("/imagenes/up.png"));
        ImageIcon imagendown = new ImageIcon(getClass().getResource("/imagenes/down.png"));
    /**
     * Creates new form Dialog
     */
    public Dialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        //Mostrar el array al abrir el jdialog
        jTextArea1.append(libro.mostrarArray());
        //Cambiarle la fuente al jTextArea y el color
        jTextArea1.setFont(fuente);
        jTextArea1.setForeground(Color.orange);
        //Insertar imagenes en los botones
        jButtonSubir.setIcon(imagenup);
        jButtonBajar.setIcon(imagendown);
        //Controlar la longitud del jTextField
        jTextFieldPosicionCategoria.setDocument(new longitudText(1));
    }

    /**
     * Metodo que mostrar un aviso antes de cerrar la aplicación avisandonos si queremos realizar esa acción
     */
    public void cerrar(){
        String [] opciones ={"Aceptar","Cancelar"};
        int eleccion = JOptionPane.showOptionDialog(rootPane,"¿Cerrar la aplicación?","Aviso",
        JOptionPane.YES_NO_OPTION,
        JOptionPane.QUESTION_MESSAGE,null,opciones,"Aceptar");
        if (eleccion == JOptionPane.YES_OPTION){
        System.exit(0);
        }else{
        }
        }  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextFieldPosicionCategoria = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButtonSubir = new javax.swing.JButton();
        jButtonBajar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setText("jDialog");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTextFieldPosicionCategoria.setMaximumSize(new java.awt.Dimension(1, 1));
        jTextFieldPosicionCategoria.setMinimumSize(new java.awt.Dimension(1, 1));

        jLabel2.setText("Elegir numeracion:");

        jButtonSubir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubirActionPerformed(evt);
            }
        });

        jButtonBajar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBajarActionPerformed(evt);
            }
        });

        jButton1.setText("Limpiar Texto");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(0, 132, Short.MAX_VALUE))
                                    .addComponent(jTextFieldPosicionCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonBajar)
                                    .addComponent(jButtonSubir))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldPosicionCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonSubir)
                        .addGap(19, 19, 19)
                        .addComponent(jButtonBajar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSubirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubirActionPerformed
        //Excepción para introducir solamente datos numericos
        //Mover la posicion del array y escribir en el jtextArea
        try {
            int indexposicion = Integer.valueOf(jTextFieldPosicionCategoria.getText());
            libro.mover(indexposicion,indexposicion-1);   
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Debes introducir un caracter numerico", "Atención", JOptionPane.WARNING_MESSAGE); 
        } 
        jTextArea1.setText("");
        jTextArea1.append(libro.ToArray());
    }//GEN-LAST:event_jButtonSubirActionPerformed

    private void jButtonBajarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBajarActionPerformed
        //Excepción para introducir solamente datos numericos
        //Mover la posicion del array y escribir en el jtextArea
        try {
            int indexposicion = Integer.valueOf(jTextFieldPosicionCategoria.getText());
            libro.mover(indexposicion,indexposicion+1);  
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Debes introducir un caracter numerico", "Atención", JOptionPane.WARNING_MESSAGE); 
        }
        jTextArea1.setText("");
        jTextArea1.append(libro.ToArray());
    }//GEN-LAST:event_jButtonBajarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        //Aplicar el metodo al cerrar la ventana
        cerrar();
    }//GEN-LAST:event_formWindowClosing

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Limpiar el textArea
        jTextArea1.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonBajar;
    private javax.swing.JButton jButtonSubir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextFieldPosicionCategoria;
    // End of variables declaration//GEN-END:variables
}

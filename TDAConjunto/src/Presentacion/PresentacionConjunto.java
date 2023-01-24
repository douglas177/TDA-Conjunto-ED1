/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Negocio.ConjuntoBits;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Estudiante
 */
public class PresentacionConjunto extends javax.swing.JFrame {
    ConjuntoBits A = new ConjuntoBits();
    ConjuntoBits B = new ConjuntoBits();
    ConjuntoBits C;
    /**
     * Creates new form PresentacionConjunto
     */
    public PresentacionConjunto() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        jPanel1 = new javax.swing.JPanel();
        InsertarA = new javax.swing.JButton();
        ValorA = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        AreaA = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        EliminarA = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        InsertarB = new javax.swing.JButton();
        ValorB = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        AreaB = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        EliminarB = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        AreaResultado = new javax.swing.JTextArea();
        Operacion = new javax.swing.JComboBox<>();
        ResultadoC = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TDA Conjunto Bits");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Conjunto A", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 20))); // NOI18N

        InsertarA.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        InsertarA.setText("Insertar");
        InsertarA.setEnabled(false);
        InsertarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertarAActionPerformed(evt);
            }
        });

        ValorA.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        ValorA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ValorAKeyReleased(evt);
            }
        });

        AreaA.setEditable(false);
        AreaA.setColumns(20);
        AreaA.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        AreaA.setRows(5);
        AreaA.setText("[ ]");
        jScrollPane1.setViewportView(AreaA);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Valor");

        EliminarA.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        EliminarA.setText("Eliminar");
        EliminarA.setEnabled(false);
        EliminarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarAActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ValorA, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(InsertarA)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(EliminarA))
                            .addComponent(jLabel2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ValorA, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InsertarA)
                    .addComponent(EliminarA))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Conjunto B", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 20))); // NOI18N

        InsertarB.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        InsertarB.setText("Insertar");
        InsertarB.setEnabled(false);
        InsertarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertarBActionPerformed(evt);
            }
        });

        ValorB.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        ValorB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ValorBKeyReleased(evt);
            }
        });

        AreaB.setEditable(false);
        AreaB.setColumns(20);
        AreaB.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        AreaB.setRows(5);
        AreaB.setText("[ ]");
        jScrollPane2.setViewportView(AreaB);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Valor");

        EliminarB.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        EliminarB.setText("Eliminar");
        EliminarB.setEnabled(false);
        EliminarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(ValorB, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(InsertarB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(EliminarB))
                            .addComponent(jLabel3)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ValorB, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InsertarB)
                    .addComponent(EliminarB))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Operaciones con Conjuntos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 20))); // NOI18N

        AreaResultado.setEditable(false);
        AreaResultado.setColumns(20);
        AreaResultado.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        AreaResultado.setRows(5);
        jScrollPane3.setViewportView(AreaResultado);

        Operacion.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        Operacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Unión  A U B", "Diferencia A - B", "Intersección A ∩ B" }));
        Operacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OperacionActionPerformed(evt);
            }
        });

        ResultadoC.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        ResultadoC.setText("Realizar operación");
        ResultadoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResultadoCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(Operacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(ResultadoC)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Operacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ResultadoC))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void Insertar(ConjuntoBits S,int valor,JTextArea area){
        S.Insertar(valor);
        area.setText(S.toString());
    }
    private void InsertarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertarAActionPerformed
        int valor = Integer.valueOf(ValorA.getText());
        Insertar(A, valor,AreaA);
        ValorA.setText("");
        Habilitar(ValorA, InsertarA);
        EliminarA.setEnabled(true);
    }//GEN-LAST:event_InsertarAActionPerformed

    private void InsertarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertarBActionPerformed
        int valor = Integer.valueOf(ValorB.getText());
        Insertar(B, valor,AreaB);
                 ValorB.setText("");
        Habilitar(ValorB, InsertarB);
        EliminarB.setEnabled(true);
    }//GEN-LAST:event_InsertarBActionPerformed
    private void Habilitar(JTextField obj, JButton boton){
          if(!obj.getText().equals("")){
              boton.setEnabled(true);
          }
          else{
              boton.setEnabled(false);
              obj.setText("");
          }
    }
    private boolean  EsNumero(String valor){
        return (valor.matches("[0-9]*"));
    }
    private void EventoValor(JTextField obj,  String fraccion, JButton boton){
      
        if((!EsNumero(obj.getText())) || (obj.getText().equals("0"))){
            JOptionPane.showMessageDialog(rootPane, "El Valor del Conjunto "+fraccion+" es Invalido");
            obj.setText("");  
        }
        
        Habilitar(obj,boton);   
    }
    private void ValorAKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ValorAKeyReleased
        EventoValor(ValorA,"A",InsertarA);
    }//GEN-LAST:event_ValorAKeyReleased

    private void ValorBKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ValorBKeyReleased
         EventoValor(ValorB,"B",InsertarB);
    }//GEN-LAST:event_ValorBKeyReleased
    private void RealizarOperacion(String operacion){
        if(operacion.equals("Unión  A U B")){
            C.union(A, B);
        }
        if(operacion.equals("Intersección A ∩ B")){
            C.intereseccion(A, B);
        }
        if(operacion.equals("Diferencia A - B")){
            C.diferencia(A, B);
        }
        AreaResultado.setText(C.toString());
    }
    private void ResultadoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResultadoCActionPerformed
        if (AreaA.getText().equals("[ ]")||AreaB.getText().equals("[ ]")) {
            JOptionPane.showMessageDialog(rootPane, "Uno de los Conjuntos no tiene valores insertados");
        }
        else{
            C = new ConjuntoBits();
            RealizarOperacion(Operacion.getSelectedItem().toString());
        }
    }//GEN-LAST:event_ResultadoCActionPerformed
    private void Eliminar(String pos, ConjuntoBits S, JTextArea area, JButton eliminar){
       if(pos!=null && pos.length()!=0 &&pos.matches("[1-9]*"))
        {
        int Valor = Integer.valueOf(pos);
        S.Eliminar(Valor);
        area.setText(S.toString());
        if(area.getText().equals("[ ]"))
            eliminar.setEnabled(false);
        }
    }
    private void EliminarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarAActionPerformed
        String x =JOptionPane.showInputDialog("Introducir el valor que desea eliminar");
        Eliminar(x ,A,AreaA,EliminarA);
    }//GEN-LAST:event_EliminarAActionPerformed

    private void EliminarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarBActionPerformed
       String x =JOptionPane.showInputDialog("Introducir el valor que desea eliminar");
        Eliminar(x ,B,AreaB,EliminarB);
    }//GEN-LAST:event_EliminarBActionPerformed

    private void OperacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OperacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OperacionActionPerformed

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
            java.util.logging.Logger.getLogger(PresentacionConjunto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PresentacionConjunto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PresentacionConjunto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PresentacionConjunto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PresentacionConjunto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AreaA;
    private javax.swing.JTextArea AreaB;
    private javax.swing.JTextArea AreaResultado;
    private javax.swing.JButton EliminarA;
    private javax.swing.JButton EliminarB;
    private javax.swing.JButton InsertarA;
    private javax.swing.JButton InsertarB;
    private javax.swing.JComboBox<String> Operacion;
    private javax.swing.JButton ResultadoC;
    private javax.swing.JTextField ValorA;
    private javax.swing.JTextField ValorB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
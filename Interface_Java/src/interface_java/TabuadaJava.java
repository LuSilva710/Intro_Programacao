/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interface_java;

/**
 *
 * @author 55319
 */
public class TabuadaJava extends javax.swing.JFrame {

    /**
     * Creates new form TabuadaJava
     */
    public TabuadaJava() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCNumeros = new javax.swing.JComboBox<>();
        jBMulti = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTTabuada = new javax.swing.JTextArea();
        jBSoma = new javax.swing.JButton();
        jBSub = new javax.swing.JButton();
        jBDiv = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tabuada ");

        jCNumeros.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jCNumeros.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9" }));

        jBMulti.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interface_java/multiply-2-16.png"))); // NOI18N
        jBMulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMult(evt);
            }
        });

        jTTabuada.setColumns(20);
        jTTabuada.setFont(new java.awt.Font("Monospaced", 0, 20)); // NOI18N
        jTTabuada.setRows(5);
        jTTabuada.setSelectionColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(jTTabuada);

        jBSoma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interface_java/plus-2-16.png"))); // NOI18N
        jBSoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSoma(evt);
            }
        });

        jBSub.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interface_java/minus-16.png"))); // NOI18N
        jBSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSub(evt);
            }
        });

        jBDiv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interface_java/divide-2-16.png"))); // NOI18N
        jBDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDiv(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCNumeros, 0, 181, Short.MAX_VALUE)
                    .addComponent(jBMulti, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBSoma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBSub, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBDiv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jCNumeros, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBSoma, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBSub, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBMulti, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBMult(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMult
        // TODO add your handling code here:
        String numString = (String) this.jCNumeros.getSelectedItem();
        int num = Integer.valueOf(numString);
        String msgTabuada="";
        for(int i=1; i <=10; i++){
            msgTabuada+=num+" x "+i+" = "+(num*i)+"\n";
        }
        this.jTTabuada.setText(msgTabuada);
    }//GEN-LAST:event_jBMult

    private void jBSoma(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSoma
        // TODO add your handling code here:
        String numString = (String) this.jCNumeros.getSelectedItem();
        int num = Integer.valueOf(numString);
        String msgTabuada="";
        for(int i=0; i <=10; i++){
            msgTabuada+=num+" + "+i+" = "+(num+i)+"\n";
        }
        this.jTTabuada.setText(msgTabuada);
    }//GEN-LAST:event_jBSoma

    private void jBSub(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSub
        // TODO add your handling code here:
        String numString = (String) this.jCNumeros.getSelectedItem();
        int num = Integer.valueOf(numString);
        String msgTabuada="";
        for(int i=num; i <=20; i++){
            msgTabuada+=i+" - "+num+" = "+(i-num)+"\n";
        }
        this.jTTabuada.setText(msgTabuada);
    }//GEN-LAST:event_jBSub

    private void jBDiv(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDiv
        // TODO add your handling code here:
         String numString = (String) this.jCNumeros.getSelectedItem();
        int num = Integer.valueOf(numString);
        String msgTabuada="";
        for(int i=1; i <=10; i++){
            msgTabuada+=+(num*i)+" / "+num+ " = "+((i*num)/num)+"\n";
        }
        this.jTTabuada.setText(msgTabuada);
    }//GEN-LAST:event_jBDiv

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
            java.util.logging.Logger.getLogger(TabuadaJava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TabuadaJava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TabuadaJava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TabuadaJava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TabuadaJava().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBDiv;
    private javax.swing.JButton jBMulti;
    private javax.swing.JButton jBSoma;
    private javax.swing.JButton jBSub;
    private javax.swing.JComboBox<String> jCNumeros;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTTabuada;
    // End of variables declaration//GEN-END:variables
}
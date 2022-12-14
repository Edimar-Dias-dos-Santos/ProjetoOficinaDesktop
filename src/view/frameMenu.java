
package view;

public class frameMenu extends javax.swing.JFrame {

    /**
     * Creates new form frameMenu
     */
    public frameMenu() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        itemVeiculo = new javax.swing.JMenu();
        itemCidade = new javax.swing.JMenuItem();
        itemMarca = new javax.swing.JMenuItem();
        itemModelo = new javax.swing.JMenuItem();
        itemProprietario = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(".:Menu Oficina:.");

        itemVeiculo.setText("Cadastros");

        itemCidade.setText("Cidade");
        itemCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCidadeActionPerformed(evt);
            }
        });
        itemVeiculo.add(itemCidade);

        itemMarca.setText("Marca");
        itemMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMarcaActionPerformed(evt);
            }
        });
        itemVeiculo.add(itemMarca);

        itemModelo.setText("Modelo");
        itemModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemModeloActionPerformed(evt);
            }
        });
        itemVeiculo.add(itemModelo);

        itemProprietario.setText("Proprietário");
        itemVeiculo.add(itemProprietario);

        jMenuItem5.setText("Veículo");
        itemVeiculo.add(jMenuItem5);

        jMenuBar1.add(itemVeiculo);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 701, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 492, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void itemCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCidadeActionPerformed
        // TODO add your handling code here:
        new dialogCidade(this, true).setVisible(true);
    }//GEN-LAST:event_itemCidadeActionPerformed

    private void itemMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMarcaActionPerformed
        // TODO add your handling code here:
        new dialogMarca(this, true).setVisible(true);
    }//GEN-LAST:event_itemMarcaActionPerformed

    private void itemModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemModeloActionPerformed
        // TODO add your handling code here:
        new dialogModelo(this, true).setVisible(true);
    }//GEN-LAST:event_itemModeloActionPerformed

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
            java.util.logging.Logger.getLogger(frameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frameMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itemCidade;
    private javax.swing.JMenuItem itemMarca;
    private javax.swing.JMenuItem itemModelo;
    private javax.swing.JMenuItem itemProprietario;
    private javax.swing.JMenu itemVeiculo;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem5;
    // End of variables declaration//GEN-END:variables
}

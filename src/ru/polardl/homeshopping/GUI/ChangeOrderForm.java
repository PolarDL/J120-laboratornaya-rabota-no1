package ru.polardl.homeshopping.GUI;

import javax.swing.JFrame;

public class ChangeOrderForm extends javax.swing.JFrame {

    /**
     * Creates new form ChangeOrderForm
     */
    public ChangeOrderForm() {
        initComponents();
        setTitle("Changing Order");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        changeOrder = new javax.swing.JLabel();
        setDiscount = new javax.swing.JLabel();
        setOrderState = new javax.swing.JLabel();
        deleteItem = new javax.swing.JLabel();
        changeItem = new javax.swing.JLabel();
        itemNumberToChangeInput = new javax.swing.JTextField();
        itemNewQuantity = new javax.swing.JLabel();
        itemNewQuantityInput = new javax.swing.JTextField();
        discountInput = new javax.swing.JTextField();
        orderStateInput = new javax.swing.JTextField();
        itemToDeleteIDInput = new javax.swing.JTextField();
        setDiscountBtn = new javax.swing.JButton();
        setOrderStateBtn = new javax.swing.JButton();
        deleteItemBtn = new javax.swing.JButton();
        changeItemQuantityBtn = new javax.swing.JButton();
        deleteOrder = new javax.swing.JLabel();
        deleteOrderBtn = new javax.swing.JButton();
        orderIDOutput = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        changeOrder.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        changeOrder.setText("Changing Order #");

        setDiscount.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        setDiscount.setText("set Discount to");

        setOrderState.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        setOrderState.setText("set Order State to");

        deleteItem.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        deleteItem.setText("delete Item #");

        changeItem.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        changeItem.setText("change Item #");

        itemNewQuantity.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        itemNewQuantity.setText("quantity to");

        setDiscountBtn.setText("OK");

        setOrderStateBtn.setText("OK");

        deleteItemBtn.setText("OK");

        changeItemQuantityBtn.setText("OK");

        deleteOrder.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        deleteOrder.setText("delete Order");

        deleteOrderBtn.setText("OK");

        orderIDOutput.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(deleteOrder)
                            .addGap(151, 151, 151)
                            .addComponent(deleteOrderBtn))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(setOrderState)
                                .addComponent(setDiscount)
                                .addComponent(deleteItem))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(itemToDeleteIDInput, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(deleteItemBtn))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(discountInput, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(orderStateInput, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(setOrderStateBtn, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(setDiscountBtn, javax.swing.GroupLayout.Alignment.TRAILING)))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(changeItem)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(itemNumberToChangeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(itemNewQuantity)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(itemNewQuantityInput, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(changeItemQuantityBtn)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(changeOrder)
                        .addGap(18, 18, 18)
                        .addComponent(orderIDOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(changeOrder)
                    .addComponent(orderIDOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(setDiscount)
                    .addComponent(discountInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(setDiscountBtn))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(setOrderState)
                    .addComponent(orderStateInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(setOrderStateBtn))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteItem)
                    .addComponent(itemToDeleteIDInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteItemBtn))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(changeItem)
                    .addComponent(itemNumberToChangeInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemNewQuantity)
                    .addComponent(itemNewQuantityInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(changeItemQuantityBtn))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteOrder)
                    .addComponent(deleteOrderBtn))
                .addContainerGap(46, Short.MAX_VALUE))
        );

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
            java.util.logging.Logger.getLogger(ChangeOrderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangeOrderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangeOrderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangeOrderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangeOrderForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel changeItem;
    private javax.swing.JButton changeItemQuantityBtn;
    private javax.swing.JLabel changeOrder;
    private javax.swing.JLabel deleteItem;
    private javax.swing.JButton deleteItemBtn;
    private javax.swing.JLabel deleteOrder;
    private javax.swing.JButton deleteOrderBtn;
    private javax.swing.JTextField discountInput;
    private javax.swing.JLabel itemNewQuantity;
    private javax.swing.JTextField itemNewQuantityInput;
    private javax.swing.JTextField itemNumberToChangeInput;
    private javax.swing.JTextField itemToDeleteIDInput;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField orderIDOutput;
    private javax.swing.JTextField orderStateInput;
    private javax.swing.JLabel setDiscount;
    private javax.swing.JButton setDiscountBtn;
    private javax.swing.JLabel setOrderState;
    private javax.swing.JButton setOrderStateBtn;
    // End of variables declaration//GEN-END:variables
}
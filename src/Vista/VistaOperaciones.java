/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Saul
 */
public class VistaOperaciones extends javax.swing.JFrame {

    /**
     * Creates new form VistaOperaciones
     */
    public VistaOperaciones() {
        initComponents();
    }

    public JButton getBtnborrar() {
        return btnborrar;
    }

    public void setBtnborrar(JButton btnborrar) {
        this.btnborrar = btnborrar;
    }

    public JButton getBtndiv() {
        return btndiv;
    }

    public void setBtndiv(JButton btndiv) {
        this.btndiv = btndiv;
    }

    public JButton getBtnmas() {
        return btnmas;
    }

    public void setBtnmas(JButton btnmas) {
        this.btnmas = btnmas;
    }

    public JButton getBtnmult() {
        return btnmult;
    }

    public void setBtnmult(JButton btnmult) {
        this.btnmult = btnmult;
    }

    public JButton getBtnres() {
        return btnres;
    }

    public void setBtnres(JButton btnres) {
        this.btnres = btnres;
    }

    public JTextField getTxtprimero() {
        return txtprimero;
    }

    public void setTxtprimero(JTextField txtprimero) {
        this.txtprimero = txtprimero;
    }

    public JTextArea getTxtrespuesta() {
        return txtrespuesta;
    }

    public void setTxtrespuesta(JTextArea txtrespuesta) {
        this.txtrespuesta = txtrespuesta;
    }

    public JTextField getTxtsegundo() {
        return txtsegundo;
    }

    public void setTxtsegundo(JTextField txtsegundo) {
        this.txtsegundo = txtsegundo;
    }

    
    public JButton getBtnvolver() {
        return btnvolver;
    }

    public void setBtnvolver(JButton btnvolver) {
        this.btnvolver = btnvolver;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnborrar = new javax.swing.JButton();
        btndiv = new javax.swing.JButton();
        btnmult = new javax.swing.JButton();
        btnres = new javax.swing.JButton();
        btnmas = new javax.swing.JButton();
        btnvolver = new javax.swing.JButton();
        txtprimero = new javax.swing.JTextField();
        txtsegundo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtrespuesta = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        btnborrar.setBackground(new java.awt.Color(0, 204, 204));
        btnborrar.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        btnborrar.setText("C");
        btnborrar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 2, true));

        btndiv.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        btndiv.setForeground(new java.awt.Color(0, 204, 204));
        btndiv.setText("÷");
        btndiv.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 2, true));
        btndiv.setContentAreaFilled(false);

        btnmult.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        btnmult.setForeground(new java.awt.Color(0, 204, 204));
        btnmult.setText("×");
        btnmult.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 2, true));
        btnmult.setContentAreaFilled(false);

        btnres.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        btnres.setForeground(new java.awt.Color(0, 204, 204));
        btnres.setText("-");
        btnres.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 2, true));
        btnres.setContentAreaFilled(false);

        btnmas.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        btnmas.setForeground(new java.awt.Color(0, 204, 204));
        btnmas.setText("+");
        btnmas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 2, true));
        btnmas.setContentAreaFilled(false);

        btnvolver.setText("Volver");

        txtprimero.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 204, 204)));

        txtsegundo.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 204, 204)));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ingrese el primer valor");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ingrese el segundo valor");

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        txtrespuesta.setEditable(false);
        txtrespuesta.setBackground(new java.awt.Color(0, 0, 0));
        txtrespuesta.setColumns(20);
        txtrespuesta.setForeground(new java.awt.Color(0, 204, 204));
        txtrespuesta.setLineWrap(true);
        txtrespuesta.setRows(5);
        txtrespuesta.setWrapStyleWord(true);
        txtrespuesta.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 1, true));
        jScrollPane2.setViewportView(txtrespuesta);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnvolver)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnborrar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btndiv, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnmult, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnres, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnmas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtsegundo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                        .addComponent(txtprimero, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnvolver)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtprimero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel2)
                        .addGap(4, 4, 4)
                        .addComponent(txtsegundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnborrar)
                    .addComponent(btndiv)
                    .addComponent(btnmult)
                    .addComponent(btnres)
                    .addComponent(btnmas))
                .addGap(111, 111, 111))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnborrar;
    private javax.swing.JButton btndiv;
    private javax.swing.JButton btnmas;
    private javax.swing.JButton btnmult;
    private javax.swing.JButton btnres;
    private javax.swing.JButton btnvolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtprimero;
    private javax.swing.JTextArea txtrespuesta;
    private javax.swing.JTextField txtsegundo;
    // End of variables declaration//GEN-END:variables
}

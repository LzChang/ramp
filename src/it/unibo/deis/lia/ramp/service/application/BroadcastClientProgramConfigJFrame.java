/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * BroadcastClientProgramConfigJFrame.java
 *
 * Created on 22-mar-2010, 11.49.09
 */

package it.unibo.deis.lia.ramp.service.application;

/**
 *
 * @author useruser
 */
public class BroadcastClientProgramConfigJFrame extends javax.swing.JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BroadcastClient.BroadcastClientProgramHandler programHandler;

    /** Creates new form BroadcastClientProgramConfigJFrame */
    public BroadcastClientProgramConfigJFrame(BroadcastClient.BroadcastClientProgramHandler programHandler) {
        initComponents();
        
        this.programHandler = programHandler;
        this.jButtonRefreshParametersActionPerformed(null);
        jCheckBoxDynamicClientActionPerformed(null);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButtonSetParameters = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldRtpIn = new javax.swing.JTextField();
        jTextFieldPdvIn = new javax.swing.JTextField();
        jTextFieldRtpDe = new javax.swing.JTextField();
        jTextFieldPdvDe = new javax.swing.JTextField();
        jButtonIncrease = new javax.swing.JButton();
        jButtonDecrease = new javax.swing.JButton();
        jCheckBoxManualQualityMonitor = new javax.swing.JCheckBox();
        jButtonRefreshParameters = new javax.swing.JButton();
        jCheckBoxDynamicClient = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldSplitterAmount = new javax.swing.JTextField();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButtonSetParameters.setText("set parameters");
        jButtonSetParameters.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSetParametersActionPerformed(evt);
            }
        });

        jLabel2.setText("if ( rtpRatio <");

        jLabel3.setText("&&  pdv <");

        jLabel4.setText(") ==> Increase Quality");

        jLabel5.setText(" ||   pdv >");

        jLabel6.setText(") ==> Decrease Quality");

        jLabel7.setText("if ( rtpRatio >");

        jTextFieldRtpIn.setColumns(4);
        jTextFieldRtpIn.setText(".....");
        jTextFieldRtpIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRtpInActionPerformed(evt);
            }
        });

        jTextFieldPdvIn.setColumns(4);
        jTextFieldPdvIn.setText(".....");

        jTextFieldRtpDe.setColumns(4);
        jTextFieldRtpDe.setText(".....");
        jTextFieldRtpDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRtpDeActionPerformed(evt);
            }
        });

        jTextFieldPdvDe.setColumns(4);
        jTextFieldPdvDe.setText(".....");

        jButtonIncrease.setText("Increase");
        jButtonIncrease.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIncreaseActionPerformed(evt);
            }
        });

        jButtonDecrease.setText("Decrease");
        jButtonDecrease.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDecreaseActionPerformed(evt);
            }
        });

        jCheckBoxManualQualityMonitor.setText("manual quality monitor");
        jCheckBoxManualQualityMonitor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxManualQualityMonitorActionPerformed(evt);
            }
        });

        jButtonRefreshParameters.setText("refresh parameters");
        jButtonRefreshParameters.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRefreshParametersActionPerformed(evt);
            }
        });

        jCheckBoxDynamicClient.setSelected(true);
        jCheckBoxDynamicClient.setText("dynamic client");
        jCheckBoxDynamicClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxDynamicClientActionPerformed(evt);
            }
        });

        jLabel8.setText("splitterAmount =");

        jTextFieldSplitterAmount.setColumns(4);
        jTextFieldSplitterAmount.setEditable(false);
        jTextFieldSplitterAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSplitterAmountActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldRtpIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldPdvIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jCheckBoxManualQualityMonitor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonIncrease)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonDecrease))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jCheckBoxDynamicClient)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldSplitterAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButtonSetParameters, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldRtpDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldPdvDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6))
                            .addComponent(jButtonRefreshParameters, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldRtpIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPdvIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldRtpDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldPdvDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonSetParameters)
                    .addComponent(jButtonRefreshParameters))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonIncrease)
                    .addComponent(jButtonDecrease)
                    .addComponent(jCheckBoxManualQualityMonitor))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxDynamicClient)
                    .addComponent(jTextFieldSplitterAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSetParametersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSetParametersActionPerformed
        programHandler.rtpIn = Float.parseFloat(this.jTextFieldRtpIn.getText());
        programHandler.rtpDe = Float.parseFloat(this.jTextFieldRtpDe.getText());
        programHandler.pdvIn = Float.parseFloat(this.jTextFieldPdvIn.getText());
        programHandler.pdvDe = Float.parseFloat(this.jTextFieldPdvDe.getText());
    }//GEN-LAST:event_jButtonSetParametersActionPerformed

    private void jTextFieldRtpInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRtpInActionPerformed
        // do nothing...
    }//GEN-LAST:event_jTextFieldRtpInActionPerformed

    private void jTextFieldRtpDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRtpDeActionPerformed
        // do nothing...
    }//GEN-LAST:event_jTextFieldRtpDeActionPerformed

    private void jButtonIncreaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIncreaseActionPerformed
        try{
            programHandler.sendMessageToServiceHandler("+0.5F");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButtonIncreaseActionPerformed

    private void jButtonDecreaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDecreaseActionPerformed
        try{
            programHandler.sendMessageToServiceHandler("-1.0F");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButtonDecreaseActionPerformed

    private void jCheckBoxManualQualityMonitorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxManualQualityMonitorActionPerformed
        boolean selected = this.jCheckBoxManualQualityMonitor.getModel().isSelected();
        if(selected){
            programHandler.enableManualQualityMonitor();
        }
        else{
            programHandler.disableManualQualityMonitor();
        }
    }//GEN-LAST:event_jCheckBoxManualQualityMonitorActionPerformed

    private void jButtonRefreshParametersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRefreshParametersActionPerformed
        this.jTextFieldRtpIn.setText(""+programHandler.rtpIn);
        this.jTextFieldRtpDe.setText(""+programHandler.rtpDe);
        this.jTextFieldPdvIn.setText(""+programHandler.pdvIn);
        this.jTextFieldPdvDe.setText(""+programHandler.pdvDe);
        this.jTextFieldSplitterAmount.setText(""+programHandler.getSplitterAmount());
    }//GEN-LAST:event_jButtonRefreshParametersActionPerformed

    private void jCheckBoxDynamicClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxDynamicClientActionPerformed
        boolean selected = this.jCheckBoxDynamicClient.getModel().isSelected();
        if(selected){
            programHandler.enableDynamicClient();
        } else{
            programHandler.disableDynamicClient();
        }
}//GEN-LAST:event_jCheckBoxDynamicClientActionPerformed

    private void jTextFieldSplitterAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSplitterAmountActionPerformed
        // do nothing
    }//GEN-LAST:event_jTextFieldSplitterAmountActionPerformed
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDecrease;
    private javax.swing.JButton jButtonIncrease;
    private javax.swing.JButton jButtonRefreshParameters;
    private javax.swing.JButton jButtonSetParameters;
    private javax.swing.JCheckBox jCheckBoxDynamicClient;
    private javax.swing.JCheckBox jCheckBoxManualQualityMonitor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextFieldPdvDe;
    private javax.swing.JTextField jTextFieldPdvIn;
    private javax.swing.JTextField jTextFieldRtpDe;
    private javax.swing.JTextField jTextFieldRtpIn;
    private javax.swing.JTextField jTextFieldSplitterAmount;
    // End of variables declaration//GEN-END:variables

}

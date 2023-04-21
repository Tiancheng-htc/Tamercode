package org.jsshbroadcast.ui.gui;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import org.jsshbroadcast.Config;
import org.jsshbroadcast.SysConfig;

/**
 *
 * @author Eduardo Folly
 */
public class JanelaOpcoes extends javax.swing.JDialog {

    private Config config = SysConfig.getInstance();

    public JanelaOpcoes(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        CampoPastaPadrao.setText(config.getDirXMLServ());
        SpinnerSSHTimeOut.getModel().setValue(config.getSshTimeOut());
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {
        BotaoFechar = new javax.swing.JButton();
        BotaoAplicar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        CampoPastaPadrao = new javax.swing.JTextField();
        atuPastaXMLServ = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        SpinnerSSHTimeOut = new javax.swing.JSpinner();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Opções");
        setResizable(false);
        BotaoFechar.setText("Fechar");
        BotaoFechar.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoFecharActionPerformed(evt);
            }
        });
        BotaoAplicar.setText("Aplicar");
        BotaoAplicar.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoAplicarActionPerformed(evt);
            }
        });
        jLabel1.setText("Pasta padrão:");
        CampoPastaPadrao.setEditable(false);
        atuPastaXMLServ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/jsshbroadcast/images/folder.png")));
        atuPastaXMLServ.setToolTipText("Localizar");
        atuPastaXMLServ.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        atuPastaXMLServ.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atuPastaXMLServActionPerformed(evt);
            }
        });
        jLabel2.setText("Tempo de Espera do SSH:");
        SpinnerSSHTimeOut.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(300), Integer.valueOf(10), null, Integer.valueOf(1)));
        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING).add(layout.createSequentialGroup().addContainerGap().add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING).add(layout.createSequentialGroup().add(jLabel1).addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED).add(CampoPastaPadrao, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 356, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE).add(7, 7, 7).add(atuPastaXMLServ)).add(layout.createSequentialGroup().add(jLabel2).addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED).add(SpinnerSSHTimeOut, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 73, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))).addContainerGap()).add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup().addContainerGap(332, Short.MAX_VALUE).add(BotaoAplicar).addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED).add(BotaoFechar).addContainerGap()));
        layout.setVerticalGroup(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING).add(layout.createSequentialGroup().addContainerGap().add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE).add(CampoPastaPadrao, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE).add(atuPastaXMLServ).add(jLabel1)).add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING).add(layout.createSequentialGroup().addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED).add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE).add(jLabel2).add(SpinnerSSHTimeOut, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)).addContainerGap(52, Short.MAX_VALUE)).add(layout.createSequentialGroup().addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED).add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE).add(BotaoFechar).add(BotaoAplicar)).addContainerGap()))));
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width - 522) / 2, (screenSize.height - 158) / 2, 522, 158);
    }

    private void atuPastaXMLServActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            AlterarLAF laf = new AlterarLAF();
            laf.setOsLAF();
            JFileChooser jfcDiretorio = new JFileChooser();
            jfcDiretorio.setDialogTitle("Escolha a pasta padrão:");
            jfcDiretorio.setCurrentDirectory(new File(CampoPastaPadrao.getText()));
            int result = jfcDiretorio.showOpenDialog(new javax.swing.JFrame());
            laf.restoreLAF();
            if (result == 0) {
                CampoPastaPadrao.setText(jfcDiretorio.getCurrentDirectory().toString());
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    private void BotaoFecharActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
    }

    private void BotaoAplicarActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            config.setDirXMLServ(CampoPastaPadrao.getText());
            config.setSshTimeOut(Integer.parseInt(SpinnerSSHTimeOut.getModel().getValue().toString()));
            config.Salvar();
            JOptionPane.showMessageDialog(this, "Configurações Salvas");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private javax.swing.JButton BotaoAplicar;

    private javax.swing.JButton BotaoFechar;

    private javax.swing.JTextField CampoPastaPadrao;

    private javax.swing.JSpinner SpinnerSSHTimeOut;

    private javax.swing.JButton atuPastaXMLServ;

    private javax.swing.JLabel jLabel1;

    private javax.swing.JLabel jLabel2;
}
package solarex.ui.panels;

import javax.swing.JOptionPane;
import solarex.ui.ApplicationFrame;
import solarex.util.ComponentFactory;

/**
 * Loading and saving games, also general setup options go here.
 * 
 * @author Hj. Malthaner
 */
public class SetupPanel extends javax.swing.JPanel {

    private ApplicationFrame appFrame;

    public void setSeed(long seed) {
        seedField.setText("" + seed);
    }

    /** Creates new form SetupPanel */
    public SetupPanel(ApplicationFrame appFrame) {
        this.appFrame = appFrame;
        initComponents();
        ComponentFactory.customizeButton(createSystemButton);
        ComponentFactory.customizeButton(loadButton);
        ComponentFactory.customizeButton(randomSystemButton);
        ComponentFactory.customizeButton(saveButton);
        explorerCheck.setSelected(true);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {
        contentPanel = new javax.swing.JPanel();
        loadButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        randomSystemButton = new javax.swing.JButton();
        createSystemButton = new javax.swing.JButton();
        seedField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        explorerCheck = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        setBackground(java.awt.Color.black);
        setLayout(new java.awt.GridBagLayout());
        contentPanel.setBackground(new java.awt.Color(0, 51, 51));
        contentPanel.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.darkGray));
        contentPanel.setMinimumSize(new java.awt.Dimension(800, 600));
        contentPanel.setPreferredSize(new java.awt.Dimension(800, 600));
        contentPanel.setLayout(null);
        loadButton.setBackground(java.awt.Color.gray);
        loadButton.setText("Load Game");
        loadButton.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadButtonActionPerformed(evt);
            }
        });
        contentPanel.add(loadButton);
        loadButton.setBounds(100, 160, 120, 30);
        saveButton.setBackground(java.awt.Color.gray);
        saveButton.setText("Save Game");
        saveButton.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        contentPanel.add(saveButton);
        saveButton.setBounds(100, 120, 120, 30);
        randomSystemButton.setBackground(java.awt.Color.gray);
        randomSystemButton.setText("Create Random System");
        randomSystemButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        randomSystemButton.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                randomSystemButtonActionPerformed(evt);
            }
        });
        contentPanel.add(randomSystemButton);
        randomSystemButton.setBounds(370, 120, 170, 30);
        createSystemButton.setBackground(java.awt.Color.gray);
        createSystemButton.setText("Create System by Seed");
        createSystemButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        createSystemButton.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createSystemButtonActionPerformed(evt);
            }
        });
        contentPanel.add(createSystemButton);
        createSystemButton.setBounds(370, 160, 170, 30);
        seedField.setBackground(java.awt.Color.darkGray);
        seedField.setForeground(java.awt.Color.lightGray);
        seedField.setText("jTextField1");
        seedField.setCaretColor(java.awt.Color.orange);
        seedField.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seedFieldActionPerformed(evt);
            }
        });
        contentPanel.add(seedField);
        seedField.setBounds(560, 160, 180, 30);
        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 11));
        jLabel1.setForeground(java.awt.Color.cyan);
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("<html>Uncheck this to access all system info.<br>\nIf checked, you can only inspect data<br>\nfor systems which you have explored<br>\nalready, or which are generally known.</html>");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        contentPanel.add(jLabel1);
        jLabel1.setBounds(500, 260, 250, 70);
        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 18));
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("Save And Load Games");
        contentPanel.add(jLabel2);
        jLabel2.setBounds(100, 64, 260, 30);
        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 18));
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("Create Stellar Systems By Seed");
        contentPanel.add(jLabel3);
        jLabel3.setBounds(370, 64, 360, 30);
        explorerCheck.setForeground(java.awt.Color.green);
        explorerCheck.setText(" Explorer Mode");
        explorerCheck.setOpaque(false);
        explorerCheck.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                explorerCheckActionPerformed(evt);
            }
        });
        contentPanel.add(explorerCheck);
        explorerCheck.setBounds(370, 280, 120, 23);
        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 18));
        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setText("Game Mode");
        contentPanel.add(jLabel4);
        jLabel4.setBounds(370, 224, 270, 30);
        add(contentPanel, new java.awt.GridBagConstraints());
    }

    private void seedFieldActionPerformed(java.awt.event.ActionEvent evt) {
        long seed = System.currentTimeMillis();
        try {
            seed = Long.parseLong(seedField.getText());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        appFrame.makeSystem(seed);
    }

    private void createSystemButtonActionPerformed(java.awt.event.ActionEvent evt) {
        long seed = System.currentTimeMillis();
        try {
            seed = Long.parseLong(seedField.getText());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        appFrame.makeSystem(seed);
    }

    private void randomSystemButtonActionPerformed(java.awt.event.ActionEvent evt) {
        long seed = System.currentTimeMillis();
        setSeed(seed);
        appFrame.makeSystem(seed);
    }

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {
        boolean ok = appFrame.saveGame();
        if (ok) {
            JOptionPane.showMessageDialog(this, "Game saved sucessfully.");
        } else {
            JOptionPane.showMessageDialog(this, "Error while saving game.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void loadButtonActionPerformed(java.awt.event.ActionEvent evt) {
        boolean ok = appFrame.loadGame();
        if (ok) {
            JOptionPane.showMessageDialog(appFrame, "Game loaded sucessfully.");
        } else {
            JOptionPane.showMessageDialog(appFrame, "Error while loading game.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void explorerCheckActionPerformed(java.awt.event.ActionEvent evt) {
        appFrame.setExplorerMode(explorerCheck.isSelected());
    }

    private javax.swing.JPanel contentPanel;

    private javax.swing.JButton createSystemButton;

    private javax.swing.JCheckBox explorerCheck;

    private javax.swing.JLabel jLabel1;

    private javax.swing.JLabel jLabel2;

    private javax.swing.JLabel jLabel3;

    private javax.swing.JLabel jLabel4;

    private javax.swing.JButton loadButton;

    private javax.swing.JButton randomSystemButton;

    private javax.swing.JButton saveButton;

    private javax.swing.JTextField seedField;
}
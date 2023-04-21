package edacc;

import edacc.experiment.InstanceTableModel;
import edacc.experiment.TableColumnSelector;
import edacc.model.DatabaseConnector;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JTable;
import org.jdesktop.application.Action;

/**
 *
 * @author simon
 */
public class EDACCInstanceColumnSelection extends javax.swing.JDialog {

    private TableColumnSelector selector;

    private JCheckBox[] checkboxes;

    public EDACCInstanceColumnSelection(java.awt.Frame parent, boolean modal, TableColumnSelector selector) {
        this(parent, modal, selector, InstanceTableModel.COL_PROP);
    }

    /** Creates new form EDACCResultsBrowserColumnSelection */
    public EDACCInstanceColumnSelection(java.awt.Frame parent, boolean modal, TableColumnSelector selector, int COL_PROP) {
        super(parent, modal);
        this.selector = selector;
        initComponents();
        boolean[] visibility = selector.getColumnVisibility();
        checkboxes = new JCheckBox[visibility.length];
        pnlBasicColumns.setLayout(new GridBagLayout());
        GridBagConstraints basicColumnsConstraints = new GridBagConstraints();
        basicColumnsConstraints.gridx = 0;
        basicColumnsConstraints.weightx = 1;
        basicColumnsConstraints.fill = GridBagConstraints.HORIZONTAL;
        basicColumnsConstraints.gridy = 0;
        basicColumnsConstraints.gridheight = 1;
        basicColumnsConstraints.gridwidth = 1;
        basicColumnsConstraints.anchor = GridBagConstraints.WEST;
        GridBagConstraints resultPropertyColumnsConstraints = new GridBagConstraints();
        resultPropertyColumnsConstraints.gridx = 0;
        resultPropertyColumnsConstraints.weightx = 1;
        resultPropertyColumnsConstraints.fill = GridBagConstraints.HORIZONTAL;
        resultPropertyColumnsConstraints.gridy = 0;
        resultPropertyColumnsConstraints.gridheight = 1;
        resultPropertyColumnsConstraints.gridwidth = 1;
        resultPropertyColumnsConstraints.anchor = GridBagConstraints.WEST;
        GridBagConstraints instancePropertyColumnsConstraints = new GridBagConstraints();
        instancePropertyColumnsConstraints.gridx = 0;
        instancePropertyColumnsConstraints.weightx = 1;
        instancePropertyColumnsConstraints.weighty = 1;
        instancePropertyColumnsConstraints.fill = GridBagConstraints.HORIZONTAL;
        instancePropertyColumnsConstraints.gridy = 0;
        instancePropertyColumnsConstraints.gridheight = 1;
        instancePropertyColumnsConstraints.gridwidth = 1;
        instancePropertyColumnsConstraints.anchor = GridBagConstraints.WEST;
        boolean isCompetitionDB;
        try {
            isCompetitionDB = DatabaseConnector.getInstance().isCompetitionDB();
        } catch (Exception e) {
            isCompetitionDB = false;
        }
        if (!isCompetitionDB) {
            COL_PROP--;
        }
        pnlInstancePropertyColumns.setLayout(new GridBagLayout());
        for (int i = 0; i < checkboxes.length; i++) {
            checkboxes[i] = new JCheckBox(selector.getColumnName(i), visibility[i]);
            checkboxes[i].setVisible(true);
            if (i < COL_PROP) {
                pnlBasicColumns.add(checkboxes[i], basicColumnsConstraints);
                basicColumnsConstraints.gridy++;
            } else {
                pnlInstancePropertyColumns.add(checkboxes[i], instancePropertyColumnsConstraints);
                instancePropertyColumnsConstraints.gridy++;
            }
        }
        instancePropertyColumnsConstraints.gridy++;
        instancePropertyColumnsConstraints.weighty = 100000;
        pnlInstancePropertyColumns.add(new JPanel(), instancePropertyColumnsConstraints);
        jPanel1.setPreferredSize(new Dimension(0, pnlBasicColumns.getPreferredSize().height + pnlInstancePropertyColumns.getPreferredSize().height));
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        pnlBasicColumns = new javax.swing.JPanel();
        pnlInstancePropertyColumns = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(edacc.EDACCApp.class).getContext().getResourceMap(EDACCInstanceColumnSelection.class);
        setTitle(resourceMap.getString("Form.title"));
        setMinimumSize(new java.awt.Dimension(400, 300));
        setName("Form");
        jScrollPane1.setMaximumSize(new java.awt.Dimension(32767, 100));
        jScrollPane1.setName("jScrollPane1");
        jScrollPane1.getVerticalScrollBar().setUnitIncrement(30);
        jPanel1.setMaximumSize(new java.awt.Dimension(32767, 100));
        jPanel1.setName("jPanel1");
        jPanel1.setPreferredSize(new java.awt.Dimension(0, 300));
        jPanel1.setLayout(new java.awt.GridBagLayout());
        pnlBasicColumns.setBorder(javax.swing.BorderFactory.createTitledBorder(resourceMap.getString("pnlBasicColumns.border.title")));
        pnlBasicColumns.setName("pnlBasicColumns");
        javax.swing.GroupLayout pnlBasicColumnsLayout = new javax.swing.GroupLayout(pnlBasicColumns);
        pnlBasicColumns.setLayout(pnlBasicColumnsLayout);
        pnlBasicColumnsLayout.setHorizontalGroup(pnlBasicColumnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 451, Short.MAX_VALUE));
        pnlBasicColumnsLayout.setVerticalGroup(pnlBasicColumnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 0, Short.MAX_VALUE));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        jPanel1.add(pnlBasicColumns, gridBagConstraints);
        pnlInstancePropertyColumns.setBorder(javax.swing.BorderFactory.createTitledBorder(resourceMap.getString("pnlInstancePropertyColumns.border.title")));
        pnlInstancePropertyColumns.setName("pnlInstancePropertyColumns");
        javax.swing.GroupLayout pnlInstancePropertyColumnsLayout = new javax.swing.GroupLayout(pnlInstancePropertyColumns);
        pnlInstancePropertyColumns.setLayout(pnlInstancePropertyColumnsLayout);
        pnlInstancePropertyColumnsLayout.setHorizontalGroup(pnlInstancePropertyColumnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 451, Short.MAX_VALUE));
        pnlInstancePropertyColumnsLayout.setVerticalGroup(pnlInstancePropertyColumnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 246, Short.MAX_VALUE));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(pnlInstancePropertyColumns, gridBagConstraints);
        jScrollPane1.setViewportView(jPanel1);
        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);
        jPanel2.setName("jPanel2");
        jPanel2.setPreferredSize(new java.awt.Dimension(399, 50));
        javax.swing.ActionMap actionMap = org.jdesktop.application.Application.getInstance(edacc.EDACCApp.class).getContext().getActionMap(EDACCInstanceColumnSelection.class, this);
        jButton1.setAction(actionMap.get("btnSelect"));
        jButton1.setText(resourceMap.getString("jButton1.text"));
        jButton1.setName("jButton1");
        jButton2.setAction(actionMap.get("btnAbort"));
        jButton2.setText(resourceMap.getString("jButton2.text"));
        jButton2.setName("jButton2");
        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 310, Short.MAX_VALUE).addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE).addContainerGap()));
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup().addContainerGap(16, Short.MAX_VALUE).addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jButton1).addComponent(jButton2)).addContainerGap()));
        getContentPane().add(jPanel2, java.awt.BorderLayout.SOUTH);
        pack();
    }

    @Action
    public void btnSelect() {
        boolean[] visibility = new boolean[checkboxes.length];
        for (int i = 0; i < visibility.length; i++) {
            visibility[i] = checkboxes[i].isSelected();
        }
        selector.setColumnVisiblity(visibility);
        this.dispose();
    }

    @Action
    public void btnAbort() {
        this.dispose();
    }

    private javax.swing.JButton jButton1;

    private javax.swing.JButton jButton2;

    private javax.swing.JPanel jPanel1;

    private javax.swing.JPanel jPanel2;

    private javax.swing.JScrollPane jScrollPane1;

    private javax.swing.JPanel pnlBasicColumns;

    private javax.swing.JPanel pnlInstancePropertyColumns;
}
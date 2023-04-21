package zimoch.mordheim;

import javax.swing.JPanel;

/**
 *
 * @author Piotr Grudzień
 */
public class Board extends javax.swing.JFrame {

    /** Creates new form Board */
    public Board() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {
        boardPanel = new javax.swing.JPanel();
        jScrollBarY = new javax.swing.JScrollBar();
        jScrollBarX = new javax.swing.JScrollBar();
        java.awt.Canvas board = new zimoch.mordheim.JBoard();
        buttonPanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        heroPanel = new javax.swing.JPanel();
        sChooseHero = new javax.swing.JScrollBar();
        lWSDesc = new javax.swing.JLabel();
        lBSDesc = new javax.swing.JLabel();
        lStrDesc = new javax.swing.JLabel();
        lTghDesc = new javax.swing.JLabel();
        lIniDesc = new javax.swing.JLabel();
        lLdDesc = new javax.swing.JLabel();
        lMovDesc = new javax.swing.JLabel();
        lMov = new javax.swing.JLabel();
        lWS = new javax.swing.JLabel();
        lBS = new javax.swing.JLabel();
        lTgh = new javax.swing.JLabel();
        lIni = new javax.swing.JLabel();
        lStr = new javax.swing.JLabel();
        lLd = new javax.swing.JLabel();
        lXDesc = new javax.swing.JLabel();
        lYDesc = new javax.swing.JLabel();
        lX = new javax.swing.JLabel();
        lY = new javax.swing.JLabel();
        lHeroDesc = new javax.swing.JLabel();
        tHeroName = new javax.swing.JTextField();
        tBandName = new javax.swing.JTextField();
        lBandDesc = new javax.swing.JLabel();
        tHeroType = new javax.swing.JTextField();
        lTypeDesc = new javax.swing.JLabel();
        mmenu = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        boardPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollBarX.setOrientation(javax.swing.JScrollBar.HORIZONTAL);
        javax.swing.GroupLayout boardPanelLayout = new javax.swing.GroupLayout(boardPanel);
        boardPanel.setLayout(boardPanelLayout);
        boardPanelLayout.setHorizontalGroup(boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(boardPanelLayout.createSequentialGroup().addGroup(boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(boardPanelLayout.createSequentialGroup().addContainerGap().addComponent(jScrollBarY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jScrollBarX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addGroup(boardPanelLayout.createSequentialGroup().addGap(100, 100, 100).addComponent(board, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))).addContainerGap(63, Short.MAX_VALUE)));
        boardPanelLayout.setVerticalGroup(boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(boardPanelLayout.createSequentialGroup().addComponent(jScrollBarX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(6, 6, 6).addComponent(jScrollBarY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addContainerGap(565, Short.MAX_VALUE)).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, boardPanelLayout.createSequentialGroup().addContainerGap(70, Short.MAX_VALUE).addComponent(board, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(65, 65, 65)));
        buttonPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.setText("Recovery");
        jButton2.setText("Charge");
        jButton3.setText("Movmement");
        jButton4.setText("Shooting");
        jButton5.setText("Combat");
        javax.swing.GroupLayout buttonPanelLayout = new javax.swing.GroupLayout(buttonPanel);
        buttonPanel.setLayout(buttonPanelLayout);
        buttonPanelLayout.setHorizontalGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(buttonPanelLayout.createSequentialGroup().addGap(48, 48, 48).addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jButton3).addComponent(jButton1).addComponent(jButton2).addComponent(jButton5).addComponent(jButton4)).addContainerGap(47, Short.MAX_VALUE)));
        buttonPanelLayout.setVerticalGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(buttonPanelLayout.createSequentialGroup().addContainerGap().addComponent(jButton1).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jButton2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jButton4).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jButton5).addContainerGap(27, Short.MAX_VALUE)));
        heroPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        sChooseHero.setOrientation(javax.swing.JScrollBar.HORIZONTAL);
        lWSDesc.setText("WS");
        lBSDesc.setText("BS");
        lStrDesc.setText("Str");
        lTghDesc.setText("Tgh");
        lIniDesc.setText("Ini");
        lLdDesc.setText("Ld");
        lMovDesc.setText("Mov");
        lMov.setText("0");
        lWS.setText("0");
        lBS.setText("0");
        lTgh.setText("0");
        lIni.setText("0");
        lStr.setText("0");
        lLd.setText("0");
        lXDesc.setText("X");
        lYDesc.setText("Y");
        lX.setText("0");
        lY.setText("0");
        lHeroDesc.setText("Name");
        tHeroName.setEditable(false);
        tHeroName.setText("HeroName");
        tBandName.setEditable(false);
        tBandName.setText("BandName");
        lBandDesc.setText("Band");
        tHeroType.setEditable(false);
        tHeroType.setText("Type");
        lTypeDesc.setText("Type");
        javax.swing.GroupLayout heroPanelLayout = new javax.swing.GroupLayout(heroPanel);
        heroPanel.setLayout(heroPanelLayout);
        heroPanelLayout.setHorizontalGroup(heroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(sChooseHero, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE).addGroup(heroPanelLayout.createSequentialGroup().addContainerGap().addGroup(heroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(heroPanelLayout.createSequentialGroup().addGroup(heroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(lMovDesc).addComponent(lMov)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(heroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(lWSDesc).addComponent(lWS)).addGap(12, 12, 12).addGroup(heroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(lBSDesc).addComponent(lBS)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(heroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(lStrDesc).addComponent(lStr)).addGap(12, 12, 12).addGroup(heroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(lTghDesc).addComponent(lTgh)).addGap(10, 10, 10).addGroup(heroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(lIni).addComponent(lIniDesc)).addGap(15, 15, 15).addGroup(heroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(lLd).addComponent(lLdDesc))).addGroup(heroPanelLayout.createSequentialGroup().addComponent(lXDesc).addGap(18, 18, 18).addComponent(lYDesc)).addGroup(heroPanelLayout.createSequentialGroup().addComponent(lX).addGap(18, 18, 18).addComponent(lY))).addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)).addGroup(heroPanelLayout.createSequentialGroup().addContainerGap().addGroup(heroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(lHeroDesc).addComponent(lTypeDesc).addComponent(lBandDesc)).addGap(7, 7, 7).addGroup(heroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(tBandName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(tHeroName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(tHeroType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addContainerGap(87, Short.MAX_VALUE)));
        heroPanelLayout.setVerticalGroup(heroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(heroPanelLayout.createSequentialGroup().addComponent(sChooseHero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(18, 18, 18).addGroup(heroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(tBandName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(lBandDesc)).addGap(12, 12, 12).addGroup(heroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(tHeroName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(lHeroDesc)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(heroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(tHeroType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(lTypeDesc)).addGap(45, 45, 45).addGroup(heroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(heroPanelLayout.createSequentialGroup().addComponent(lMovDesc).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(lMov)).addGroup(heroPanelLayout.createSequentialGroup().addGroup(heroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(lLdDesc).addComponent(lIniDesc).addComponent(lTghDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(lStrDesc).addComponent(lBSDesc).addComponent(lWSDesc)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(heroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(lIni).addComponent(lLd).addComponent(lTgh).addComponent(lStr).addComponent(lBS).addComponent(lWS)))).addGap(30, 30, 30).addGroup(heroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(lXDesc).addComponent(lYDesc)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(heroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(lX).addComponent(lY)).addContainerGap(190, Short.MAX_VALUE)));
        jMenu1.setText("File");
        mmenu.add(jMenu1);
        jMenu2.setText("Edit");
        mmenu.add(jMenu2);
        setJMenuBar(mmenu);
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addComponent(boardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(heroPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(buttonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)).addContainerGap()));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(buttonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(heroPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)).addComponent(boardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addContainerGap()));
        pack();
    }

    public void setHeroPanel(zimoch.mordheim.UnitComplexType unit) {
        tHeroType.setText(unit.getType());
        tHeroName.setText(unit.getName());
        lBS.setText(new Integer(unit.getBalisticskill()).toString());
        lWS.setText(new Integer(unit.getWeaponskill()).toString());
        lStr.setText(new Integer(unit.getStreght()).toString());
        lTgh.setText(new Integer(unit.getToughness()).toString());
        lMov.setText(new Integer(unit.getMovement()).toString());
        lIni.setText(new Integer(unit.getInitiative()).toString());
        lLd.setText(new Integer(unit.getLeadership()).toString());
    }

    private javax.swing.JPanel boardPanel;

    private javax.swing.JPanel buttonPanel;

    private javax.swing.JPanel heroPanel;

    private javax.swing.JButton jButton1;

    private javax.swing.JButton jButton2;

    private javax.swing.JButton jButton3;

    private javax.swing.JButton jButton4;

    private javax.swing.JButton jButton5;

    private javax.swing.JMenu jMenu1;

    private javax.swing.JMenu jMenu2;

    private javax.swing.JScrollBar jScrollBarX;

    private javax.swing.JScrollBar jScrollBarY;

    private javax.swing.JLabel lBS;

    private javax.swing.JLabel lBSDesc;

    private javax.swing.JLabel lBandDesc;

    private javax.swing.JLabel lHeroDesc;

    private javax.swing.JLabel lIni;

    private javax.swing.JLabel lIniDesc;

    private javax.swing.JLabel lLd;

    private javax.swing.JLabel lLdDesc;

    private javax.swing.JLabel lMov;

    private javax.swing.JLabel lMovDesc;

    private javax.swing.JLabel lStr;

    private javax.swing.JLabel lStrDesc;

    private javax.swing.JLabel lTgh;

    private javax.swing.JLabel lTghDesc;

    private javax.swing.JLabel lTypeDesc;

    private javax.swing.JLabel lWS;

    private javax.swing.JLabel lWSDesc;

    private javax.swing.JLabel lX;

    private javax.swing.JLabel lXDesc;

    private javax.swing.JLabel lY;

    private javax.swing.JLabel lYDesc;

    private javax.swing.JMenuBar mmenu;

    private javax.swing.JScrollBar sChooseHero;

    private javax.swing.JTextField tBandName;

    private javax.swing.JTextField tHeroName;

    private javax.swing.JTextField tHeroType;
}